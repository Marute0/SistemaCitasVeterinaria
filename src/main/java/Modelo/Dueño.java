/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ususario
 */
public class Dueño extends Persona{
    private String direccion;

    //método constructor
    public Dueño(String dirección, String nombre, String apellido, int ID, String email, String numeroTelefono) {
        super(nombre, apellido, ID, email, numeroTelefono);
        this.direccion = dirección;
    }

    
    //getters and setters
    public String getDirección() {
        return direccion;
    }

    public void setDirección(String dirección) {
        this.direccion = dirección;
    }
    
    
    @Override
    public String mostrarInformación(){
        return getNombre() + " " + 
               getApellido() + "," + 
               getID() + "," + 
               getEmail() + "," + 
               getNumeroTelefono(); 
    }
    
}

