package Vista;

import Controlador.ControladorCita;
import Controlador.ControladorDoctorVeterinario;
import Controlador.ControladorDueño;
import Controlador.ControladorMascota;
import Modelo.BaseDatos;
import Modelo.Cita;
import Modelo.DoctorVeterinario;
import Modelo.Dueño;
import Modelo.Mascota;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuAdministrador extends javax.swing.JFrame {
 
    Animacion animate = new Animacion();

    private ControladorDoctorVeterinario controladorDoctor;
    private BaseDatos baseDatos;
    ControladorDueño controladorDueño = new ControladorDueño();
    ControladorMascota controladorMascota = new ControladorMascota(null, new BaseDatos());
    ControladorCita controladorCita = new ControladorCita(new BaseDatos());
    
    public MenuAdministrador() {
        initComponents();
        configurarPaneles();
        mostrarPanelInicial();
        DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Apellido", "Documento", "Email", "Teléfono", "Contraseña", "Especialidad"}, 0);
        TablaDoctores.setModel(modeloTabla);
        ControladorDoctorVeterinario controlador = new ControladorDoctorVeterinario();
        llenarTabla(controlador.obtenerTodosLosDoctores());
        cargarDoctoresEnComboBox();
        cargarPrioridadesEnCombo();
        cargarComboTipoMascota();
        cargarComboSexoMascota();
        
        try{
            this.baseDatos = new BaseDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al inicializar:" + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void configurarPaneles() {
        // Añadir al JTabbedPane
        contenedores.addTab("Citas", panelCitas);
        contenedores.addTab("Mascotas", panelPet);
        contenedores.addTab("Doctores", panelDoc);
        contenedores.addTab("Contraseña", panelPassword);
        
        // Deshabilitar el cambio mediante clic en pestañas
    contenedores.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (contenedores.indexAtLocation(evt.getX(), evt.getY()) >= 0) {
                // Cancelar el evento si se hace clic en una pestaña
                evt.consume();}}
    });
    //Hacer que las pestañas parezcan deshabilitadas
    contenedores.setEnabledAt(0, false);
    contenedores.setEnabledAt(1, false);
    contenedores.setEnabledAt(2, false);
    contenedores.setEnabledAt(3, false);   
    }
    private void mostrarPanelInicial() {
        // Seleccionar el panel de citas al iniciar
        contenedores.setSelectedComponent(panelCitas);
        // También puedes resaltar el botón correspondiente
        animate.selectCitas(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
    }
    
    public void limpiarCampos() {
    BloqueNombre.setText("");
    BloqueApellidos.setText("");
    BloqueCedula.setText("");
    BloqueEmail.setText("");
    BloqueTelefono.setText("");
    BloqueEspecialidad.setText("");
}
private void llenarTabla(List<DoctorVeterinario> doctores) {
    DefaultTableModel modelo = (DefaultTableModel) TablaDoctores.getModel();
    modelo.setRowCount(0);  // Limpiar tabla

    for (DoctorVeterinario dv : doctores) {
        modelo.addRow(new Object[]{
            dv.getID(),
            dv.getNombre(),
            dv.getApellido(),
            dv.getnDocumento(),
            dv.getEmail(),
            dv.getNumeroTelefono(),
            dv.getContraseña(),
            dv.getEspecializacion()
        });
    }
}
private void cargarDoctoresEnComboBox() {
    ComboDoctor.removeAllItems(); // Limpia el combo si ya tenía datos

    ControladorDoctorVeterinario controladorDoctor = new ControladorDoctorVeterinario();
    List<DoctorVeterinario> listaDoctores = controladorDoctor.obtenerTodosLosDoctores();

    for (DoctorVeterinario doctor : listaDoctores) {
        ComboDoctor.addItem(doctor); // Agrega el objeto al combo
    }
}
private void cargarPrioridadesEnCombo() {
    ComboPrioridad.removeAllItems();
    for (Cita.Prioridad p : Cita.Prioridad.values()) {
        ComboPrioridad.addItem(p);
    }
}
private void cargarComboTipoMascota() {
    ComboTipo.removeAllItems(); // Limpiar por si ya tiene valores
    for (Mascota.Tipo tipo : Mascota.Tipo.values()) {
        ComboTipo.addItem(tipo);
    }
}
private void cargarComboSexoMascota() {
    ComboSexo.removeAllItems(); // Limpiar por si ya tiene valores
    for (Mascota.Sexo sexo : Mascota.Sexo.values()) {
        ComboSexo.addItem(sexo);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonCita = new javax.swing.JButton();
        ButtonPet = new javax.swing.JButton();
        ButtonDoc = new javax.swing.JButton();
        ButtonPassword = new javax.swing.JButton();
        ButtonLogout = new javax.swing.JButton();
        contenedores = new javax.swing.JTabbedPane();
        panelCitas = new javax.swing.JPanel();
        TituloCitas = new javax.swing.JLabel();
        txt_InfPersonal = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JLabel();
        txtCedula = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        txtInfMascita = new javax.swing.JLabel();
        txtNombrePet = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        ComboSexo = new javax.swing.JComboBox<>();
        txtSexo = new javax.swing.JLabel();
        txtRaza = new javax.swing.JLabel();
        Btt_Programar = new javax.swing.JButton();
        txtInfCita = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JLabel();
        ComboHora = new javax.swing.JComboBox<>();
        ComboDoctor = new javax.swing.JComboBox<>();
        txtDoctor = new javax.swing.JLabel();
        Btt_CitasProgramadas = new javax.swing.JButton();
        ComboPrioridad = new javax.swing.JComboBox<>();
        txtPrioridad1 = new javax.swing.JLabel();
        BloqDireccion = new javax.swing.JTextField();
        BloqEmail = new javax.swing.JTextField();
        BloqMascota = new javax.swing.JTextField();
        BloqTelefono = new javax.swing.JTextField();
        BloqRaza = new javax.swing.JTextField();
        BloqApellidos = new javax.swing.JTextField();
        BloqNombre = new javax.swing.JTextField();
        BloqCedula = new javax.swing.JTextField();
        BloqFecha = new javax.swing.JTextField();
        panelPet = new javax.swing.JPanel();
        TituloMascotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollBar2 = new javax.swing.JScrollBar();
        panelDoc = new javax.swing.JPanel();
        TituloDoc = new javax.swing.JLabel();
        BloqueNombre = new javax.swing.JTextField();
        BloqueCedula = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        especialidad = new javax.swing.JLabel();
        BloqueEspecialidad = new javax.swing.JTextField();
        BloqueApellidos = new javax.swing.JTextField();
        BloqueEmail = new javax.swing.JTextField();
        BloqueTelefono = new javax.swing.JTextField();
        Btt_Busqueda = new javax.swing.JButton();
        Btt_Nuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDoctores = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        panelPassword = new javax.swing.JPanel();
        TituloContraseña = new javax.swing.JLabel();
        txt_contraseñaActual = new javax.swing.JLabel();
        NewPassword = new javax.swing.JPasswordField();
        txt_contraseñaNueva = new javax.swing.JLabel();
        OldPassword = new javax.swing.JPasswordField();
        txt_confirmarContraseña = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JPasswordField();
        Btt_EnviarContraseña = new javax.swing.JButton();
        VerConfirmarClave = new javax.swing.JCheckBox();
        VerNewClave = new javax.swing.JCheckBox();
        VerOldClave = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 254, 239));
        setMinimumSize(new java.awt.Dimension(1180, 700));

        menu.setBackground(new java.awt.Color(96, 131, 52));
        menu.setMinimumSize(new java.awt.Dimension(200, 700));
        menu.setPreferredSize(new java.awt.Dimension(200, 700));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(247, 254, 239));
        jLabel1.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 254, 239));
        jLabel1.setText("PET SCHEDULE");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        ButtonCita.setBackground(new java.awt.Color(168, 202, 126));
        ButtonCita.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonCita.setForeground(new java.awt.Color(247, 254, 239));
        ButtonCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario (2).png"))); // NOI18N
        ButtonCita.setText("Citas");
        ButtonCita.setBorder(null);
        ButtonCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCitaActionPerformed(evt);
            }
        });
        menu.add(ButtonCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 60));

        ButtonPet.setBackground(new java.awt.Color(168, 202, 126));
        ButtonPet.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonPet.setForeground(new java.awt.Color(247, 254, 239));
        ButtonPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        ButtonPet.setText("Mascotas");
        ButtonPet.setBorder(null);
        ButtonPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPetActionPerformed(evt);
            }
        });
        menu.add(ButtonPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        ButtonDoc.setBackground(new java.awt.Color(168, 202, 126));
        ButtonDoc.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonDoc.setForeground(new java.awt.Color(247, 254, 239));
        ButtonDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doctor.png"))); // NOI18N
        ButtonDoc.setText("Doctores");
        ButtonDoc.setBorder(null);
        ButtonDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDocActionPerformed(evt);
            }
        });
        menu.add(ButtonDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 60));

        ButtonPassword.setBackground(new java.awt.Color(168, 202, 126));
        ButtonPassword.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonPassword.setForeground(new java.awt.Color(247, 254, 239));
        ButtonPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        ButtonPassword.setText("Contraseña");
        ButtonPassword.setBorder(null);
        ButtonPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPasswordActionPerformed(evt);
            }
        });
        menu.add(ButtonPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 60));

        ButtonLogout.setBackground(new java.awt.Color(168, 202, 126));
        ButtonLogout.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonLogout.setForeground(new java.awt.Color(247, 254, 239));
        ButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        ButtonLogout.setText("Cerrar Sesión");
        ButtonLogout.setBorder(null);
        ButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogoutActionPerformed(evt);
            }
        });
        menu.add(ButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 200, 60));

        contenedores.setBackground(new java.awt.Color(247, 254, 239));
        contenedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contenedores.setMinimumSize(new java.awt.Dimension(1180, 700));
        contenedores.setPreferredSize(new java.awt.Dimension(1180, 700));

        panelCitas.setBackground(new java.awt.Color(247, 254, 239));

        TituloCitas.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloCitas.setForeground(new java.awt.Color(96, 131, 52));
        TituloCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        TituloCitas.setText(" CITAS");

        txt_InfPersonal.setBackground(new java.awt.Color(151, 183, 112));
        txt_InfPersonal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txt_InfPersonal.setForeground(new java.awt.Color(151, 183, 112));
        txt_InfPersonal.setText("Información Personal");

        txtNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(27, 52, 13));
        txtNombres.setText("Nombres");

        txtApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(27, 52, 13));
        txtApellidos.setText("Apellidos");

        txtCedula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(27, 52, 13));
        txtCedula.setText("Cedula");

        txtTelefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(27, 52, 13));
        txtTelefono.setText("Teléfono");

        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(27, 52, 13));
        txtEmail.setText("Email");

        txtDireccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(27, 52, 13));
        txtDireccion.setText("Dirección");

        txtInfMascita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtInfMascita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setText("Información de la Mascota");

        txtNombrePet.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNombrePet.setForeground(new java.awt.Color(27, 52, 13));
        txtNombrePet.setText("Nombre de la mascota");

        txtTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(27, 52, 13));
        txtTipo.setText("Tipo");

        ComboTipo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });

        ComboSexo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        txtSexo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(27, 52, 13));
        txtSexo.setText("Sexo");

        txtRaza.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(27, 52, 13));
        txtRaza.setText("Raza");

        Btt_Programar.setBackground(new java.awt.Color(151, 183, 112));
        Btt_Programar.setFont(new java.awt.Font("Swis721 Blk BT", 0, 15)); // NOI18N
        Btt_Programar.setForeground(new java.awt.Color(247, 254, 239));
        Btt_Programar.setText("Programar Cita");
        Btt_Programar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_Programar.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_Programar.setMinimumSize(new java.awt.Dimension(100, 50));
        Btt_Programar.setPreferredSize(new java.awt.Dimension(100, 50));
        Btt_Programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_ProgramarActionPerformed(evt);
            }
        });

        txtInfCita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfCita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtInfCita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfCita.setText("Información de la Cita");

        txtFecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(27, 52, 13));
        txtFecha.setText("Fecha (AAAA-MM-DD)");

        txtPrioridad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPrioridad.setForeground(new java.awt.Color(27, 52, 13));
        txtPrioridad.setText("Hora");

        ComboHora.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00" }));
        ComboHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHoraActionPerformed(evt);
            }
        });

        ComboDoctor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        txtDoctor.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtDoctor.setForeground(new java.awt.Color(27, 52, 13));
        txtDoctor.setText("Doctor");

        Btt_CitasProgramadas.setBackground(new java.awt.Color(151, 183, 112));
        Btt_CitasProgramadas.setFont(new java.awt.Font("Swis721 Blk BT", 0, 15)); // NOI18N
        Btt_CitasProgramadas.setForeground(new java.awt.Color(247, 254, 239));
        Btt_CitasProgramadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa.png"))); // NOI18N
        Btt_CitasProgramadas.setText("Buscar Citas Programadas");
        Btt_CitasProgramadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_CitasProgramadas.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_CitasProgramadas.setMinimumSize(new java.awt.Dimension(100, 50));
        Btt_CitasProgramadas.setPreferredSize(new java.awt.Dimension(100, 50));
        Btt_CitasProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_CitasProgramadasActionPerformed(evt);
            }
        });

        ComboPrioridad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPrioridadActionPerformed(evt);
            }
        });

        txtPrioridad1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPrioridad1.setForeground(new java.awt.Color(27, 52, 13));
        txtPrioridad1.setText("Prioridad");

        BloqDireccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqDireccion.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqDireccion.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqDireccion.setPreferredSize(new java.awt.Dimension(64, 25));

        BloqEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqEmail.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqEmail.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqEmail.setPreferredSize(new java.awt.Dimension(64, 25));

        BloqMascota.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqMascota.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqMascota.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqMascota.setPreferredSize(new java.awt.Dimension(64, 25));

        BloqTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqTelefono.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqTelefono.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqTelefono.setPreferredSize(new java.awt.Dimension(64, 25));
        BloqTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqTelefonoActionPerformed(evt);
            }
        });

        BloqRaza.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqRaza.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqRaza.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqRaza.setPreferredSize(new java.awt.Dimension(64, 25));

        BloqApellidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqApellidos.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqApellidos.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqApellidos.setPreferredSize(new java.awt.Dimension(64, 25));
        BloqApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqApellidosActionPerformed(evt);
            }
        });

        BloqNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqNombre.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqNombre.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqNombre.setPreferredSize(new java.awt.Dimension(64, 25));
        BloqNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqNombreActionPerformed(evt);
            }
        });

        BloqCedula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqCedula.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqCedula.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqCedula.setPreferredSize(new java.awt.Dimension(64, 25));

        BloqFecha.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        BloqFecha.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        BloqFecha.setMinimumSize(new java.awt.Dimension(64, 25));
        BloqFecha.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelCitasLayout.createSequentialGroup()
                            .addComponent(txtNombres)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BloqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(txtTelefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BloqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitasLayout.createSequentialGroup()
                            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtApellidos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BloqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtCedula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BloqCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtDireccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BloqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BloqEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(393, 393, Short.MAX_VALUE)))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfMascita, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addComponent(Btt_Programar, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btt_CitasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_InfPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInfCita, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRaza)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BloqRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                                    .addComponent(txtNombrePet)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BloqMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSexo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(txtFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BloqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(txtDoctor)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(txtPrioridad1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(txtPrioridad)
                                        .addGap(9, 9, 9)
                                        .addComponent(ComboHora, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(335, Short.MAX_VALUE))))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_InfPersonal)
                    .addComponent(TituloCitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres)
                    .addComponent(BloqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono)
                    .addComponent(BloqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos)
                    .addComponent(BloqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)
                    .addComponent(BloqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion)
                    .addComponent(BloqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula)
                    .addComponent(BloqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(txtInfMascita)
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombrePet)
                        .addComponent(BloqMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSexo)))
                .addGap(30, 30, 30)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo)
                    .addComponent(BloqRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(txtInfCita)
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctor)
                    .addComponent(txtPrioridad1)
                    .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha)
                    .addComponent(txtPrioridad)
                    .addComponent(ComboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btt_Programar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btt_CitasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        contenedores.addTab("Citas", panelCitas);

        panelPet.setBackground(new java.awt.Color(247, 254, 239));

        TituloMascotas.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloMascotas.setForeground(new java.awt.Color(96, 131, 52));
        TituloMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huella.png"))); // NOI18N
        TituloMascotas.setText(" INFORMACION DE MASCOTAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollBar2.setBackground(new java.awt.Color(203, 221, 181));

        javax.swing.GroupLayout panelPetLayout = new javax.swing.GroupLayout(panelPet);
        panelPet.setLayout(panelPetLayout);
        panelPetLayout.setHorizontalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPetLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPetLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelPetLayout.setVerticalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPetLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TituloMascotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        contenedores.addTab("Mascotas", panelPet);

        panelDoc.setBackground(new java.awt.Color(247, 254, 239));

        TituloDoc.setBackground(new java.awt.Color(96, 131, 52));
        TituloDoc.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloDoc.setForeground(new java.awt.Color(96, 131, 52));
        TituloDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estetoscopio.png"))); // NOI18N
        TituloDoc.setText(" INFORMACIÓN DE DOCTORES");

        BloqueNombre.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueNombreActionPerformed(evt);
            }
        });

        BloqueCedula.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueCedula.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueCedulaActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        nombre.setForeground(new java.awt.Color(27, 52, 13));
        nombre.setText("Nombres");

        apellido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        apellido.setForeground(new java.awt.Color(27, 52, 13));
        apellido.setText("Apellidos");

        email.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(27, 52, 13));
        email.setText("Email");

        cedula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cedula.setForeground(new java.awt.Color(27, 52, 13));
        cedula.setText("Cedula");

        telefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        telefono.setForeground(new java.awt.Color(27, 52, 13));
        telefono.setText("Teléfono");

        especialidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        especialidad.setForeground(new java.awt.Color(27, 52, 13));
        especialidad.setText("Especialidad");

        BloqueEspecialidad.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueEspecialidad.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueEspecialidadActionPerformed(evt);
            }
        });

        BloqueApellidos.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueApellidos.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueApellidosActionPerformed(evt);
            }
        });

        BloqueEmail.setToolTipText("");
        BloqueEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BloqueEmail.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueEmail.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueEmailActionPerformed(evt);
            }
        });

        BloqueTelefono.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueTelefono.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueTelefonoActionPerformed(evt);
            }
        });

        Btt_Busqueda.setBackground(new java.awt.Color(151, 183, 112));
        Btt_Busqueda.setFont(new java.awt.Font("Swis721 Blk BT", 0, 15)); // NOI18N
        Btt_Busqueda.setForeground(new java.awt.Color(247, 254, 239));
        Btt_Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa.png"))); // NOI18N
        Btt_Busqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_Busqueda.setLabel("Buscar");
        Btt_Busqueda.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_Busqueda.setMinimumSize(new java.awt.Dimension(100, 50));
        Btt_Busqueda.setPreferredSize(new java.awt.Dimension(100, 50));
        Btt_Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_BusquedaActionPerformed(evt);
            }
        });

        Btt_Nuevo.setBackground(new java.awt.Color(151, 183, 112));
        Btt_Nuevo.setFont(new java.awt.Font("Swis721 Blk BT", 0, 15)); // NOI18N
        Btt_Nuevo.setForeground(new java.awt.Color(247, 254, 239));
        Btt_Nuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_Nuevo.setLabel("Nuevo Doctor");
        Btt_Nuevo.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_Nuevo.setMinimumSize(new java.awt.Dimension(75, 20));
        Btt_Nuevo.setPreferredSize(new java.awt.Dimension(100, 50));
        Btt_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_NuevoActionPerformed(evt);
            }
        });

        TablaDoctores.setBackground(new java.awt.Color(203, 221, 181));
        TablaDoctores.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        TablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaDoctores);

        jScrollBar1.setBackground(new java.awt.Color(151, 183, 112));

        javax.swing.GroupLayout panelDocLayout = new javax.swing.GroupLayout(panelDoc);
        panelDoc.setLayout(panelDocLayout);
        panelDocLayout.setHorizontalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TituloDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocLayout.createSequentialGroup()
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(apellido)
                                    .addComponent(cedula))
                                .addGap(18, 18, 18)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BloqueApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BloqueCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(BloqueNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono)
                            .addComponent(email)
                            .addComponent(especialidad))
                        .addGap(21, 21, 21)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BloqueEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloqueTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloqueEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btt_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(Btt_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocLayout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panelDocLayout.setVerticalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addContainerGap(139, Short.MAX_VALUE)
                        .addComponent(Btt_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btt_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(TituloDoc)
                                .addGap(33, 33, 33)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BloqueNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre))
                                .addGap(29, 29, 29)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BloqueApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellido))
                                .addGap(29, 29, 29)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cedula)
                                    .addComponent(BloqueCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BloqueEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email))
                                .addGap(29, 29, 29)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BloqueTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono))
                                .addGap(29, 29, 29)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(especialidad)
                                    .addComponent(BloqueEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        contenedores.addTab("Doctores", panelDoc);

        panelPassword.setBackground(new java.awt.Color(247, 254, 239));

        TituloContraseña.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloContraseña.setForeground(new java.awt.Color(96, 131, 52));
        TituloContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restablecer-la-contrasena.png"))); // NOI18N
        TituloContraseña.setText(" CAMBIAR CONTRASEÑA");

        txt_contraseñaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaActual.setText("Ingrese contraseña actual:");

        NewPassword.setBackground(new java.awt.Color(203, 221, 181));
        NewPassword.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        NewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordActionPerformed(evt);
            }
        });

        txt_contraseñaNueva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaNueva.setText("Ingrese contraseña nueva:");

        OldPassword.setBackground(new java.awt.Color(203, 221, 181));
        OldPassword.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        OldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPasswordActionPerformed(evt);
            }
        });

        txt_confirmarContraseña.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_confirmarContraseña.setText("Confirmar la contraseña nueva:");

        ConfirmPassword.setBackground(new java.awt.Color(203, 221, 181));
        ConfirmPassword.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        Btt_EnviarContraseña.setBackground(new java.awt.Color(151, 183, 112));
        Btt_EnviarContraseña.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        Btt_EnviarContraseña.setForeground(new java.awt.Color(247, 254, 239));
        Btt_EnviarContraseña.setText("Enviar");
        Btt_EnviarContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_EnviarContraseña.setMinimumSize(new java.awt.Dimension(70, 30));
        Btt_EnviarContraseña.setPreferredSize(new java.awt.Dimension(70, 30));
        Btt_EnviarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_EnviarContraseñaActionPerformed(evt);
            }
        });

        VerConfirmarClave.setBackground(new java.awt.Color(247, 254, 239));
        VerConfirmarClave.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        VerConfirmarClave.setText("Ver contraseña");
        VerConfirmarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerConfirmarClaveActionPerformed(evt);
            }
        });

        VerNewClave.setBackground(new java.awt.Color(247, 254, 239));
        VerNewClave.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        VerNewClave.setText("Ver contraseña");
        VerNewClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerNewClaveActionPerformed(evt);
            }
        });

        VerOldClave.setBackground(new java.awt.Color(247, 254, 239));
        VerOldClave.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        VerOldClave.setText("Ver contraseña");
        VerOldClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerOldClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txt_contraseñaActual))
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(TituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPasswordLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txt_contraseñaNueva))
                                    .addGroup(panelPasswordLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(VerNewClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_confirmarContraseña)
                                        .addGroup(panelPasswordLayout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(VerConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panelPasswordLayout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(Btt_EnviarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VerOldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(715, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloContraseña)
                .addGap(56, 56, 56)
                .addComponent(txt_contraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerOldClave)
                .addGap(18, 18, 18)
                .addComponent(txt_contraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerNewClave)
                .addGap(18, 18, 18)
                .addComponent(txt_confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerConfirmarClave)
                .addGap(45, 45, 45)
                .addComponent(Btt_EnviarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        contenedores.addTab("Contraseña", panelPassword);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPetActionPerformed
        animate.selectMascotas(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelPet);
    }//GEN-LAST:event_ButtonPetActionPerformed

    private void ButtonPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPasswordActionPerformed
        animate.selectContraseña(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelPassword);
    }//GEN-LAST:event_ButtonPasswordActionPerformed

    private void ButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogoutActionPerformed
        animate.selectSalir(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_ButtonLogoutActionPerformed

    private void ButtonCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCitaActionPerformed
        animate.selectCitas(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelCitas);
    }//GEN-LAST:event_ButtonCitaActionPerformed

    private void ButtonDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDocActionPerformed
        animate.selectDoctores(ButtonCita, ButtonPet, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelDoc);
    }//GEN-LAST:event_ButtonDocActionPerformed

    private void BloqueCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueCedulaActionPerformed

    private void BloqueNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueNombreActionPerformed

    private void BloqueEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueEspecialidadActionPerformed

    private void BloqueApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueApellidosActionPerformed

    private void BloqueEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueEmailActionPerformed

    private void BloqueTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqueTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqueTelefonoActionPerformed

    private void Btt_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_NuevoActionPerformed
    // 1. Obtener los datos del formulario
    String nombre = BloqueNombre.getText().trim();
    String apellido = BloqueApellidos.getText().trim();
    String nDocumento = BloqueCedula.getText().trim();
    String email = BloqueEmail.getText().trim();
    String telefono = BloqueTelefono.getText().trim();
    String especializacion = BloqueEspecialidad.getText().trim();

    // 2. Validar que no estén vacíos
    if (nombre.isEmpty() || apellido.isEmpty() || nDocumento.isEmpty() || 
        email.isEmpty() || telefono.isEmpty() || especializacion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        return;
    }
    // 3. Crear el objeto DoctorVeterinario sin contraseña (esta se genera luego)
    DoctorVeterinario nuevoDoctor = new DoctorVeterinario(0,nombre, apellido, nDocumento, email, telefono,"", especializacion);
    // 4. Crear el controlador con la base de datos y el doctor
   ControladorDoctorVeterinario controlador = new ControladorDoctorVeterinario();
    String contraseñaGenerada = controlador.doctorVeterinarioEsCreado(nuevoDoctor);
    // 6. Mostrar mensaje de éxito o error
    if (contraseñaGenerada != null) {
        JOptionPane.showMessageDialog(this, "Doctor creado con éxito.\nContraseña temporal: " + contraseñaGenerada, 
                                      "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();  // Método opcional para limpiar después
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo crear el doctor. Verifica la conexión o los datos.", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
    cargarDoctoresEnComboBox();
    }//GEN-LAST:event_Btt_NuevoActionPerformed

    private void Btt_EnviarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_EnviarContraseñaActionPerformed

    }//GEN-LAST:event_Btt_EnviarContraseñaActionPerformed

    private void NewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPasswordActionPerformed

    private void OldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPasswordActionPerformed

    private void VerConfirmarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerConfirmarClaveActionPerformed
        if (VerConfirmarClave.isSelected()) {
        ConfirmPassword.setEchoChar((char) 0);
    } else {
        ConfirmPassword.setEchoChar('•');
    }
    }//GEN-LAST:event_VerConfirmarClaveActionPerformed

    private void VerNewClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerNewClaveActionPerformed
              if (VerNewClave.isSelected()) {
        NewPassword.setEchoChar((char) 0); // Mostrar texto
    } else {
        NewPassword.setEchoChar('•'); // Ocultar con puntos
    }
    }//GEN-LAST:event_VerNewClaveActionPerformed

    private void VerOldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerOldClaveActionPerformed
           if (VerOldClave.isSelected()) {
        OldPassword.setEchoChar((char) 0);
    } else {
        OldPassword.setEchoChar('•');
    }
    }//GEN-LAST:event_VerOldClaveActionPerformed

    private void ComboHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboHoraActionPerformed

    private void Btt_ProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_ProgramarActionPerformed
       String nombreDueño = BloqNombre.getText();
        String apellidoDueño = BloqApellidos.getText();
        String cedulaDueño = BloqCedula.getText();
        String telefonoDueño = BloqTelefono.getText();
        String emailDueño = BloqEmail.getText();
        String direccionDueño = BloqTelefono.getText();

        String nombreMascota = BloqMascota.getText();
        String tipo = ComboTipo.getSelectedItem().toString();
        String sexo = ComboSexo.getSelectedItem().toString();
        String raza = BloqRaza.getText();
         
        String fecha = BloqFecha.getText();
        String hora = ComboHora.getSelectedItem().toString();
        String fechaCompleta = fecha + "T" + hora;
        String isoFechaHora = fecha + "T" + hora + ":00";    
        LocalDateTime fechaCita = LocalDateTime.parse(isoFechaHora);
        DoctorVeterinario doctorSeleccionado = (DoctorVeterinario) ComboDoctor.getSelectedItem();
        Cita.Prioridad prioridad = (Cita.Prioridad) ComboPrioridad.getSelectedItem();
            
