package Vista;

import Controlador.ControladorDoctorVeterinario;
import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import Modelo.SesionDoctor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuDoctor extends javax.swing.JFrame {
 
    AnimacionDoc animate = new AnimacionDoc();

    private ControladorDoctorVeterinario controladorDoctor;
    private BaseDatos baseDatos;
    private DoctorVeterinario DV;
    
    public MenuDoctor() {
        initComponents();
        int idDoctor = SesionDoctor.id;
             
        configurarPaneles();
        mostrarPanelInicial();
        DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Apellido", "Documento", "Email", "Teléfono", "Contraseña", "Especialidad"}, 0);
        TablaDoctores.setModel(modeloTabla);
        ControladorDoctorVeterinario controlador = new ControladorDoctorVeterinario();
        llenarTabla(controlador.obtenerTodosLosDoctores());
        
        try{
            this.baseDatos = new BaseDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al inicializar:" + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        ControladorDoctorVeterinario controladorr = new ControladorDoctorVeterinario(DV, baseDatos);
        int cantidad = controladorr.contarCitasPorDoctor(idDoctor);
        totalCitas.setText("" + cantidad);
    }
    private void configurarPaneles() {
        // Añadir al JTabbedPane
        contenedores.addTab("Citas", panelCitas);
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
    }
    private void mostrarPanelInicial() {
        // Seleccionar el panel de citas al iniciar
        contenedores.setSelectedComponent(panelCitas);
        // También puedes resaltar el botón correspondiente
        animate.selectCitas(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonCita = new javax.swing.JButton();
        ButtonDoc = new javax.swing.JButton();
        ButtonPassword = new javax.swing.JButton();
        ButtonLogout = new javax.swing.JButton();
        contenedores = new javax.swing.JTabbedPane();
        panelCitas = new javax.swing.JPanel();
        TituloCitas = new javax.swing.JLabel();
        txtInfMascita = new javax.swing.JLabel();
        txtInfCita = new javax.swing.JLabel();
        Btt_CitasProgramadas = new javax.swing.JButton();
        totalCitas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
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
        contraN = new javax.swing.JPasswordField();
        txt_contraseñaNueva = new javax.swing.JLabel();
        contraA = new javax.swing.JPasswordField();
        txt_confirmarContraseña = new javax.swing.JLabel();
        contraNN = new javax.swing.JPasswordField();
        CambiarC = new javax.swing.JButton();
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
        menu.add(ButtonCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 60));

        ButtonDoc.setBackground(new java.awt.Color(168, 202, 126));
        ButtonDoc.setFont(new java.awt.Font("Artifakt Element Black", 2, 18)); // NOI18N
        ButtonDoc.setForeground(new java.awt.Color(247, 254, 239));
        ButtonDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doctor.png"))); // NOI18N
        ButtonDoc.setText("Información Personal");
        ButtonDoc.setBorder(null);
        ButtonDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDocActionPerformed(evt);
            }
        });
        menu.add(ButtonDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 60));

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
        menu.add(ButtonPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, 60));

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
        menu.add(ButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 240, 60));

        contenedores.setBackground(new java.awt.Color(247, 254, 239));
        contenedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contenedores.setMinimumSize(new java.awt.Dimension(1180, 700));
        contenedores.setPreferredSize(new java.awt.Dimension(1180, 700));

        panelCitas.setBackground(new java.awt.Color(247, 254, 239));

        TituloCitas.setFont(new java.awt.Font("Swis721 Blk BT", 0, 48)); // NOI18N
        TituloCitas.setForeground(new java.awt.Color(96, 131, 52));
        TituloCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        TituloCitas.setText(" CITAS");

        txtInfMascita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        txtInfMascita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setText("TOTAL");

        txtInfCita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfCita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtInfCita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfCita.setText("Información de la citas");

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

        totalCitas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        totalCitas.setForeground(new java.awt.Color(96, 131, 52));

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInfCita, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(Btt_CitasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(txtInfMascita, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(totalCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(TituloCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtInfCita))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInfMascita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(Btt_CitasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        contenedores.addTab("Citas", panelCitas);

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

        contenedores.addTab("Inf Personal", panelDoc);

        panelPassword.setBackground(new java.awt.Color(247, 254, 239));

        TituloContraseña.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloContraseña.setForeground(new java.awt.Color(96, 131, 52));
        TituloContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restablecer-la-contrasena.png"))); // NOI18N
        TituloContraseña.setText(" CAMBIAR CONTRASEÑA");

        txt_contraseñaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaActual.setText("Ingrese contraseña actual:");

        contraN.setBackground(new java.awt.Color(203, 221, 181));
        contraN.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        contraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraNActionPerformed(evt);
            }
        });

        txt_contraseñaNueva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaNueva.setText("Ingrese contraseña nueva:");

        contraA.setBackground(new java.awt.Color(203, 221, 181));
        contraA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        contraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraAActionPerformed(evt);
            }
        });

        txt_confirmarContraseña.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_confirmarContraseña.setText("Confirmar la contraseña nueva:");

        contraNN.setBackground(new java.awt.Color(203, 221, 181));
        contraNN.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        CambiarC.setBackground(new java.awt.Color(151, 183, 112));
        CambiarC.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        CambiarC.setForeground(new java.awt.Color(247, 254, 239));
        CambiarC.setText("Cambiar");
        CambiarC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CambiarC.setMinimumSize(new java.awt.Dimension(70, 30));
        CambiarC.setPreferredSize(new java.awt.Dimension(70, 30));
        CambiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarCActionPerformed(evt);
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
                        .addGap(37, 37, 37)
                        .addComponent(TituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contraA, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(VerOldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_contraseñaActual)
                                .addComponent(contraN)
                                .addComponent(txt_contraseñaNueva)
                                .addComponent(VerNewClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_confirmarContraseña)
                                .addComponent(VerConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraNN)))
                        .addGroup(panelPasswordLayout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(CambiarC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(715, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloContraseña)
                .addGap(56, 56, 56)
                .addComponent(txt_contraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerOldClave)
                .addGap(36, 36, 36)
                .addComponent(txt_contraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerNewClave)
                .addGap(36, 36, 36)
                .addComponent(txt_confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraNN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerConfirmarClave)
                .addGap(45, 45, 45)
                .addComponent(CambiarC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        contenedores.addTab("Contraseña", panelPassword);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ButtonPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPasswordActionPerformed
        animate.selectContraseña(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelPassword);
    }//GEN-LAST:event_ButtonPasswordActionPerformed

    private void ButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogoutActionPerformed
        animate.selectSalir(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
        this.dispose();
    }//GEN-LAST:event_ButtonLogoutActionPerformed

    private void ButtonCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCitaActionPerformed
        animate.selectCitas(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelCitas);
    }//GEN-LAST:event_ButtonCitaActionPerformed

    private void ButtonDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDocActionPerformed
        animate.selectDoctores(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
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

    }//GEN-LAST:event_Btt_NuevoActionPerformed

    private void CambiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarCActionPerformed
String actual = new String(contraA.getPassword());        
    String nueva = new String(contraN.getPassword());
    String verificada = new String(contraNN.getPassword());
    this.controladorDoctor = new ControladorDoctorVeterinario(DV,baseDatos);
    int idDoctor = SesionDoctor.id;

    //primero rectifiquemos que todos los camapos esten llenos
    if (actual.isEmpty() || nueva.isEmpty() || verificada.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor complete los campos vacios.");
        return;
    }
     if (!controladorDoctor.verificarContraseñaActual(idDoctor, actual)) {
       JOptionPane.showMessageDialog(this, "La contraseña actual es incorrecta.");
        return;
     }   
     if (!nueva.equals(verificada)) {
    JOptionPane.showMessageDialog(this, "La nueva contraseña y su verificación no coinciden.");
    return;
}
    if (controladorDoctor.actualizarContraseña(idDoctor, nueva)) {
    JOptionPane.showMessageDialog(this, "Contraseña actualizada con éxito.");
    contraA.setText("");
    contraN.setText("");
    contraNN.setText("");
    } else {
    JOptionPane.showMessageDialog(this, "Error al actualizar la contraseña.");
   }  
    
    }//GEN-LAST:event_CambiarCActionPerformed

    private void contraNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraNActionPerformed

    private void contraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraAActionPerformed
    
    }//GEN-LAST:event_contraAActionPerformed

    private void VerConfirmarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerConfirmarClaveActionPerformed
        if (VerConfirmarClave.isSelected()) {
        contraNN.setEchoChar((char) 0);
    } else {
        contraNN.setEchoChar('•');
    }
    }//GEN-LAST:event_VerConfirmarClaveActionPerformed

    private void VerNewClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerNewClaveActionPerformed
              if (VerNewClave.isSelected()) {
        contraN.setEchoChar((char) 0); // Mostrar texto
    } else {
        contraN.setEchoChar('•'); // Ocultar con puntos
    }
    }//GEN-LAST:event_VerNewClaveActionPerformed

    private void VerOldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerOldClaveActionPerformed
           if (VerOldClave.isSelected()) {
        contraA.setEchoChar((char) 0);
    } else {
        contraA.setEchoChar('•');
    }
    }//GEN-LAST:event_VerOldClaveActionPerformed

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

    private void Btt_CitasProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CitasProgramadasActionPerformed
        CitasProgramadas newframe = new CitasProgramadas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btt_CitasProgramadasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MenuDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloqueApellidos;
    private javax.swing.JTextField BloqueCedula;
    private javax.swing.JTextField BloqueEmail;
    private javax.swing.JTextField BloqueEspecialidad;
    private javax.swing.JTextField BloqueNombre;
    private javax.swing.JTextField BloqueTelefono;
    private javax.swing.JButton Btt_Busqueda;
    private javax.swing.JButton Btt_CitasProgramadas;
    private javax.swing.JButton Btt_Nuevo;
    private javax.swing.JButton ButtonCita;
    private javax.swing.JButton ButtonDoc;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonPassword;
    private javax.swing.JButton CambiarC;
    private javax.swing.JTable TablaDoctores;
    private javax.swing.JLabel TituloCitas;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloDoc;
    private javax.swing.JCheckBox VerConfirmarClave;
    private javax.swing.JCheckBox VerNewClave;
    private javax.swing.JCheckBox VerOldClave;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel cedula;
    public javax.swing.JTabbedPane contenedores;
    private javax.swing.JPasswordField contraA;
    private javax.swing.JPasswordField contraN;
    private javax.swing.JPasswordField contraNN;
    private javax.swing.JLabel email;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelCitas;
    public javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel totalCitas;
    private javax.swing.JLabel txtInfCita;
    private javax.swing.JLabel txtInfMascita;
    private javax.swing.JLabel txt_confirmarContraseña;
    private javax.swing.JLabel txt_contraseñaActual;
    private javax.swing.JLabel txt_contraseñaNueva;
    // End of variables declaration//GEN-END:variables
}