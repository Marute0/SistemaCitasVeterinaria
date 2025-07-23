
package Vista;

public class CitasProgramadas extends javax.swing.JFrame {

    public CitasProgramadas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloMascotas1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btt_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 254, 239));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloMascotas1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        TituloMascotas1.setForeground(new java.awt.Color(96, 131, 52));
        TituloMascotas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar.png"))); // NOI18N
        TituloMascotas1.setText("FILTRO DE CITAS PROGRAMADAS");
        jPanel1.add(TituloMascotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 23, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 105, 850, -1));

        Btt_Volver.setBackground(new java.awt.Color(168, 202, 126));
        Btt_Volver.setFont(new java.awt.Font("Swis721 Blk BT", 0, 16)); // NOI18N
        Btt_Volver.setForeground(new java.awt.Color(247, 254, 239));
        Btt_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Btt_Volver.setText("Volver");
        Btt_Volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btt_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Btt_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 550, 108, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_VolverActionPerformed
        MenuAdministrador newframe = new MenuAdministrador();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btt_VolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitasProgramadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btt_Volver;
    private javax.swing.JLabel TituloMascotas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
