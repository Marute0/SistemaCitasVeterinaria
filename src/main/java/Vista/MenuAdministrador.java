package Vista;

public class MenuAdministrador extends javax.swing.JFrame {
 
    Animacion animate = new Animacion();
    
    public MenuAdministrador() {
        initComponents();
        configurarPaneles();
        mostrarPanelInicial();
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
        TituloMascotas1 = new javax.swing.JLabel();
        ComboNombre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        ComboApellidos = new javax.swing.JComboBox<>();
        nombre4 = new javax.swing.JLabel();
        ComboCedula = new javax.swing.JComboBox<>();
        nombre5 = new javax.swing.JLabel();
        ComboTelefono = new javax.swing.JComboBox<>();
        nombre6 = new javax.swing.JLabel();
        ComboEmail = new javax.swing.JComboBox<>();
        nombre7 = new javax.swing.JLabel();
        ComboDireccion = new javax.swing.JComboBox<>();
        nombre8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre9 = new javax.swing.JLabel();
        ComboNombrePet = new javax.swing.JComboBox<>();
        nombre10 = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        ComboSexo = new javax.swing.JComboBox<>();
        nombre11 = new javax.swing.JLabel();
        ComboRaza = new javax.swing.JComboBox<>();
        nombre12 = new javax.swing.JLabel();
        Btt_Programar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombre13 = new javax.swing.JLabel();
        ComboFecha = new javax.swing.JComboBox<>();
        nombre14 = new javax.swing.JLabel();
        ComboPrioridad = new javax.swing.JComboBox<>();
        ComboDoctor = new javax.swing.JComboBox<>();
        nombre15 = new javax.swing.JLabel();
        nombre16 = new javax.swing.JLabel();
        ComboEspecialidad = new javax.swing.JComboBox<>();
        Btt_CitasProgramadas = new javax.swing.JButton();
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
        BaseDoctores = new javax.swing.JTable();
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

        TituloMascotas1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloMascotas1.setForeground(new java.awt.Color(96, 131, 52));
        TituloMascotas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        TituloMascotas1.setText(" CITAS");

        ComboNombre.setEditable(true);
        ComboNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombreActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(151, 183, 112));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 183, 112));
        jLabel2.setText("Información Personal");

        nombre3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre3.setForeground(new java.awt.Color(27, 52, 13));
        nombre3.setText("Nombres");

        ComboApellidos.setEditable(true);
        ComboApellidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboApellidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre4.setForeground(new java.awt.Color(27, 52, 13));
        nombre4.setText("Apellidos");

        ComboCedula.setEditable(true);
        ComboCedula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre5.setForeground(new java.awt.Color(27, 52, 13));
        nombre5.setText("Cedula");

        ComboTelefono.setEditable(true);
        ComboTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre6.setForeground(new java.awt.Color(27, 52, 13));
        nombre6.setText("Teléfono");

        ComboEmail.setEditable(true);
        ComboEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboEmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEmailActionPerformed(evt);
            }
        });

        nombre7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre7.setForeground(new java.awt.Color(27, 52, 13));
        nombre7.setText("Email");

        ComboDireccion.setEditable(true);
        ComboDireccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre8.setForeground(new java.awt.Color(27, 52, 13));
        nombre8.setText("Dirección");

        jLabel3.setBackground(new java.awt.Color(151, 183, 112));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(151, 183, 112));
        jLabel3.setText("Información de la Mascota");

        nombre9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre9.setForeground(new java.awt.Color(27, 52, 13));
        nombre9.setText("Nombre de la mascota");

        ComboNombrePet.setEditable(true);
        ComboNombrePet.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboNombrePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNombrePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNombrePetActionPerformed(evt);
            }
        });

        nombre10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre10.setForeground(new java.awt.Color(27, 52, 13));
        nombre10.setText("Tipo");

        ComboTipo.setEditable(true);
        ComboTipo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboSexo.setEditable(true);
        ComboSexo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre11.setForeground(new java.awt.Color(27, 52, 13));
        nombre11.setText("Sexo");

        ComboRaza.setEditable(true);
        ComboRaza.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre12.setForeground(new java.awt.Color(27, 52, 13));
        nombre12.setText("Raza");

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

        jLabel4.setBackground(new java.awt.Color(151, 183, 112));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 183, 112));
        jLabel4.setText("Información de la Cita");

        nombre13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre13.setForeground(new java.awt.Color(27, 52, 13));
        nombre13.setText("Fecha (DD-MM-AAAA)");

        ComboFecha.setEditable(true);
        ComboFecha.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFechaActionPerformed(evt);
            }
        });

        nombre14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre14.setForeground(new java.awt.Color(27, 52, 13));
        nombre14.setText("Prioridad");

        ComboPrioridad.setEditable(true);
        ComboPrioridad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPrioridadActionPerformed(evt);
            }
        });

        ComboDoctor.setEditable(true);
        ComboDoctor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nombre15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre15.setForeground(new java.awt.Color(27, 52, 13));
        nombre15.setText("Doctor");

        nombre16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        nombre16.setForeground(new java.awt.Color(27, 52, 13));
        nombre16.setText("Especialidad");

        ComboEspecialidad.setEditable(true);
        ComboEspecialidad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        ComboEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloMascotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(Btt_Programar, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btt_CitasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre3)
                            .addComponent(nombre4)
                            .addComponent(nombre5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboNombre, 0, 308, Short.MAX_VALUE)
                            .addComponent(ComboApellidos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboCedula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addComponent(nombre8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelCitasLayout.createSequentialGroup()
                                    .addComponent(nombre6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboTelefono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                                    .addComponent(nombre7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                            .addComponent(nombre10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombre12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ComboRaza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                            .addComponent(nombre9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboNombrePet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombre11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                            .addComponent(nombre13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombre14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCitasLayout.createSequentialGroup()
                            .addComponent(nombre15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombre16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ComboEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TituloMascotas1))
                .addGap(10, 10, 10)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre3)
                            .addComponent(ComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre4)
                            .addComponent(ComboApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre5)
                            .addComponent(ComboCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre6))
                        .addGap(18, 18, 18)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre7))
                        .addGap(18, 18, 18)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre8))))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre9)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboNombrePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre11)))
                .addGap(30, 30, 30)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre12)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre10))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre13)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre14)))
                .addGap(30, 30, 30)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre16)
                    .addComponent(ComboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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
                .addGap(83, 83, 83)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
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
        BloqueEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        BaseDoctores.setBackground(new java.awt.Color(247, 248, 246));
        BaseDoctores.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        BaseDoctores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(BaseDoctores);

        jScrollBar1.setBackground(new java.awt.Color(203, 221, 181));

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
                            .addComponent(BloqueEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Btt_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btt_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
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
        // TODO add your handling code here:
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

    private void ComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNombreActionPerformed

    private void ComboNombrePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNombrePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNombrePetActionPerformed

    private void ComboEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEmailActionPerformed

    private void ComboFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboFechaActionPerformed

    private void ComboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPrioridadActionPerformed

    private void Btt_ProgramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_ProgramarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btt_ProgramarActionPerformed

    private void Btt_CitasProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CitasProgramadasActionPerformed
        CitasProgramadas newframe = new CitasProgramadas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btt_CitasProgramadasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAdministrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable BaseDoctores;
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
    private javax.swing.JComboBox<String> ComboApellidos;
    private javax.swing.JComboBox<String> ComboCedula;
    private javax.swing.JComboBox<String> ComboDireccion;
    private javax.swing.JComboBox<String> ComboDoctor;
    private javax.swing.JComboBox<String> ComboEmail;
    private javax.swing.JComboBox<String> ComboEspecialidad;
    private javax.swing.JComboBox<String> ComboFecha;
    private javax.swing.JComboBox<String> ComboNombre;
    private javax.swing.JComboBox<String> ComboNombrePet;
    private javax.swing.JComboBox<String> ComboPrioridad;
    private javax.swing.JComboBox<String> ComboRaza;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JComboBox<String> ComboTelefono;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JPasswordField OldPassword;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloDoc;
    private javax.swing.JLabel TituloMascotas;
    private javax.swing.JLabel TituloMascotas1;
    private javax.swing.JCheckBox VerConfirmarClave;
    private javax.swing.JCheckBox VerNewClave;
    private javax.swing.JCheckBox VerOldClave;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel cedula;
    public javax.swing.JTabbedPane contenedores;
    private javax.swing.JLabel email;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre10;
    private javax.swing.JLabel nombre11;
    private javax.swing.JLabel nombre12;
    private javax.swing.JLabel nombre13;
    private javax.swing.JLabel nombre14;
    private javax.swing.JLabel nombre15;
    private javax.swing.JLabel nombre16;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JLabel nombre6;
    private javax.swing.JLabel nombre7;
    private javax.swing.JLabel nombre8;
    private javax.swing.JLabel nombre9;
    private javax.swing.JPanel panelCitas;
    public javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPet;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel txt_confirmarContraseña;
    private javax.swing.JLabel txt_contraseñaActual;
    private javax.swing.JLabel txt_contraseñaNueva;
    // End of variables declaration//GEN-END:variables
}