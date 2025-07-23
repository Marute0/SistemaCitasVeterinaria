/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControladorDoctorVeterinario {
    private DoctorVeterinario DV;
    private BaseDatos baseDatos;
    private ArrayList<DoctorVeterinario> DoctoresVet;
    private GeneradorContraseñas generadorContraseñas;

    
    //Constructores 
    public ControladorDoctorVeterinario() {
    }

    public ControladorDoctorVeterinario(DoctorVeterinario DV) {
        this.DV = DV;
    }

    public ControladorDoctorVeterinario(DoctorVeterinario DV, BaseDatos baseDatos) {
        this.DV = DV;
        this.baseDatos = baseDatos;
    }
    
    public ControladorDoctorVeterinario(DoctorVeterinario DV, BaseDatos baseDatos, GeneradorContraseñas generadorContraseñas) {
        this.DV = DV;
        this.baseDatos = baseDatos;
        this.generadorContraseñas = generadorContraseñas;
    }
    
   //Método que crea al DV en la base de datos
    public String doctorVeterinarioEsCreado(DoctorVeterinario DV) {
        this.baseDatos = new BaseDatos();
        this.generadorContraseñas = new GeneradorContraseñas();
        String contraseña = generadorContraseñas.generarContraseñaTemporal();
        String sql = "INSERT INTO `doctoresveterinarios`(`nombre`, `apellido`, `nDocumento`, `email`, `numeroTelefono`, `contraseña`, `especialización`) "
                + "VALUES (?,?,?,?,?,?,?)";
 
            try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
                pstmt.setString(1, DV.getNombre());
                pstmt.setString(2, DV.getApellido());
                pstmt.setString(3, DV.getnDocumento());
                pstmt.setString(4, DV.getEmail());
                pstmt.setString(5, DV.getNumeroTelefono());
                pstmt.setString(6, contraseña);
                pstmt.setString(7, DV.getEspecializacion());

                int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            return contraseña;  // Retorna la contraseña generada
        } else {
            return null;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}
    

    //Método que lee a los doctores en la base de datos y los lleva a un array 
public List<DoctorVeterinario> obtenerTodosLosDoctores() {
    List<DoctorVeterinario> doctoresVet = new ArrayList<>();
    this.baseDatos = new BaseDatos();
    
    String select = "SELECT * FROM `doctoresveterinarios` ORDER BY nombre, apellido;";
    try (Connection conn = baseDatos.getConnection();
         PreparedStatement ps = conn.prepareStatement(select);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            DoctorVeterinario DV = new DoctorVeterinario(
                rs.getInt("ID"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("nDocumento"),
                rs.getString("email"),
                rs.getString("numeroTelefono"),
                rs.getString("contraseña"),
                rs.getString("especialización")
            );
            doctoresVet.add(DV);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return doctoresVet;
}

    public List<DoctorVeterinario> obtenerDoctoresPorEspecialidad(String especialidad) {
        List<DoctorVeterinario> doctores = new ArrayList<>();
        this.baseDatos = new BaseDatos();
        
        String sql = "SELECT * FROM `doctoresveterinarios` WHERE `especialización` = ?";

        try (Connection conn = baseDatos.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DoctorVeterinario doctor = new DoctorVeterinario(
                    rs.getInt("ID"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("nDocumento"),
                    rs.getString("email"),
                    rs.getString("numeroTelefono"),
                    rs.getString("contraseña"),
                    rs.getString("especialización")
                );
                doctores.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return doctores;
    }
    
    
    
    //Array de los doctores
    public ArrayList<DoctorVeterinario> getDoctorVeterinarios(){
        return DoctoresVet;
    }
    
    //Método que actualiza la contraseña
    public boolean actualizarContraseña(int id, String nuevaPassword) {
        String sql = "UPDATE `doctoresveterinarios` SET `contraseña`= ? WHERE `ID`=? ";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatementWithKeys(sql)) {
            pstmt.setString(1, nuevaPassword);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Elimina al doctor y a las citas asociadas a la misma debido al cascade de la base de datos
    public boolean eliminarDoctor(int idDoctor) throws SQLException {
        String sql = "DELETE FROM `doctoresveterinarios` WHERE ID = ?";
        try (Connection conn = baseDatos.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idDoctor);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }  
    public DoctorVeterinario obtenerDoctorPorDocumento(String documento) {
    String sql = "SELECT * FROM `doctoresveterinarios` WHERE `nDocumento` = ?";
    try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
        pstmt.setString(1, documento);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            DoctorVeterinario doctor = new DoctorVeterinario();
            doctor.setID(rs.getInt("ID"));
            doctor.setNombre(rs.getString("nombre"));
            doctor.setApellido(rs.getString("apellido"));
            doctor.setnDocumento(rs.getString("nDocumento"));
            doctor.setEmail(rs.getString("email"));
            doctor.setNumeroTelefono(rs.getString("numeroTelefono"));
            doctor.setContraseña(rs.getString("contraseña"));
            doctor.setEspecializacion(rs.getString("especialización"));
            return doctor;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}
   public boolean verificarContraseñaActual(int id, String contraseña) {
    String sql = "SELECT * FROM `doctoresveterinarios` WHERE `ID` = ? AND `contraseña` = ?";
    try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
        pstmt.setInt(1, id);
        pstmt.setString(2, contraseña);
        ResultSet rs = pstmt.executeQuery();
        return rs.next();  // true si encontró una coincidencia
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}   
   public int contarCitasPorDoctor(int idDoctor) {
    int total = 0;
    try {
        String sql = "SELECT COUNT(*) FROM `citas` WHERE `idDoctor` = ?";
        PreparedStatement pstmt = baseDatos.getPreparedStatement(sql);
        pstmt.setInt(1, idDoctor);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            total = rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return total;
}
   
   public List<Object[]> obtenerCitasPorDoctor(int idDoctor) {
    List<Object[]> citas = new ArrayList<>();
    String sql = "SELECT c.`fechaCita`, c.`horaSlot`, c.`nivelPrioridad`, " +
             "c.`idMascota`, m.`nombre` AS nombreMascota, m.`tipo` AS especie, " +
             "c.`idDueño`, d.`nombre` AS nombreDueño " +
             "FROM `citas` c " +
             "JOIN `mascotas` m ON c.`idMascota` = m.`ID` " +
             "JOIN `dueños` d ON c.`idDueño` = d.`ID` " +
             "WHERE c.`idDoctor` = ? " +
             "ORDER BY c.`fechaCita`, c.`horaSlot`";

    try (PreparedStatement stmt = baseDatos.getPreparedStatement(sql)) {
        stmt.setInt(1, idDoctor);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Object[] fila = new Object[8];
            fila[0] = rs.getDate("fechaCita");
            fila[1] = rs.getString("horaSlot");
            fila[2] = rs.getString("nivelPrioridad");
            fila[3] = rs.getInt("idMascota");
            fila[4] = rs.getString("nombreMascota");
            fila[5] = rs.getString("especie");
            fila[6] = rs.getInt("idDueño");
            fila[7] = rs.getString("nombreDueño");
            citas.add(fila);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return citas;
}

}
