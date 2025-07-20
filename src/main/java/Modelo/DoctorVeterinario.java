package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ususario
 */
public class DoctorVeterinario extends Persona{
    //Atributos
    private String contraseña;
    private String especializacion;

     //Constructor

    public DoctorVeterinario(int ID, String nombre, String apellido, String nDocumento, String email, String numeroTelefono, String contraseña, String especializacion) {
        super(ID, nombre, apellido, nDocumento, email, numeroTelefono);
        this.contraseña = contraseña;
        this.especializacion = especializacion;
    }

    //Getters anda setters
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }


    
    @Override
    public String mostrarInformación() {
        return getNombre() + " " + 
               getApellido() + "," + 
               contraseña + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," + 
               especializacion + ",";
    }

}
