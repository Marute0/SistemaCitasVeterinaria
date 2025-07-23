/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ususario
 */
public class LoginDoctor {
    private BaseDatos baseDatos;

    //Constructor
    public LoginDoctor(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    //Verifica las credenciales del doctor
        public boolean verificarCredencialesDoctor(String nDocumento, String contraseñaIngresada) {
        String sql = "SELECT * FROM `doctoresveterinarios` WHERE `nDocumento` = ? AND `contraseña` = ?";

        try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
            pstmt.setString(1, nDocumento);
            pstmt.setString(2, contraseñaIngresada);
            return pstmt.executeQuery().next();
        
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
