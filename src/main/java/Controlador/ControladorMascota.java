/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Mascota;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ususario
 */
public class ControladorMascota {
    private Mascota M;
    private BaseDatos baseDatos;

    public ControladorMascota(Mascota M, BaseDatos baseDatos) {
        this.M = M;
        this.baseDatos = baseDatos;
    }
    
    public boolean mascotaEsCreada() {
        String sql = "INSERT INTO `mascotas`(`nombre`, `edad`, `tipo`, `raza`, `sexo`, `peso`, `ID_dueño`) "
                + "VALUES (?,?,?,?,?,?,?)";

            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, M.getNombre());
                pstmt.setInt(2, M.getEdad());
                pstmt.setString(3, M.getTipo());
                pstmt.setString(4, M.getRaza());
                pstmt.setString(5, M.getSexo());
                pstmt.setFloat(6, M.getPeso());
                pstmt.setInt(7, M.getIdDueño());

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    
}
