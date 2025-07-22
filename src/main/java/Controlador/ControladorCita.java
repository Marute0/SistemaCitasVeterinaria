/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Cita;
import Modelo.DoctorVeterinario;
import Modelo.Dueño;
import Modelo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ususario
 */
public class ControladorCita {
   private BaseDatos baseDatos;
   private Cita cita;
   private Mascota mascota;
   private Dueño dueño;
   private DoctorVeterinario doctor;

   
   //Constructor controlador cita
   
   
    public ControladorCita(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public ControladorCita(BaseDatos baseDatos, Cita cita, Mascota mascota, Dueño dueño, DoctorVeterinario doctor) {
        this.baseDatos = baseDatos;
        this.cita = cita;
        this.mascota = mascota;
        this.dueño = dueño;
        this.doctor = doctor;
    }


    // Crear nueva cita
public boolean crearCita(Cita cita) {
    // Validar que las relaciones existan
    if (!validarRelaciones(cita)) {
        System.out.println("Error: Relaciones inválidas");
        return false;
    }

    // Verificar que el doctor no esté ocupado en esa hora
    if (!verificarDisponibilidadDoctor(cita.getDoctor().getID(), cita.getFecha())) {
        System.out.println("Error: El doctor ya tiene una cita a esa hora.");
        return false;
    }

    String sql = "INSERT INTO `citas`(`idDueño`, `idMascota`, `idDoctor`, `fecha`, `nivelPrioridad`) "
            + "VALUES (?,?,?,?,?);";

    try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
        pstmt.setInt(1, cita.getDueño().getID());
        pstmt.setInt(2, cita.getMascota().getID());
        pstmt.setInt(3, cita.getDoctor().getID());
        pstmt.setTimestamp(4, Timestamp.valueOf(cita.getFecha()));
        pstmt.setString(5, cita.getNivelPrioridad().name());

        return pstmt.executeUpdate() > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

// Verificar si el doctor tiene una cita en la misma hora
private boolean verificarDisponibilidadDoctor(int idDoctor, LocalDateTime fecha) {
    String sql = "SELECT COUNT(*) FROM citas WHERE idDoctor = ? AND fecha = ?";
    try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
        pstmt.setInt(1, idDoctor);
        pstmt.setTimestamp(2, Timestamp.valueOf(fecha));
        ResultSet rs = pstmt.executeQuery();
        return rs.next() && rs.getInt(1) == 0; // Si es 0, está disponible
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    // Validar que dueño, mascota y doctor existan
    private boolean validarRelaciones(Cita cita) {
        return existeRegistro("`dueños`", cita.getDueño().getID())
                && existeRegistro("`mascotas`", cita.getMascota().getID())
                && existeRegistro("`doctoresveterinarios`", cita.getDoctor().getID());
    }

    private boolean existeRegistro(String tabla, int id) {
        String sql = "SELECT COUNT(*) FROM " + "`" + tabla + "`" + " WHERE id = ?";
        try (PreparedStatement pstmt = baseDatos.getPreparedStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() && rs.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
    
    //Obtiene la información de la base de datos COMPLETA (Sin filtros)
    public List<Cita> obtenerTodasCitas() {
        List<Cita> citas = new ArrayList<>();
        String sql = 
            "SELECT c.*, " +
            "       d.nombre AS nombre_dueño, d.apellido AS apellido_dueño, " +
            "       m.nombre AS nombre_mascota, m.tipo AS tipo_mascota, m.raza AS raza_mascota, " +
            "       doc.nombre AS nombre_doctor, doc.apellido AS apellido_doctor " +
            "FROM `citas` c " +
            " JOIN `dueños` d       ON c.idDueño   = d.ID " +
            " JOIN `mascotas` m     ON c.idMascota = m.ID " +
            " JOIN `doctoresveterinarios` doc ON c.idDoctor = doc.ID"+
            "ORDER BY d.nombre ASC, d.apellido ASC";

        try ( Connection conn  = baseDatos.getConnection();
              Statement stmt  = conn.createStatement();
              ResultSet rs    = stmt.executeQuery(sql) ) {

            while (rs.next()) {
                Cita cita = mapearCitaCompleta(rs);
                citas.add(cita);
            }
        } catch (SQLException e) {
            // Loguea o lanza una excepción de más alto nivel
            e.printStackTrace();
        }
        return citas;
    }

    
    //Devuelve todas las citas, ordenadas alfabéticamente por el apellido del doctor (FILTRO DOCTOR EN CITA)
    public List<Cita> obtenerCitasOrdenadasPorDoctor() {
        String sql =
          "SELECT c.*, " +
          "       d.nombre   AS nombre_dueño,   d.apellido   AS apellido_dueño, " +
          "       m.nombre   AS nombre_mascota, m.tipo       AS tipo_mascota, m.raza AS raza_mascota, " +
          "       doc.nombre AS nombre_doctor,  doc.apellido AS apellido_doctor " +
          "  FROM citas c " +
          "  JOIN dueños d   ON c.idDueño   = d.ID " +
          "  JOIN mascotas m ON c.idMascota = m.ID " +
          "  JOIN doctoresveterinarios doc ON c.idDoctor = doc.ID " +
          " ORDER BY doc.apellido ASC, doc.nombre ASC";

        List<Cita> lista = new ArrayList<>();
        try ( Connection conn = baseDatos.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql);
              ResultSet rs = ps.executeQuery() ) {

            while (rs.next()) {
                lista.add(mapearCitaCompleta(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    
    //Devuelve todas las citas, ordenadas alfabéticamente por el apellido del dueño (FILTRO DUEÑO EN CITA)
    public List<Cita> obtenerCitasOrdenadasPorDueño() {
        String sql =
          "SELECT c.*, " +
          "       d.nombre   AS nombre_dueño,   d.apellido   AS apellido_dueño, " +
          "       m.nombre   AS nombre_mascota, m.tipo       AS tipo_mascota, m.raza AS raza_mascota, " +
          "       doc.nombre AS nombre_doctor,  doc.apellido AS apellido_doctor " +
          "  FROM citas c " +
          "  JOIN dueños d   ON c.idDueño   = d.ID " +
          "  JOIN mascotas m ON c.idMascota = m.ID " +
          "  JOIN doctoresveterinarios doc ON c.idDoctor = doc.ID " +
          " ORDER BY d.apellido ASC, d.nombre ASC";

        List<Cita> lista = new ArrayList<>();
        try ( Connection conn = baseDatos.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql);
              ResultSet rs = ps.executeQuery() ) {

            while (rs.next()) {
                lista.add(mapearCitaCompleta(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    //Devuelve todas las citas, ordenadas por fecha y lo limita desde el presente día hasta dentro de 7 días (FILTRO FECHA EN CITA)
    public List<Cita> obtenerCitasProximasSemana() {
        String sql
                = "SELECT c.*, "
                + "       d.nombre   AS nombre_dueño,   d.apellido   AS apellido_dueño, "
                + "       m.nombre   AS nombre_mascota, m.tipo       AS tipo_mascota, m.raza AS raza_mascota, "
                + "       doc.nombre AS nombre_doctor,  doc.apellido AS apellido_doctor "
                + "  FROM citas c "
                + "  JOIN dueños d   ON c.idDueño   = d.ID "
                + "  JOIN mascotas m ON c.idMascota = m.ID "
                + "  JOIN doctoresveterinarios doc ON c.idDoctor = doc.ID "
                + " WHERE c.fecha BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 7 DAY) "
                + " ORDER BY c.fecha ASC";

        List<Cita> lista = new ArrayList<>();
        try (Connection conn = baseDatos.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearCitaCompleta(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    //Mapeo de las citas, util para el jframe
    private Cita mapearCitaCompleta(ResultSet rs) throws SQLException {    
        Cita cita = new Cita();
        cita.setID(rs.getInt("ID") );
        cita.setFecha( rs.getTimestamp("fecha").toLocalDateTime() );
        String prioridadStr = rs.getString("nivelPrioridad");
        Cita.Prioridad prioridadEnum = Cita.Prioridad.fromString(prioridadStr);
        cita.setNivelPrioridad(prioridadEnum);

        // Mapeo del dueño
        Dueño d = new Dueño();
        d.setID(rs.getInt("idDueño") );
        d.setNombre( rs.getString("nombre_dueño") );
        d.setApellido( rs.getString("apellido_dueño") );
        cita.setDueño(d);

        // Mapeo de la mascota
        Mascota m = new Mascota();
        m.setID( rs.getInt("idMascota") );
        m.setNombre( rs.getString("nombre_mascota") );
        m.setRaza( rs.getString("raza_mascota") );
        String tipoStr = rs.getString("tipo_mascota");
        Mascota.Tipo tipoEnum = Mascota.Tipo.fromString(tipoStr);
        m.setTipo(tipoEnum);
        cita.setMascota(m);

        // Mapeo del doctor
        DoctorVeterinario doc = new DoctorVeterinario();
        doc.setID(rs.getInt("idDoctor") );
        doc.setNombre( rs.getString("nombre_doctor") );
        doc.setApellido( rs.getString("apellido_doctor") );
        cita.setDoctor(doc);

        return cita;
    }
    
    //Método qué elimina las citas
    public boolean eliminarCita(int idCita) { //DELETE FROM `mascotas` WHERE `ID` = ?
        String sql = "DELETE FROM `citas` WHERE ID = ?";
        try (Connection conn = baseDatos.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idCita);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
