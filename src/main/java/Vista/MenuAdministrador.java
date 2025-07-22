
package Vista;

import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.UIManager;

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
                evt.consume();
            }
        }
    });
    
    // Opcional: Hacer que las pestañas parezcan deshabilitadas
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
        jLabel3 = new javax.swing.JLabel();
        panelPet = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelPassword = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelDoc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 131, 52));
        jLabel3.setText("CITAS");

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1058, Short.MAX_VALUE))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(596, Short.MAX_VALUE))
        );

        contenedores.addTab("Citas", panelCitas);

        panelPet.setBackground(new java.awt.Color(247, 254, 239));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 131, 52));
        jLabel5.setText("INFORMACIÓN DE MASCOTAS");

        javax.swing.GroupLayout panelPetLayout = new javax.swing.GroupLayout(panelPet);
        panelPet.setLayout(panelPetLayout);
        panelPetLayout.setHorizontalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPetLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        panelPetLayout.setVerticalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPetLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(594, Short.MAX_VALUE))
        );

        contenedores.addTab("Mascotas", panelPet);

        panelPassword.setBackground(new java.awt.Color(247, 254, 239));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 131, 52));
        jLabel4.setText("CAMBIAR CONTRASEÑA");

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(850, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(599, Short.MAX_VALUE))
        );

        contenedores.addTab("Contraseña", panelPassword);

        panelDoc.setBackground(new java.awt.Color(247, 254, 239));

        jLabel2.setBackground(new java.awt.Color(96, 131, 52));
        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 131, 52));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estetoscopio.png"))); // NOI18N
        jLabel2.setText(" INFORMACIÓN DE DOCTORES");

        BloqueNombre.setText("*");
        BloqueNombre.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueNombreActionPerformed(evt);
            }
        });

        BloqueCedula.setText("*");
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

        BloqueEspecialidad.setText("*");
        BloqueEspecialidad.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueEspecialidad.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueEspecialidadActionPerformed(evt);
            }
        });

        BloqueApellidos.setText("*");
        BloqueApellidos.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueApellidos.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueApellidosActionPerformed(evt);
            }
        });

        BloqueEmail.setText("*");
        BloqueEmail.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueEmail.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueEmailActionPerformed(evt);
            }
        });

        BloqueTelefono.setText("*");
        BloqueTelefono.setMinimumSize(new java.awt.Dimension(300, 30));
        BloqueTelefono.setPreferredSize(new java.awt.Dimension(300, 30));
        BloqueTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloqueTelefonoActionPerformed(evt);
            }
        });

        Btt_Busqueda.setLabel("Buscar");
        Btt_Busqueda.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_Busqueda.setMinimumSize(new java.awt.Dimension(100, 50));
        Btt_Busqueda.setPreferredSize(new java.awt.Dimension(100, 50));

        Btt_Nuevo.setLabel("Nuevo Doctor");
        Btt_Nuevo.setMaximumSize(new java.awt.Dimension(100, 50));
        Btt_Nuevo.setMinimumSize(new java.awt.Dimension(75, 20));
        Btt_Nuevo.setPreferredSize(new java.awt.Dimension(100, 50));
        Btt_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDocLayout = new javax.swing.GroupLayout(panelDoc);
        panelDoc.setLayout(panelDocLayout);
        panelDocLayout.setHorizontalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(apellido)
                            .addComponent(cedula))
                        .addGap(18, 18, 18)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BloqueCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addComponent(BloqueApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDocLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(BloqueNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(email)
                    .addComponent(especialidad))
                .addGap(21, 21, 21)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BloqueEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloqueTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloqueEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btt_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(Btt_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        panelDocLayout.setVerticalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
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
                .addContainerGap(389, Short.MAX_VALUE))
        );

        Btt_Nuevo.getAccessibleContext().setAccessibleName("Nuevo Doctor");

        contenedores.addTab("Doctores", panelDoc);

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

    public static void main(String args[]) {
        /* Set the Nimbus <<<<<<<<<<<<<<look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
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
    private javax.swing.JButton Btt_Nuevo;
    private javax.swing.JButton ButtonCita;
    private javax.swing.JButton ButtonDoc;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonPassword;
    private javax.swing.JButton ButtonPet;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel cedula;
    private javax.swing.JTabbedPane contenedores;
    private javax.swing.JLabel email;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPet;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
