
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
        panelDoc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelPassword = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 254, 239));
        setMinimumSize(new java.awt.Dimension(970, 700));
        setPreferredSize(new java.awt.Dimension(970, 700));

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

        panelDoc.setBackground(new java.awt.Color(247, 254, 239));

        jLabel2.setBackground(new java.awt.Color(96, 131, 52));
        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 131, 52));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estetoscopio.png"))); // NOI18N
        jLabel2.setText(" INFORMACIÓN DE DOCTORES");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jLabel7.setText("Ingresar nombre");

        javax.swing.GroupLayout panelDocLayout = new javax.swing.GroupLayout(panelDoc);
        panelDoc.setLayout(panelDocLayout);
        panelDocLayout.setHorizontalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDocLayout.createSequentialGroup()
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelDocLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137)
                        .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        panelDocLayout.setVerticalGroup(
            panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        contenedores.addTab("Doctores", panelDoc);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JButton ButtonCita;
    private javax.swing.JButton ButtonDoc;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonPassword;
    private javax.swing.JButton ButtonPet;
    private javax.swing.JTabbedPane contenedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelDoc;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelPet;
    // End of variables declaration//GEN-END:variables
}
