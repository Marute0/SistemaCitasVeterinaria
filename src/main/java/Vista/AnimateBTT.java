/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimateBTT {

    private void resaltar(JPanel panel, JLabel label) {
        panel.setBackground(new Color(168, 202, 126)); // Verde claro (seleccionado)
        label.setForeground(Color.WHITE);           // Texto blanco al seleccionar
    }

    private void desresaltar(JPanel panel, JLabel label) {
        panel.setBackground(new Color(96, 131, 52)); // Verde oscuro (no seleccionado)
        label.setForeground(Color.WHITE);              // Puedes cambiar a gris si quieres
    }
     public void seleccionarCitas(JPanel btt_cita, JLabel btt_citas, JPanel btt_masco, JLabel btt_mascotas, JPanel btt_doc, JLabel btt_doctores, JPanel btt_contrase, JLabel btt_contraseña, JPanel btt_cerrar, JLabel btt_salir) {
        resaltar(btt_cita, btt_citas);
        desresaltar(btt_masco, btt_mascotas);
        desresaltar(btt_doc, btt_doctores);
        desresaltar(btt_contrase, btt_contraseña);
        desresaltar(btt_cerrar, btt_salir);
    }

    public void seleccionarMascotas(JPanel btt_cita, JLabel btt_citas, JPanel btt_masco, JLabel btt_mascotas, JPanel btt_doc, JLabel btt_doctores, JPanel btt_contrase, JLabel btt_contraseña, JPanel btt_cerrar, JLabel btt_salir) {
        resaltar(btt_masco, btt_mascotas);
        desresaltar(btt_cita, btt_citas);
        desresaltar(btt_doc, btt_doctores);
        desresaltar(btt_contrase, btt_contraseña);
        desresaltar(btt_cerrar, btt_salir);
    }
    
    public void seleccionarDoctores(JPanel btt_cita, JLabel btt_citas, JPanel btt_masco, JLabel btt_mascotas, JPanel btt_doc, JLabel btt_doctores, JPanel btt_contrase, JLabel btt_contraseña, JPanel btt_cerrar, JLabel btt_salir) {
        resaltar(btt_doc, btt_doctores);
        desresaltar(btt_masco, btt_mascotas);
        desresaltar(btt_cita, btt_citas);
        desresaltar(btt_contrase, btt_contraseña);
        desresaltar(btt_cerrar, btt_salir);
    }
    
    public void seleccionarContraseña(JPanel btt_cita, JLabel btt_citas, JPanel btt_masco, JLabel btt_mascotas, JPanel btt_doc, JLabel btt_doctores, JPanel btt_contrase, JLabel btt_contraseña, JPanel btt_cerrar, JLabel btt_salir) {
        resaltar(btt_contrase, btt_contraseña);
        desresaltar(btt_doc, btt_doctores);
        desresaltar(btt_masco, btt_mascotas);
        desresaltar(btt_cita, btt_citas);
        desresaltar(btt_cerrar, btt_salir);
    }
    
    public void seleccionarSalir(JPanel btt_cita, JLabel btt_citas, JPanel btt_masco, JLabel btt_mascotas, JPanel btt_doc, JLabel btt_doctores, JPanel btt_contrase, JLabel btt_contraseña, JPanel btt_cerrar, JLabel btt_salir) {
        resaltar(btt_cerrar, btt_salir);
        desresaltar(btt_contrase, btt_contraseña);
        desresaltar(btt_doc, btt_doctores);
        desresaltar(btt_masco, btt_mascotas);
        desresaltar(btt_cita, btt_citas);
    }
}