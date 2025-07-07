/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Arrays;

/**
 *
 * @author Ususario
 */
public class Dueño extends Persona{
    //Atributos
    private Mascota[] mascotasAsociadas;

    //constructor

    public Dueño(Mascota[] mascotasAsociadas, String nombre, String apellido, String id, String email, String numeroTelefono) {
        super(nombre, apellido, id, email, numeroTelefono);
        this.mascotasAsociadas = mascotasAsociadas;
    }

    //Getter
    public Mascota[] getMascotasAsociadas() {
        return mascotasAsociadas;
    }

    
    
    @Override
    public String mostrarInformación(){
        return getNombre() + " " + 
               getApellido() + "," + 
               getId() + "," + 
               getEmail() + "," + 
               getNumeroTelefono() + "," + 
               Arrays.toString(mascotasAsociadas); 
    }
    
}

