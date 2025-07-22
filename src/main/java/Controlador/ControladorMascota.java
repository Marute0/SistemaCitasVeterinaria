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
    public boolean mascotaEsCreada() {
         // Validar valores ENUM
        if (!validarTipo(M.getTipo().name())) return false;
        if (!validarSexo(M.getSexo().name())) return false;
        
        String sql = "INSERT INTO `mascotas`(`nombre`, `edad`, `tipo`, `raza`, `sexo`, `peso`, `ID_dueño`) "
                + "VALUES (?,?,?,?,?,?,?)";

            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, M.getNombre());
                pstmt.setInt(2, M.getEdad());
                pstmt.setString(3, M.getTipo().name());
                pstmt.setString(4, M.getRaza());
                pstmt.setString(5, M.getSexo().name());
                pstmt.setFloat(6, M.getPeso());
                pstmt.setInt(7, M.getIdDueño());

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    

    
    //Lee las mascotas en la base de datos, util para las tablas!
    public ControladorMascota(BaseDatos basedatos) {
        String select = "SELECT * FROM `mascotas`;";
        
        
        try {
            ResultSet rs = basedatos.getStatement().executeQuery(select);
            while (rs.next()) {
                Mascota.Tipo tipo = Mascota.Tipo.fromString(rs.getString("tipo"));
                Mascota.Sexo sexo = Mascota.Sexo.fromString(rs.getString("Sexo"));                
                
                Mascota mascota = new Mascota(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getInt("edad"),
                    tipo,  // ENUM 
                    rs.getString("raza"),
                    sexo,   // ENUM 
                    rs.getFloat("peso"),
                    rs.getInt("ID_dueño")
                );
                mascotas.add(mascota);
            }
        } catch (SQLException e) {
            System.err.println("Error cargando mascotas: " + e.getMessage());
            // Manejo de error más robusto
    }

    }
    
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
     
        //Valida si se puso o no los campos predeterminados por la base de datos
    private boolean validarTipo(String tipo) {
        return Arrays.asList("PERRO", "GATO", "AVE", "ROEDOR", "OTRO").contains(tipo);
    }

    private boolean validarSexo(String sexo) {
        return Arrays.asList("FEMENINO", "MASCULINO").contains(sexo);
    }
    
    //Elimina la mascota y a las citas asociadas a la misma debido al cascade de la base de datos
    
    public boolean eliminarMascota(int idMascota) throws SQLException {
        String sql = "DELETE FROM `mascotas` WHERE ID = ?";
        try (Connection conn = baseDatos.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idMascota);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    
}
