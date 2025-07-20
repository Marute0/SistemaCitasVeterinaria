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
public class LoginAdmin {
    private BaseDatos baseDatos;
    private final GeneradorContraseñas generadorContraseñas;

    //Constructor
    public LoginAdmin(BaseDatos baseDatos, GeneradorContraseñas generadorContraseñas) {
        this.baseDatos = baseDatos;
        this.generadorContraseñas = generadorContraseñas;
    }
    
    
    //Crea el admin si ve que no existe en la base de datos
    public boolean crearUsuarioAdminAutomatico() {
        
        String nombre = "Admin";
        String apellido = "Principal";
        String nDocumento = "00000000"; // Documento predeterminado
        String email = "admin@veterinaria.com";
        String telefono = "555-0000";
        String contraseña = generadorContraseñas.generarContraseñaTemporal();
        // Crear usuario en BD
        String sql = "INSERT INTO `administradores` ( `nombre`,`apellido`, `nDocumento`, `email`, `numeroTelefono`, `contraseña`) "
                + "VALUES (?,?,?,?,?,?))";
        
        try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, apellido);
                pstmt.setString(3, nDocumento);
                pstmt.setString(4, email);
                pstmt.setString(5, telefono);
                pstmt.setString(6, contraseña);

                int filasAfectadas = pstmt.executeUpdate();
                return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
                return false;
        }
    }

    
        public boolean verificarCredencialesAdmin(String nDocumento, String contraseñaIngresada) {
        String sql = "SELECT `contraseña` FROM `administradores` WHERE `nDocumento` = ?";

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
