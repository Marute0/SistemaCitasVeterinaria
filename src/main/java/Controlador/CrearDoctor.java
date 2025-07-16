/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DoctorVeterinario;
import Modelo.BaseDatos;
import java.sql.SQLException;

/**
 *
 * @author Ususario
 */
public class CrearDoctor {
    
    private DoctorVeterinario DV;
    private BaseDatos baseDatos;

    public CrearDoctor(DoctorVeterinario doctorVeterinario, BaseDatos baseDatos) {
        this.DV = doctorVeterinario;
        this.baseDatos = baseDatos;
    }
    
    public boolean isCreated() {
        boolean created = false;
        String insert = "INSERT INTO `doctoresveterinarios`( `nombre`, `apellido`, `email`, `"
                + "numeroTelefono`, `contraseña`, `especialización`) "
                + "VALUES ('"+DV.getNombre()+"','"+DV.getApellido()+"',"
                + "'"+DV.getEmail()+"','"+DV.getNumeroTelefono()+"',"
                + "'"+DV.getContraseña()+"','"+DV.getEspecializacion()+"');";
        try {
            baseDatos.getStatement().execute(insert);
            created = true;
        } catch (SQLException e) {
            e.printStackTrace();
            created = false;
        }
        return created;
    }
}
