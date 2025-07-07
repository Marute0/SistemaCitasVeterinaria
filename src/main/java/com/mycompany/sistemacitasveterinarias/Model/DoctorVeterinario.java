package com.mycompany.sistemacitasveterinarias.Model;

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
    private String usuario;
    private String contraseña;
    private String especializacion;
    private String idEmpresarial;

     //Constructor

    public DoctorVeterinario(String usuario, String contraseña, String especializacion, String idEmpresarial, String nombre, String apellido, String id, String email, String numeroTelefono) {
        super(nombre, apellido, id, email, numeroTelefono);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.especializacion = especializacion;
        this.idEmpresarial = idEmpresarial;
    }
   

    //Getters
    public String getEspecializacion() {
        return especializacion;
    }

    public String getIdEmpresarial() {
        return idEmpresarial;
    }

    //Setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    @Override
    public String mostrarInformación() {
        return getNombre() + " " + 
               getApellido() + "," + 
               usuario + "," + 
               contraseña + "," + 
               getId() + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," + 
               idEmpresarial + "," + 
               especializacion + ",";
    }

}
