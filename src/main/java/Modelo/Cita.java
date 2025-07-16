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
    private String idCita;
    private Mascota mascota;
    private Dueño dueño;
    private DoctorVeterinario doctor;
    private LocalDate fecha;
    private int nivelPrioridad;

    //Constructor
    public Cita(String idCita, Dueño dueño, DoctorVeterinario doctor, LocalDate fecha, int nivelPrioridad) {
        this.idCita = idCita;
        this.dueño = dueño;
        this.doctor = doctor;
        this.fecha = fecha;
        this.nivelPrioridad = nivelPrioridad;
    }

    
    //Getters
    public String getIdCita() {
        return idCita;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public DoctorVeterinario getDoctor() {
        return doctor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    //Setters
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public void setDoctor(DoctorVeterinario doctor) {
        this.doctor = doctor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    //Método para posterior guargado en la base de datos
    @Override
    public String toString() {
        return "Cita{idmascota=" + mascota.getID() +
                ", idDueño='" + dueño.getID() +
                "', idCita='" + idCita +  
                "', Fecha='" + fecha +
                "', prioridad=" + nivelPrioridad + "}";
    }
    
}
