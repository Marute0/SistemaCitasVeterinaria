/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.security.SecureRandom;

/**
 *
 * @author Ususario
 */
public class GeneradorContraseñas {
    
        public String generarContraseñaTemporal() {
        // Generar contraseña aleatoria segura
        String chars = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789!@#$%";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(10);
        
        for (int i = 0; i < 10; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

}
