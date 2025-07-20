/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ususario
 */
public class Mascota {
    private int ID;
    private String nombre;
    private int edad;
    private String tipo;
    private String raza;
    private String sexo;
    private float peso;
    private int idDueño;

    public Mascota(int ID, String nombre, int edad, String tipo, String raza, String sexo, float peso, int idDueño) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.idDueño = idDueño;
    }



    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
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

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

  
    
    @Override
    public String toString(){
        return nombre + "," + 
               ID + "," + 
               edad + "," + 
               tipo + "," + 
               raza + "," + 
               sexo + "," + 
               peso; 
    }

}
    