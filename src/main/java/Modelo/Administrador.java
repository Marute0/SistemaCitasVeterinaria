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
        private String usuario;
        private String contraseña;

    //Constructor

    public Administrador(String usuario, String contraseña, String nombre, String apellido, String id, String email, String numeroTelefono) {
        super(nombre, apellido, id, email, numeroTelefono);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    //Getters
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    
    //Setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    //Método para posterior guargado en la base de datos
    @Override
    public String mostrarInformación() {
        return getNombre() + " " + 
               getApellido() + "," + 
               getId() + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," + 
               usuario + "," +
               contraseña;
    }
        
        
}
