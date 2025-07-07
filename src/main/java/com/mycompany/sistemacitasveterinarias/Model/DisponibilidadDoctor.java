/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacitasveterinarias.Model;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ususario
 */
public class DisponibilidadDoctor {
    private static final Logger LOGGER = Logger.getLogger(DisponibilidadDoctor.class.getName());
    
    //Atributos
    private DoctorVeterinario doctor;
    private String fecha;
    private String tiempoInicio;
    private String tiempofinal;
    private int conteoCitas;

    //Constructor
    public DisponibilidadDoctor(DoctorVeterinario doctor, String fecha, String tiempoInicio, String tiempofinal, int conteoCitas) {
        this.doctor = doctor;
        this.fecha = fecha;
        this.tiempoInicio = tiempoInicio;
        this.tiempofinal = tiempofinal;
        this.conteoCitas = conteoCitas;
    }

    //Getters
    public static Logger getLOGGER() {
        return LOGGER;
    }

    public DoctorVeterinario getDoctor() {
        return doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTiempoInicio() {
        return tiempoInicio;
    }

    public String getTiempofinal() {
        return tiempofinal;
    }

    public int getConteoCitas() {
        return conteoCitas;
    }

    public void setConteoCitas(int conteoCitas) {
        this.conteoCitas = conteoCitas;
    }
    
    
    //Método para transformar fechas a un mismo formato
    public LocalTime getStartTimeAsLocalTime() {
        try {
            return LocalTime.parse(tiempoInicio);
        } catch (DateTimeParseException e) {
            LOGGER.log(Level.WARNING, "Tiempo de inicio invalido: {0}, ajustando a 00:00", tiempoInicio);
            return LocalTime.of(0, 0);
        }
    }
    
    
    @Override
        public String toString() {
        return "Disponibilidad{"+
                "idEmpresarial doctor= " + doctor.getIdEmpresarial() + '\'' +
                ", nombreDoctor= " + doctor.nombreCompleto()+ '\'' +
                ", Fecha='" + fecha + '\'' +
                ", Tiempo de inicio='" + tiempoInicio + '\'' +
                ", Tiempo final='" + tiempofinal + '\'' +
                ", appointmentCount=" + conteoCitas + "}";
    }
    
    
}
