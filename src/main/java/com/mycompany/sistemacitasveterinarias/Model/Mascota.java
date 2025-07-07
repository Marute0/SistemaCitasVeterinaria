/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacitasveterinarias.Model;

import java.util.Arrays;

/**
 *
 * @author Ususario
 */
public class Mascota {
    private String nombre;
    private int idMascota;
    private int edad;
    private String tipo;
    private String raza;
    private String sexo;
    private float peso;

    public Mascota(String nombre, int idMascota, int edad, String tipo, String raza, String sexo, float peso) {
        this.nombre = nombre;
        this.idMascota = idMascota;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

  
    
    @Override
    public String toString(){
        return nombre + "," + 
               idMascota + "," + 
               edad + "," + 
               tipo + "," + 
               raza + "," + 
               sexo + "," + 
               peso; 
    }

}
    