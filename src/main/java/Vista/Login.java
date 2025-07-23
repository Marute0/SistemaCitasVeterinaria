package Vista;

import Controlador.GeneradorContraseñas;
import Controlador.ControladorAdmin;
import Controlador.ControladorDoctorVeterinario;
import Controlador.LoginAdmin;
import Controlador.LoginDoctor;
import Modelo.Administrador;
import Modelo.BaseDatos;
import Modelo.DoctorVeterinario;
import Modelo.SesionDoctor;
import Vista.MenuAdministrador;
import Vista.MenuDoctor;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

private LoginAdmin LoginAdmin;
private ControladorAdmin controladorAdmin;
private LoginDoctor LoginDoctor;
private BaseDatos baseDatos;
private GeneradorContraseñas generador;
private Administrador ADM;
private ControladorDoctorVeterinario ControladorDoctorVeterinario;
private DoctorVeterinario DV;

    public Login() {
        initComponents();
        tipousuario.setSelectedIndex(-1);
        tipousuario.addActionListener(e -> {
    if (tipousuario.getSelectedItem() != null && 
        "Administrador".equalsIgnoreCase(tipousuario.getSelectedItem().toString())) {
        verificarYCrearAdminInicial();
    }
});

   try {
        // Opción 1 (recomendada): Sin prefijo de paquete
        this.generador = new GeneradorContraseñas(); 
        this.baseDatos = new BaseDatos();
        
        this.LoginAdmin = new Controlador.LoginAdmin(baseDatos, generador);
        this.LoginDoctor = new Controlador.LoginDoctor(baseDatos);
        this.controladorAdmin = new Controlador.ControladorAdmin(baseDatos, ADM);
        this.ControladorDoctorVeterinario = new Controlador.ControladorDoctorVeterinario(DV, baseDatos);
      

        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al inicializar: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void verificarYCrearAdminInicial() {
if (!controladorAdmin.existenAdministradores()) {
String contraseñaa = LoginAdmin.crearUsuarioAdminAutomatico();

if (contraseñaa != null) {
JOptionPane.showMessageDialog(
this,
"¡Sin administradores!\nSe creó el siguiente administrador:\n\n" +
"Usuario: 11041105\n" +
"Contraseña: " + contraseñaa,
"Nuevo Administrador",
JOptionPane.INFORMATION_MESSAGE
);
}
}
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Rigth = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Titulsosoos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        tipousuario = new javax.swing.JComboBox<>();
        contras = new javax.swing.JPasswordField();
        Bingresar = new javax.swing.JButton();
        ckbox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(247, 254, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Rigth.setBackground(new java.awt.Color(96, 131, 52));
        Rigth.setMaximumSize(new java.awt.Dimension(300, 300));
        Rigth.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pet");

        jLabel6.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("schedule");

        javax.swing.GroupLayout RigthLayout = new javax.swing.GroupLayout(Rigth);
        Rigth.setLayout(RigthLayout);
        RigthLayout.setHorizontalGroup(
            RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RigthLayout.createSequentialGroup()
                .addGroup(RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RigthLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RigthLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        RigthLayout.setVerticalGroup(
            RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RigthLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(219, 219, 219))
        );

        jPanel1.add(Rigth);
        Rigth.setBounds(0, 0, 360, 500);

        jPanel2.setBackground(new java.awt.Color(247, 254, 239));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setBackground(new java.awt.Color(96, 131, 52));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 131, 52));
        jLabel1.setText("INICIAR SESIÓN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("USUARIO");

        Titulsosoos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Titulsosoos.setText("TIPO DE USUARIO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        tipousuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Doctor Veterinario" }));
        tipousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipousuarioActionPerformed(evt);
            }
        });

        contras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasActionPerformed(evt);
            }
        });

        Bingresar.setBackground(new java.awt.Color(96, 131, 52));
        Bingresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Bingresar.setForeground(new java.awt.Color(255, 255, 255));
        Bingresar.setText("INGRESAR");
        Bingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BingresarActionPerformed(evt);
            }
        });

        ckbox.setBackground(new java.awt.Color(247, 254, 239));
        ckbox.setText("Ver contraseña");
        ckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(96, 131, 52));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(usuario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Titulsosoos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tipousuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 370, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(contras, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Bingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(Titulsosoos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbox)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 0, 440, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void tipousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipousuarioActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_tipousuarioActionPerformed

    private void BingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BingresarActionPerformed
Object tipo = tipousuario.getSelectedItem();
String tipoo = (String) tipousuario.getSelectedItem();
String documento = usuario.getText().trim();
String contraseña = new String(contras.getPassword()).trim();
String tipoSeleccionado = (tipo != null) ? tipo.toString().trim() : "";
System.out.println(tipoo);

if (tipoSeleccionado.isEmpty() || documento.isEmpty() || contraseña.isEmpty()) {
    JOptionPane.showMessageDialog(this,
        "Por favor complete los campos vacios.",
        "Campos vacíos",
        JOptionPane.WARNING_MESSAGE);
    return; // Detiene la ejecución del login si faltan campos
}

switch (tipoo) {
        case "Administrador":
            if (LoginAdmin.verificarCredencialesAdmin(documento, contraseña)) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión como Administrador, exitoso");
                new MenuAdministrador().setVisible(true); // Abre JFrame del admin
                this.dispose(); // Cierra el login
            } else {
                JOptionPane.showMessageDialog(this, "Datos erroneos, por favor revisa los datos");
            }
            break;

        case "Doctor Veterinario":
            if (LoginDoctor.verificarCredencialesDoctor(documento, contraseña)) {
                DoctorVeterinario doctor = ControladorDoctorVeterinario.obtenerDoctorPorDocumento(documento);

                  if (doctor != null) {
            // Guardamos los datos en la sesión
            SesionDoctor.id = doctor.getID();
            SesionDoctor.correo = doctor.getEmail();
            SesionDoctor.nombre = doctor.getNombre();
            SesionDoctor.apellido = doctor.getApellido();
            SesionDoctor.documento = doctor.getnDocumento();
            SesionDoctor.telefono = doctor.getNumeroTelefono();
            SesionDoctor.especialidad = doctor.getEspecializacion();
            
        }
                JOptionPane.showMessageDialog(this, "Inicio de sesión como Doctor Veterinario, exitoso");
                new MenuDoctor().setVisible(true); // Abre JFrame del doctor
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Datos erroneos, por favor revisa los datos");
            }
            break;

        default:
            JOptionPane.showMessageDialog(this, "Tipo de usuario no válido");
    }

    }//GEN-LAST:event_BingresarActionPerformed

    private void ckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxActionPerformed
        // TODO add your handling code here:
 
        if (ckbox.isSelected()){
            contras.setEchoChar((char)0);
        }
        else{
            contras.setEchoChar('*');
        }
    }//GEN-LAST:event_ckboxActionPerformed

    private void contrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bingresar;
    private javax.swing.JPanel Rigth;
    private javax.swing.JLabel Titulsosoos;
    private javax.swing.JCheckBox ckbox;
    private javax.swing.JPasswordField contras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> tipousuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
