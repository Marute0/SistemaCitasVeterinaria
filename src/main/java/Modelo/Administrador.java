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

    public Administrador(String nombre, String apellido, int ID, String email, String numeroTelefono) {
        super(nombre, apellido, ID, email, numeroTelefono);
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
        return getNombre() + " " + 
               getApellido() + "," + 
               getID() + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," +
               contraseña;
    }
        
        
}
