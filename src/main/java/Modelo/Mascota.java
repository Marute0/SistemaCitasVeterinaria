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
    private Tipo tipo;
    private String raza;
    private Sexo sexo;
    private int idDueño;

    //Métodos constructores

    public Mascota() {
    }
    
    
    public Mascota(int ID, String nombre, Tipo tipo, String raza, Sexo sexo, int idDueño) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.idDueño = idDueño;
    }


    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public Sexo getSexo() {
        return sexo;
    }


    public int getIdDueño() {
        return idDueño;
    }

    
    //Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

  
    
    @Override
    public String toString(){
        return nombre + "," + 
               ID + "," + 
               tipo + "," + 
               raza + "," + 
               sexo;
    }
    
    //Inicialización de enums
        public enum Tipo {
        PERRO, GATO, AVE, ROEDOR, OTRO;
        
        public static Tipo fromString(String value) {
            try {
                return Tipo.valueOf(value.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.err.println("Valor de tipo no válido: " + value);
                return OTRO; // Valor por defecto
            }
        }
    }
    
    public enum Sexo {
        HEMBRA, MACHO;
        
        public static Sexo fromString(String value) {
            try {
                return Sexo.valueOf(value.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.err.println("Valor de sexo no válido: " + value);
                return HEMBRA; // Valor por defecto
            }
        }
    }
    
    

}
    