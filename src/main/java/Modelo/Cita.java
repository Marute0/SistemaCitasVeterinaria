/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Ususario
 */
public class Cita {
    //Atributos
    private int ID;
    private DoctorVeterinario doctor;
    private Dueño dueño;
    private Mascota mascota;
    private LocalDateTime fecha;
    private Prioridad nivelPrioridad;

    public enum Prioridad {
        ALTA, MEDIA, BAJA;
        
        // Convertir desde String (útil para lectura de BD)
        public static Prioridad fromString(String value) {
            return valueOf(value.toUpperCase());
        }
    }
    
    
    //Constructor

    public Cita() {
    }
    
    
    public Cita(int ID, DoctorVeterinario doctor, Dueño dueño, Mascota mascota, LocalDateTime fecha, Prioridad nivelPrioridad) {
        this.ID = ID;
        this.doctor = doctor;
        this.dueño = dueño;
        this.mascota = mascota;
        this.fecha = fecha;
        this.nivelPrioridad = nivelPrioridad;
    }



    //Getters
   
    public LocalDateTime getFecha() {
        return fecha;
    }

    public Prioridad getNivelPrioridad() {
        return nivelPrioridad;
    }

    public int getID() {
        return ID;
    }

    public DoctorVeterinario getDoctor() {
        return doctor;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public Mascota getMascota() {
        return mascota;
    }

    
    //Setters

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDoctor(DoctorVeterinario doctor) {
        this.doctor = doctor;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setNivelPrioridad(Prioridad nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }
    
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    
}
