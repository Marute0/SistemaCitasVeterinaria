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

    public Dueño(int ID, String nombre, String apellido, String nDocumento, String email, String numeroTelefono, String direccion) {
        super(ID, nombre, apellido, nDocumento, email, numeroTelefono);
        this.direccion = direccion;
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

