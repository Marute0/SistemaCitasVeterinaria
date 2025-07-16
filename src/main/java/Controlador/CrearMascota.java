/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Mascota;
import java.sql.SQLException;

/**
 *
 * @author Ususario
 */
public class CrearMascota {
    private Mascota M;
    private BaseDatos basedatos;

    public CrearMascota(Mascota M, BaseDatos basedatos) {
        this.M = M;
        this.basedatos = basedatos;
    }
    
    public boolean isCreated() {
        boolean created = false;
        String insert = "INSERT INTO `mascotas`( `nombre`, `edad`, `tipo`, `raza`, "
                + "`sexo`, `peso`) VALUES ('"+M.getNombre()+"','"+M.getEdad()+"',"
                + "'"+M.getTipo()+"','"+M.getRaza()+"','"+M.getSexo()+"','"+M.getPeso()+"');";
        try {
            basedatos.getStatement().execute(insert);
            created = true;
        } catch (SQLException e) {
            e.printStackTrace();
            created = false;
        }
        return created;
    }
    
}
