/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author Ususario
 */
public class LeerDoctorVeterinario {
    private ArrayList<DoctorVeterinario> DoctoresVet;
    private BaseDatos database;
    
    public LeerDoctorVeterinario(BaseDatos basedatos) {
        String select = "SELECT * FROM `doctoresveterinarios`;";
        try {
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                DoctorVeterinario DV = new DoctorVeterinario();
                DV.setID(rs.getInt("ID"));
                DV.setNombre((rs.getString("nombre")));
                DV.setApellido((rs.getString("apellido")));
                DV.setEmail((rs.getString("email")));
                DV.setNumeroTelefono((rs.getString("numeroTelefono")));
                DV.setContraseña((rs.getString("contraseña")));
                DV.setEspecializacion((rs.getString("especialización")));
                DoctoresVet.add(DV);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<DoctorVeterinario> getDoctorVeterinarios(){
        return DoctoresVet;
    }
}
