
package Vista;

import java.awt.Color;
import javax.swing.JButton;

public class Animacion {
    
    private void resalta(JButton Button) {
        Button.setBackground(new Color(168, 202, 126)); // Verde claro (seleccionado)
    }

    private void desresalta(JButton Button) {
        Button.setBackground(new Color(96, 131, 52)); // Verde oscuro (no seleccionado)
    }
    
    public void selectCitas(JButton ButtonCita, JButton ButtonPet, JButton ButtonDoc, JButton ButtonPassword, JButton ButtonLogout) {
        resalta(ButtonCita);
        desresalta(ButtonPet);
        desresalta(ButtonDoc);
        desresalta(ButtonPassword);
        desresalta(ButtonLogout);
    }

    public void selectMascotas(JButton ButtonCita, JButton ButtonPet, JButton ButtonDoc, JButton ButtonPassword, JButton ButtonLogout) {
        resalta(ButtonPet);
        desresalta(ButtonCita);
        desresalta(ButtonDoc);
        desresalta(ButtonPassword);
        desresalta(ButtonLogout);
    }
    
    public void selectDoctores(JButton ButtonCita, JButton ButtonPet, JButton ButtonDoc, JButton ButtonPassword, JButton ButtonLogout) {
        resalta(ButtonDoc);
        desresalta(ButtonPet);
        desresalta(ButtonCita);
        desresalta(ButtonPassword);
        desresalta(ButtonLogout);
    }
    
    public void selectContraseña(JButton ButtonCita, JButton ButtonPet, JButton ButtonDoc, JButton ButtonPassword, JButton ButtonLogout) {
        resalta(ButtonPassword);
        desresalta(ButtonPet);
        desresalta(ButtonDoc);
        desresalta(ButtonCita);
        desresalta(ButtonLogout);
    }
    
    public void selectSalir(JButton ButtonCita, JButton ButtonPet, JButton ButtonDoc, JButton ButtonPassword, JButton ButtonLogout) {
        resalta(ButtonLogout);
        desresalta(ButtonPet);
        desresalta(ButtonDoc);
        desresalta(ButtonPassword);
        desresalta(ButtonCita);
    }
    
}
