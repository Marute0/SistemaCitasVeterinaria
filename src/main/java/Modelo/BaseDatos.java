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
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/SistemaCitasVeterinaria"
                            + "?useSSL=false"
                            + "&serverTimezone=UTC"
                            + "&allowPublicKeyRetrieval=true";
    
    private Connection connection;
    
    public BaseDatos() {
        try {
            // 1. Registrar el driver explícitamente (IMPORTANTE)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establecer conexión con parámetros seguros
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos");
            
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: Driver JDBC no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("ERROR al conectar a la base de datos");
            e.printStackTrace();
        }
    }

    // Método para obtener PreparedStatement (mejorado)
    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        if (connection == null || connection.isClosed()) {
            throw new SQLException("Conexión no disponible");
        }
        return connection.prepareStatement(sql);
    }

    // Método para operaciones que necesitan retornar claves generadas
    public PreparedStatement getPreparedStatementWithKeys(String sql) throws SQLException {
        if (connection == null || connection.isClosed()) {
            throw new SQLException("Conexión no disponible");
        }
        return connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }

    // Método para obtener Statement (con verificación de conexión)
    public Statement getStatement() throws SQLException {
        if (connection == null || connection.isClosed()) {
            throw new SQLException("Conexión no disponible");
        }
        return connection.createStatement();
    }

    // Método para cerrar la conexión (mejorado)
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión");
            e.printStackTrace();
        }
    }
    
    // Método para verificar si la conexión está activa
    public boolean isConnected() {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
