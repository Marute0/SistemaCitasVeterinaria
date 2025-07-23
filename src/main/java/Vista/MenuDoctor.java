package Vista;

import Controlador.ControladorDoctorVeterinario;
import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import Modelo.SesionDoctor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MenuDoctor extends javax.swing.JFrame {
 
    AnimacionDoc animate = new AnimacionDoc();

    private ControladorDoctorVeterinario controladorDoctor;
    private BaseDatos baseDatos;
    private DoctorVeterinario DV;
    private TableRowSorter<DefaultTableModel> sorter;

    
    public MenuDoctor() {
        initComponents();
        int idDoctor = SesionDoctor.id;
        String correo = SesionDoctor.correo;
        String nombre = SesionDoctor.nombre;
        String apellido = SesionDoctor.apellido;
        String documento = SesionDoctor.documento;
        String telefono = SesionDoctor.telefono;
        String especialidad = SesionDoctor.especialidad;
             
        configurarPaneles();
        mostrarPanelInicial();
        
        
        try{
            this.baseDatos = new BaseDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al inicializar:" + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }

        //metodo q cuenta citas del doctor y las visualiza
        controladorDoctor = new ControladorDoctorVeterinario(DV, baseDatos);
        int cantidad = controladorDoctor.contarCitasPorDoctor(idDoctor);
        totalCitas.setText("" + cantidad);
         List<Object[]> citas = controladorDoctor.obtenerCitasPorDoctor(idDoctor);
         llenarTablaCitas(idDoctor);
     
        // visualizacion de los datos del doctor
        Nombres.setText(nombre);
        Apellidos.setText(apellido);
        Cedula.setText(documento);
        Telefono.setText(telefono);
        Email.setText(correo);
        Especialidad.setText(especialidad);
        
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
 

    private void llenarTablaCitas(int idDoctor){
        DefaultTableModel modelo = (DefaultTableModel) TablaCitas.getModel();
        modelo.setRowCount(0); // Limpiar tabla antes de llenarla

    List<Object[]> citas = controladorDoctor.obtenerCitasPorDoctor(idDoctor);
    for (Object[] fila : citas) {
        modelo.addRow(fila);
    }
    sorter = new TableRowSorter<>(modelo);
    TablaCitas.setRowSorter(sorter);
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
        Bbloq = new javax.swing.JButton();
        totalCitas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Buscador = new javax.swing.JTextField();
        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCitas = new javax.swing.JTable();
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
        panelDoc = new javax.swing.JPanel();
        TituloDoc = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        especialidad = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Especialidad = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cedula = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();

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
        menu.add(ButtonCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 60));

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
        menu.add(ButtonDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 60));

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
        panelCitas.setForeground(new java.awt.Color(96, 131, 52));

        TituloCitas.setFont(new java.awt.Font("Swis721 Blk BT", 0, 48)); // NOI18N
        TituloCitas.setForeground(new java.awt.Color(96, 131, 52));
        TituloCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        TituloCitas.setText(" CITAS");

        txtInfMascita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        txtInfMascita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfMascita.setText("TOTAL");

        txtInfCita.setBackground(new java.awt.Color(151, 183, 112));
        txtInfCita.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtInfCita.setForeground(new java.awt.Color(151, 183, 112));
        txtInfCita.setText("Información de la citas");

        Bbloq.setBackground(new java.awt.Color(151, 183, 112));
        Bbloq.setFont(new java.awt.Font("Swis721 Blk BT", 0, 15)); // NOI18N
        Bbloq.setForeground(new java.awt.Color(247, 254, 239));
        Bbloq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-de-lupa.png"))); // NOI18N
        Bbloq.setText("  Buscador por fechas");
        Bbloq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bbloq.setMaximumSize(new java.awt.Dimension(100, 50));
        Bbloq.setMinimumSize(new java.awt.Dimension(100, 50));
        Bbloq.setPreferredSize(new java.awt.Dimension(100, 50));
        Bbloq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbloqActionPerformed(evt);
            }
        });

        totalCitas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        totalCitas.setForeground(new java.awt.Color(96, 131, 52));

        jSeparator1.setForeground(new java.awt.Color(96, 131, 52));

        jSeparator2.setForeground(new java.awt.Color(96, 131, 52));

        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });

        jScrollBar2.setBackground(new java.awt.Color(151, 183, 112));

        TablaCitas.setBackground(new java.awt.Color(203, 221, 181));
        TablaCitas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        TablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Nivel de Prioridad", "ID Mascota", "Mascota", "Especie", "ID Dueño", "Dueño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaCitas);
        if (TablaCitas.getColumnModel().getColumnCount() > 0) {
            TablaCitas.getColumnModel().getColumn(0).setResizable(false);
            TablaCitas.getColumnModel().getColumn(1).setResizable(false);
            TablaCitas.getColumnModel().getColumn(2).setResizable(false);
            TablaCitas.getColumnModel().getColumn(3).setResizable(false);
            TablaCitas.getColumnModel().getColumn(4).setResizable(false);
            TablaCitas.getColumnModel().getColumn(5).setResizable(false);
            TablaCitas.getColumnModel().getColumn(6).setResizable(false);
            TablaCitas.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInfCita, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitasLayout.createSequentialGroup()
                        .addComponent(totalCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitasLayout.createSequentialGroup()
                        .addComponent(txtInfMascita, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bbloq, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TituloCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInfCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bbloq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscador))
                        .addGap(33, 33, 33))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInfMascita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        contenedores.addTab("Citas", panelCitas);

        panelPassword.setBackground(new java.awt.Color(247, 254, 239));

        TituloContraseña.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloContraseña.setForeground(new java.awt.Color(96, 131, 52));
        TituloContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restablecer-la-contrasena.png"))); // NOI18N
        TituloContraseña.setText(" CAMBIAR CONTRASEÑA");

        txt_contraseñaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaActual.setForeground(new java.awt.Color(96, 131, 52));
        txt_contraseñaActual.setText("Ingrese contraseña actual:");

        contraN.setBackground(new java.awt.Color(203, 221, 181));
        contraN.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        contraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraNActionPerformed(evt);
            }
        });

        txt_contraseñaNueva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_contraseñaNueva.setForeground(new java.awt.Color(96, 131, 52));
        txt_contraseñaNueva.setText("Ingrese contraseña nueva:");

        contraA.setBackground(new java.awt.Color(203, 221, 181));
        contraA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        contraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraAActionPerformed(evt);
            }
        });

        txt_confirmarContraseña.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txt_confirmarContraseña.setForeground(new java.awt.Color(96, 131, 52));
        txt_confirmarContraseña.setText("Confirmar la contraseña nueva:");

        contraNN.setBackground(new java.awt.Color(203, 221, 181));
        contraNN.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        CambiarC.setBackground(new java.awt.Color(151, 183, 112));
        CambiarC.setFont(new java.awt.Font("Swis721 Blk BT", 0, 16)); // NOI18N
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
                        .addGap(106, 106, 106)
                        .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contraA)
                            .addComponent(VerOldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contraseñaActual)
                            .addComponent(contraN)
                            .addComponent(txt_contraseñaNueva)
                            .addComponent(VerNewClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_confirmarContraseña)
                            .addComponent(VerConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraNN, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(CambiarC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(TituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(678, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloContraseña)
                .addGap(37, 37, 37)
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
                .addGap(37, 37, 37)
                .addComponent(CambiarC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        contenedores.addTab("Contraseña", panelPassword);

        panelDoc.setBackground(new java.awt.Color(247, 254, 239));

        TituloDoc.setBackground(new java.awt.Color(96, 131, 52));
        TituloDoc.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloDoc.setForeground(new java.awt.Color(96, 131, 52));
        TituloDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estetoscopio.png"))); // NOI18N
        TituloDoc.setText(" INFORMACIÓN PERSONAL");

        apellido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        apellido.setForeground(new java.awt.Color(27, 52, 13));
        apellido.setText("Apellidos:");

        telefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        telefono.setForeground(new java.awt.Color(27, 52, 13));
        telefono.setText("Teléfono:");

        especialidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        especialidad.setForeground(new java.awt.Color(27, 52, 13));
        especialidad.setText("Especialidad:");

        Apellidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(27, 52, 13));
        Apellidos.setText("Ar");

        Especialidad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Especialidad.setForeground(new java.awt.Color(27, 52, 13));
        Especialidad.setText("Oto");

        Telefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Telefono.setForeground(new java.awt.Color(27, 52, 13));
        Telefono.setText("313");

        jPanel1.setBackground(new java.awt.Color(203, 221, 181));

        nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        nombre.setForeground(new java.awt.Color(27, 52, 13));
        nombre.setText("Nombres:");

        Nombres.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Nombres.setForeground(new java.awt.Color(27, 52, 13));
        Nombres.setText("Ra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(203, 221, 181));

        cedula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cedula.setForeground(new java.awt.Color(27, 52, 13));
        cedula.setText("Cédula:");

        Cedula.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Cedula.setForeground(new java.awt.Color(27, 52, 13));
        Cedula.setText("1090");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Cedula))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(203, 221, 181));

        email.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(27, 52, 13));
        email.setText("Email:");

        Email.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        Email.setForeground(new java.awt.Color(27, 52, 13));
        Email.setText("@");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(599, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelDocLayout = new javax.swing.GroupLayout(panelDoc);
        panelDoc.setLayout(panelDocLayout);
        panelDocLayout.setHorizontalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(especialidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(apellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(62, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        panelDocLayout.setVerticalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(TituloDoc)
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(Apellidos))
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidad)
                    .addComponent(Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        contenedores.addTab("Inf Personal", panelDoc);

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
        new Login().setVisible(true);
    }//GEN-LAST:event_ButtonLogoutActionPerformed

    private void ButtonCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCitaActionPerformed
        animate.selectCitas(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelCitas);
    }//GEN-LAST:event_ButtonCitaActionPerformed

    private void ButtonDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDocActionPerformed
        animate.selectDoctores(ButtonCita, ButtonDoc, ButtonPassword, ButtonLogout);
        contenedores.setSelectedComponent(panelDoc);
    }//GEN-LAST:event_ButtonDocActionPerformed

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

    private void BbloqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbloqActionPerformed
Bbloq.setEnabled(false);  
    }//GEN-LAST:event_BbloqActionPerformed

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
 String texto = Buscador.getText().trim();
    
    // Verificar que es una fecha válida (opcional pero recomendable)
    if (!texto.matches("\\d{4}-\\d{2}-\\d{2}") && !texto.isEmpty()) {
        sorter.setRowFilter(null); 
        JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Por favor usa el formato AAAA-MM-DD (Ej: 2025-07-24)", "Fecha no válida", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (texto.isEmpty()) {
        sorter.setRowFilter(null); 
    } else {
        
        sorter.setRowFilter(RowFilter.regexFilter("^" + texto, 0));
    }


    }//GEN-LAST:event_BuscadorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MenuDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JButton Bbloq;
    private javax.swing.JTextField Buscador;
    private javax.swing.JButton ButtonCita;
    private javax.swing.JButton ButtonDoc;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonPassword;
    private javax.swing.JButton CambiarC;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JLabel Nombres;
    public javax.swing.JTable TablaCitas;
    private javax.swing.JLabel Telefono;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelDoc;
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