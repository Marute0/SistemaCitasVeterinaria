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
        private String nombre;
        private String apellido;
        private String id;
        private String email;
        private String numeroTelefono;

    public Persona(String nombre, String apellido, String id, String email, String numeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
        
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public abstract String mostrarInformación();
    
        
}
