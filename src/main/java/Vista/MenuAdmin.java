package Vista;

import javax.swing.*;
import java.awt.*;

public class MenuAdmin extends javax.swing.JFrame {
    
    private JTabbedPane panelTabs;
    
    public MenuAdmin() {
        initComponents();
        this.setTitle("Menú Administrador");
        initTabs(); // Inicializar el sistema de pestañas
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void initTabs() {
        panelTabs = new JTabbedPane();
        
        // Crear y agregar los paneles de contenido
        panelTabs.addTab("Citas", new PanelCitas()); // Asume que PanelCitas existe
        panelTabs.addTab("Mascotas", new PanelMascotas());
        panelTabs.addTab("Doctores", new PanelDoctores());
        panelTabs.addTab("Contraseña", new PanelContraseña());
        
        // Ocultar las pestañas superiores (las controlaremos desde el menú lateral)
        panelTabs.setTabPlacement(JTabbedPane.TOP);
        panelTabs.setUI(new javax.swing.plaf.TabbedPaneUI() {
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return 0; // Ocultar el área de pestañas
            }
            protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {}

            @Override
            public int tabForCoordinate(JTabbedPane pane, int x, int y) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Rectangle getTabBounds(JTabbedPane pane, int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int getTabRunCount(JTabbedPane pane) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        });
        
        // Agregar el panel de pestañas al contenedor principal
        contenedorPanel.setLayout(new BorderLayout());
        contenedorPanel.add(panelTabs, BorderLayout.CENTER);
    }
    
    AnimateBTT anim = new AnimateBTT();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        btt_masco = new javax.swing.JPanel();
        btt_mascotas = new javax.swing.JLabel();
        btt_cita = new javax.swing.JPanel();
        btt_citas = new javax.swing.JLabel();
        btt_doc = new javax.swing.JPanel();
        btt_doctores = new javax.swing.JLabel();
        btt_contrase = new javax.swing.JPanel();
        btt_contraseña = new javax.swing.JLabel();
        btt_cerrar = new javax.swing.JPanel();
        btt_salir = new javax.swing.JLabel();
        contenedorPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 254, 239));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(1180, 700));
        setUndecorated(true);

        main.setBackground(new java.awt.Color(247, 254, 239));
        main.setMinimumSize(new java.awt.Dimension(1180, 700));
        main.setPreferredSize(new java.awt.Dimension(1180, 700));
        main.setLayout(new java.awt.BorderLayout());

        menu.setBackground(new java.awt.Color(96, 131, 52));
        menu.setToolTipText("");
        menu.setAutoscrolls(true);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setMinimumSize(new java.awt.Dimension(200, 700));
        menu.setPreferredSize(new java.awt.Dimension(200, 700));
        menu.setRequestFocusEnabled(false);

        nombre.setFont(new java.awt.Font("Artifakt Element Black", 2, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(247, 254, 239));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("PET SCHEDULE");

        btt_masco.setBackground(new java.awt.Color(168, 202, 126));
        btt_masco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btt_masco.setMinimumSize(new java.awt.Dimension(200, 60));
        btt_masco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_mascoMousePressed(evt);
            }
        });

        btt_mascotas.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        btt_mascotas.setForeground(new java.awt.Color(247, 254, 239));
        btt_mascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mascota.png"))); // NOI18N
        btt_mascotas.setText(" Mascotas");
        btt_mascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_mascotasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btt_mascoLayout = new javax.swing.GroupLayout(btt_masco);
        btt_masco.setLayout(btt_mascoLayout);
        btt_mascoLayout.setHorizontalGroup(
            btt_mascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_mascoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btt_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btt_mascoLayout.setVerticalGroup(
            btt_mascoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_mascoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btt_mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        btt_cita.setBackground(new java.awt.Color(168, 202, 126));
        btt_cita.setPreferredSize(new java.awt.Dimension(200, 120));
        btt_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_citaMousePressed(evt);
            }
        });

        btt_citas.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        btt_citas.setForeground(new java.awt.Color(247, 254, 239));
        btt_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario (2).png"))); // NOI18N
        btt_citas.setText(" Citas");
        btt_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_citasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btt_citaLayout = new javax.swing.GroupLayout(btt_cita);
        btt_cita.setLayout(btt_citaLayout);
        btt_citaLayout.setHorizontalGroup(
            btt_citaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_citaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btt_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btt_citaLayout.setVerticalGroup(
            btt_citaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_citaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btt_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btt_doc.setBackground(new java.awt.Color(168, 202, 126));
        btt_doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_docMousePressed(evt);
            }
        });

        btt_doctores.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        btt_doctores.setForeground(new java.awt.Color(247, 254, 239));
        btt_doctores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doctor.png"))); // NOI18N
        btt_doctores.setText(" Doctores");
        btt_doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_doctoresMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btt_docLayout = new javax.swing.GroupLayout(btt_doc);
        btt_doc.setLayout(btt_docLayout);
        btt_docLayout.setHorizontalGroup(
            btt_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_docLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btt_doctores, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btt_docLayout.setVerticalGroup(
            btt_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_docLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btt_doctores, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        btt_contrase.setBackground(new java.awt.Color(168, 202, 126));
        btt_contrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_contraseMousePressed(evt);
            }
        });

        btt_contraseña.setFont(new java.awt.Font("Artifakt Element Black", 0, 15)); // NOI18N
        btt_contraseña.setForeground(new java.awt.Color(247, 254, 239));
        btt_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        btt_contraseña.setText("Cambiar Contraseña");
        btt_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_contraseñaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btt_contraseLayout = new javax.swing.GroupLayout(btt_contrase);
        btt_contrase.setLayout(btt_contraseLayout);
        btt_contraseLayout.setHorizontalGroup(
            btt_contraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btt_contraseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btt_contraseña)
                .addGap(33, 33, 33))
        );
        btt_contraseLayout.setVerticalGroup(
            btt_contraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btt_contraseLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btt_contraseña)
                .addGap(15, 15, 15))
        );

        btt_cerrar.setBackground(new java.awt.Color(168, 202, 126));
        btt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_cerrarMousePressed(evt);
            }
        });

        btt_salir.setFont(new java.awt.Font("Artifakt Element Black", 0, 18)); // NOI18N
        btt_salir.setForeground(new java.awt.Color(247, 254, 239));
        btt_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        btt_salir.setText(" Cerrar Sesión");
        btt_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btt_salirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btt_cerrarLayout = new javax.swing.GroupLayout(btt_cerrar);
        btt_cerrar.setLayout(btt_cerrarLayout);
        btt_cerrarLayout.setHorizontalGroup(
            btt_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_cerrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btt_cerrarLayout.setVerticalGroup(
            btt_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btt_cerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btt_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_contrase, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_cita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btt_masco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btt_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btt_masco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btt_contrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btt_masco.getAccessibleContext().setAccessibleName("");
        btt_masco.getAccessibleContext().setAccessibleDescription("");

        main.add(menu, java.awt.BorderLayout.WEST);
        menu.getAccessibleContext().setAccessibleName("");

        contenedorPanel.setLayout(new java.awt.BorderLayout());
        main.add(contenedorPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btt_mascotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_mascotasMousePressed
        anim.seleccionarMascotas(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
        panelTabs.setSelectedIndex(1);
    }//GEN-LAST:event_btt_mascotasMousePressed

    private void btt_mascoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_mascoMousePressed
        anim.seleccionarMascotas(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(1);
    }//GEN-LAST:event_btt_mascoMousePressed

    private void btt_citasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_citasMousePressed
        anim.seleccionarCitas(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(0);
    }//GEN-LAST:event_btt_citasMousePressed

    private void btt_citaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_citaMousePressed
        anim.seleccionarCitas(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(0);
    }//GEN-LAST:event_btt_citaMousePressed

    private void btt_doctoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_doctoresMousePressed
        anim.seleccionarDoctores(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(2);
    }//GEN-LAST:event_btt_doctoresMousePressed

    private void btt_docMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_docMousePressed
        anim.seleccionarDoctores(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(2);
    }//GEN-LAST:event_btt_docMousePressed

    private void btt_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_contraseñaMousePressed
        anim.seleccionarContraseña(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
         panelTabs.setSelectedIndex(3);
    }//GEN-LAST:event_btt_contraseñaMousePressed

    private void btt_contraseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_contraseMousePressed
        anim.seleccionarContraseña(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
        panelTabs.setSelectedIndex(3);
    }//GEN-LAST:event_btt_contraseMousePressed

    private void btt_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_salirMousePressed
        anim.seleccionarSalir(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btt_salirMousePressed

    private void btt_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_cerrarMousePressed
        anim.seleccionarSalir(btt_cita, btt_citas, btt_masco, btt_mascotas, btt_doc, btt_doctores, btt_contrase, btt_contraseña,btt_cerrar, btt_salir);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btt_cerrarMousePressed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
     });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btt_cerrar;
    private javax.swing.JPanel btt_cita;
    private javax.swing.JLabel btt_citas;
    private javax.swing.JPanel btt_contrase;
    private javax.swing.JLabel btt_contraseña;
    private javax.swing.JPanel btt_doc;
    private javax.swing.JLabel btt_doctores;
    private javax.swing.JPanel btt_masco;
    private javax.swing.JLabel btt_mascotas;
    private javax.swing.JLabel btt_salir;
    private javax.swing.JPanel contenedorPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}