// 2. Verificar si el dueño existe
    int idDueño = controladorMascota.obtenerIdDueñoPorDocumento(cedulaDueño);
    Dueño dueño;

    if (idDueño == -1) {
        dueño = new Dueño(0, nombreDueño, apellidoDueño, cedulaDueño, emailDueño, telefonoDueño, direccionDueño);
        controladorDueño.dueñoEsCreado(dueño);
        idDueño = controladorMascota.obtenerIdDueñoPorDocumento(cedulaDueño);
        dueño.setID(idDueño);
    } else {
        dueño = new Dueño(); 
        dueño.setID(idDueño); 
        // Opcional: puedes cargar más info del dueño si la necesitas
    }

    // 3. Verificar si la mascota ya existe (según nombre + dueño)
    ArrayList<Mascota> mascotasExistentes = controladorMascota.obtenerMascotas();
    Mascota mascota = null;
    for (Mascota m : mascotasExistentes) {
        if (m.getNombre().equalsIgnoreCase(nombreMascota) && m.getIdDueño() == idDueño) {
            mascota = m;
            break;
        }
    }

    if (mascota == null) {
        mascota = new Mascota(0,nombreMascota, Mascota.Tipo.valueOf(tipo), raza, Mascota.Sexo.valueOf(sexo), idDueño);
        controladorMascota.crearMascota(mascota, cedulaDueño);

        // Buscar ID de la mascota creada
        for (Mascota m : controladorMascota.obtenerMascotas()) {
            if (m.getNombre().equalsIgnoreCase(nombreMascota) && m.getIdDueño() == idDueño) {
                mascota = m;
                break;
            }
        }
    }
    
    // 4. Crear la cita
    Cita cita = new Cita();
    cita.setDueño(dueño);
    cita.setMascota(mascota);
    cita.setDoctor(doctorSeleccionado);
    cita.setFecha(fechaCita);
    cita.setNivelPrioridad(prioridad);

    boolean exito = controladorCita.crearCita(cita);

    if (exito) {
        JOptionPane.showMessageDialog(this, "¡Cita programada con éxito!");
    } else {
        JOptionPane.showMessageDialog(this, "Error al programar la cita. Verifica disponibilidad del doctor.");
    }
    }//GEN-LAST:event_Btt_ProgramarActionPerformed

    private void Btt_CitasProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CitasProgramadasActionPerformed
        CitasProgramadas newframe = new CitasProgramadas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btt_CitasProgramadasActionPerformed

    private void ComboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPrioridadActionPerformed

    private void Btt_BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_BusquedaActionPerformed
    ControladorDoctorVeterinario ctrl = new ControladorDoctorVeterinario();
    String especialidad = BloqueEspecialidad.getText().trim();

    List<DoctorVeterinario> lista;

    if (especialidad.isEmpty()) {
        // Si no hay filtro, cargar todos los doctores
        lista = ctrl.obtenerTodosLosDoctores();
    } else {
        // Si hay texto, filtrar por especialidad
        lista = ctrl.obtenerDoctoresPorEspecialidad(especialidad);
    }

    llenarTabla(lista); // Actualiza la tabla con los datos nuevos
    }//GEN-LAST:event_Btt_BusquedaActionPerformed

    private void BloqTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqTelefonoActionPerformed

    private void ComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoActionPerformed

    }//GEN-LAST:event_ComboTipoActionPerformed

    private void BloqApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqApellidosActionPerformed

    private void BloqNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloqNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloqNombreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAdministrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloqApellidos;
    private javax.swing.JTextField BloqCedula;
    private javax.swing.JTextField BloqDireccion;
    private javax.swing.JTextField BloqEmail;
    private javax.swing.JTextField BloqFecha;
    private javax.swing.JTextField BloqMascota;
    private javax.swing.JTextField BloqNombre;
    private javax.swing.JTextField BloqRaza;
    private javax.swing.JTextField BloqTelefono;
    private javax.swing.JTextField BloqueApellidos;
    private javax.swing.JTextField BloqueCedula;
    private javax.swing.JTextField BloqueEmail;
    private javax.swing.JTextField BloqueEspecialidad;
    private javax.swing.JTextField BloqueNombre;
    private javax.swing.JTextField BloqueTelefono;
    private javax.swing.JButton Btt_Busqueda;
    private javax.swing.JButton Btt_CitasProgramadas;
    private javax.swing.JButton Btt_EnviarContraseña;
    private javax.swing.JButton Btt_Nuevo;
    private javax.swing.JButton Btt_Programar;
    private javax.swing.JButton ButtonCita;
    private javax.swing.JButton ButtonDoc;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonPassword;
    private javax.swing.JButton ButtonPet;
    public javax.swing.JComboBox<DoctorVeterinario> ComboDoctor;
    private javax.swing.JComboBox<String> ComboHora;
    public javax.swing.JComboBox<Cita.Prioridad> ComboPrioridad;
    public javax.swing.JComboBox<Mascota.Sexo> ComboSexo;
    public javax.swing.JComboBox<Mascota.Tipo> ComboTipo;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JPasswordField OldPassword;
    public javax.swing.JTable TablaDoctores;
    private javax.swing.JLabel TituloCitas;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloDoc;
    private javax.swing.JLabel TituloMascotas;
    private javax.swing.JCheckBox VerConfirmarClave;
    private javax.swing.JCheckBox VerNewClave;
    private javax.swing.JCheckBox VerOldClave;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel cedula;
    public javax.swing.JTabbedPane contenedores;
    private javax.swing.JLabel email;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelCitas;
    public javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPet;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel txtApellidos;
    private javax.swing.JLabel txtCedula;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtDoctor;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtInfCita;
    private javax.swing.JLabel txtInfMascita;
    private javax.swing.JLabel txtNombrePet;
    private javax.swing.JLabel txtNombres;
    private javax.swing.JLabel txtPrioridad;
    private javax.swing.JLabel txtPrioridad1;
    private javax.swing.JLabel txtRaza;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txt_InfPersonal;
    private javax.swing.JLabel txt_confirmarContraseña;
    private javax.swing.JLabel txt_contraseñaActual;
    private javax.swing.JLabel txt_contraseñaNueva;
    // End of variables declaration//GEN-END:variables
}