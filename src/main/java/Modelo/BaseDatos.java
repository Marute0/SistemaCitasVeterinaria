/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ususario
 */
public class BaseDatos {
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/SistemaCitasVeterinaria";
    private Connection connection;  // Agregamos la conexión como campo
    private Statement statement;
    
    public BaseDatos() {
        try {
            // 1. Establecer conexión
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Nuevo método para obtener PreparedStatement
    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }

    // Método para operaciones que necesitan retornar claves generadas
    public PreparedStatement getPreparedStatementWithKeys(String sql) throws SQLException {
        return connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }

    // Mantenemos el método existente por compatibilidad (pero debería deprecarse)
    public Statement getStatement() {
        return statement;
    }

    // Método para cerrar la conexión
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
