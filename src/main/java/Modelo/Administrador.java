/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author Ususario
 */
public class Administrador extends Persona{
    //Atributos
        private String contraseña;

        
    //Constructor
    public Administrador(int ID, String nombre, String apellido, String nDocumento, String email, String numeroTelefono, String contraseña) {
        super(ID, nombre, apellido, nDocumento, email, numeroTelefono);
        this.contraseña = contraseña;
    }    
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    //Método para posterior guargado en la base de datos

    @Override
    public String mostrarInformación() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
        
        
}
