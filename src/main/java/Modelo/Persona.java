/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ususario
 */
public abstract class Persona {
        private int ID;
        private String nombre;
        private String apellido;
        private String email;
        private String numeroTelefono;

    public Persona(String nombre, String apellido, int ID, String email, String numeroTelefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }




        
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public abstract String mostrarInformación();
    
        
}
