/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Ususario
 */
public class Cita {
    //Atributos
    private String ID;
    private String idDueño;
    private String idMascota;
    private String idDoctor;
    private LocalDate fecha;
    private int nivelPrioridad;

    //Constructor

    public Cita(String ID, String idDueño, String idMascota, String idDoctor, LocalDate fecha, int nivelPrioridad) {
        this.ID = ID;
        this.idDueño = idDueño;
        this.idMascota = idMascota;
        this.idDoctor = idDoctor;
        this.fecha = fecha;
        this.nivelPrioridad = nivelPrioridad;
    }

    //Getters
   
    public LocalDate getFecha() {
        return fecha;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public String getID() {
        return ID;
    }

    public String getIdDueño() {
        return idDueño;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    
    //Setters

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setIdDueño(String idDueño) {
        this.idDueño = idDueño;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
}
