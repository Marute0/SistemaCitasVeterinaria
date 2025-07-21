/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.awt.*;
import javax.swing.*;

public class PanelMascotas extends JPanel {
    public PanelMascotas(){
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Aquí va la gestión de Mascotas", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
}
}
