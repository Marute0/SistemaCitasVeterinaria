/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ususario
 */
public class ControladorMascota {
    private Mascota M;
    private BaseDatos baseDatos;
    public ArrayList<Mascota> mascotas;

    public ControladorMascota(Mascota M, BaseDatos baseDatos) {
        this.M = M;
        this.baseDatos = baseDatos;
    }
        
   //crea la mascota
    public boolean crearMascota(Mascota M, String nDocumentoDueño) {
        
        int idDueño = obtenerIdDueñoPorDocumento(nDocumentoDueño);  // Busca el ID del dueño

        if (idDueño == -1) {
            System.out.println("No se encontró el dueño con el documento proporcionado.");
            return false;  // Si no se encuentra el dueño, no se crea la mascota
        }

        // Insertar la mascota con el ID del dueño
        String sql = "INSERT INTO `mascotas` (`nombre`, `tipo`, `raza`, `sexo`, `idDueño`) "
                     + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
            pstmt.setString(1, M.getNombre());
            pstmt.setString(2, M.getTipo().name());
            pstmt.setString(3, M.getRaza());
            pstmt.setString(4, M.getSexo().name());
            pstmt.setInt(5, idDueño);  // Asociamos el ID del dueño existente

            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
        public int obtenerIdDueñoPorDocumento(String nDocumento) {
        String sql = "SELECT ID FROM `dueños` WHERE `nDocumento` = ?";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
            pstmt.setString(1, nDocumento);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("ID");  // Devuelve el ID del dueño encontrado
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;  // Si no se encuentra, retorna -1
    }
    
    //Lee las mascotas en la base de datos, util para las tablas!
    public ArrayList<Mascota> obtenerMascotas() {
    ArrayList<Mascota> lista = new ArrayList<>();
    this.baseDatos = new BaseDatos();
    
    String sql = "SELECT * FROM mascotas ORDER BY nombre";

    try (PreparedStatement stmt = baseDatos.getPreparedStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Mascota.Tipo tipo = Mascota.Tipo.fromString(rs.getString("tipo"));
            Mascota.Sexo sexo = Mascota.Sexo.fromString(rs.getString("sexo"));

            Mascota mascota = new Mascota(
                rs.getInt("ID"),
                rs.getString("nombre"),
                tipo,
                rs.getString("raza"),
                sexo,
                rs.getInt("ID_dueño")
            );
            lista.add(mascota);
        }

    } catch (SQLException e) {
        System.err.println("Error cargando mascotas: " + e.getMessage());
    }

    return lista;
}
    
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
     
        //Valida si se puso o no los campos predeterminados por la base de datos
    private boolean validarTipo(String tipo) {
        return Arrays.asList("PERRO", "GATO", "AVE", "ROEDOR", "OTRO").contains(tipo);
    }

    private boolean validarSexo(String sexo) {
        return Arrays.asList("HEMBRA", "MACHO").contains(sexo);
    }
    
    //Elimina la mascota y a las citas asociadas a la misma debido al cascade de la base de datos
    
    public boolean eliminarMascota(int idMascota) throws SQLException {
        String sql = "DELETE FROM `mascotas` WHERE `ID` = ?";
        try (Connection conn = baseDatos.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idMascota);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

public boolean mascotaExiste(String nombreMascota, String cedulaDueño) {
    int idDueño = obtenerIdDueñoPorDocumento(cedulaDueño);
    if (idDueño == -1) return false;

    String sql = "SELECT * FROM mascotas WHERE nombre = ? AND idDueño = ?";
    try (PreparedStatement stmt = baseDatos.getPreparedStatement(sql)) {
        stmt.setString(1, nombreMascota);
        stmt.setInt(2, idDueño);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    
}
