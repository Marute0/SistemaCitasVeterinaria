/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ususario
 */
public class BaseDatos {
    private String user = "root"; //Usuario 
    private String pass = ""; //Contraseña
    private String url = "jdbc:mysql://localhost:3306/SistemaCitasVeterinaria"; //RutaBasedeDatos
    private Statement statement;
    
    public BaseDatos(){
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return statement;
    }
    
    
    
    
    
    
}
