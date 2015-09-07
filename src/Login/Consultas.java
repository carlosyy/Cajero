/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Consultas extends javax.swing.JFrame {

    String usuario;
    String contrasena;
    String tipocuenta;
    String tipotrans;
    int SaldoInicial = 10000000;
    int vrTransaccion;
    int SaldoDisponible = SaldoInicial;

    ArrayList<Usuario> info = new ArrayList<Usuario>();

    public void quemarCodigo() {

        usuario = "usuario";
        contrasena = "clave";
        tipocuenta = "CORRIENTE";
        tipotrans = "RETIRO";        
        vrTransaccion = 500000;

        SaldoDisponible = SaldoInicial - vrTransaccion;

        Usuario user = new Usuario(usuario, contrasena, tipocuenta, tipotrans, SaldoInicial, vrTransaccion, SaldoDisponible);
        info.add(user);

        usuario = "usuario";
        contrasena = "clave";
        tipocuenta = "CORRIENTE";
        tipotrans = "RETIRO";
        SaldoInicial = 9500000;
        vrTransaccion = 1000000;

        SaldoDisponible = SaldoInicial - vrTransaccion;

        Usuario user1 = new Usuario(usuario, contrasena, tipocuenta, tipotrans, SaldoInicial, vrTransaccion, SaldoDisponible);
        info.add(user1);

        usuario = "usuario";
        contrasena = "clave";
        tipocuenta = "CORRIENTE";
        tipotrans = "RETIRO";
        SaldoInicial = 8500000;
        vrTransaccion = 2000000;

        SaldoDisponible = SaldoInicial - vrTransaccion;

        Usuario user2 = new Usuario(usuario, contrasena, tipocuenta, tipotrans, SaldoInicial, vrTransaccion, SaldoDisponible);
        info.add(user2);

        usuario = "usuario";
        contrasena = "clave";
        tipocuenta = "CORRIENTE";
        tipotrans = "CONSIGNACION";
        SaldoInicial = 6500000;
        vrTransaccion = 2000000;

        SaldoDisponible = SaldoInicial + vrTransaccion;

        Usuario user3 = new Usuario(usuario, contrasena, tipocuenta, tipotrans, SaldoInicial, vrTransaccion, SaldoDisponible);
        info.add(user3);

    }

    private Consultas() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private static Consultas instancia = null;

    public static Consultas getInstancia() {
        if (instancia == null) {
            instancia = new Consultas();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPfondo = new javax.swing.JPanel();
        jLbienvenida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLusuario = new javax.swing.JLabel();
        jLcontraseña = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jTcontrasena = new javax.swing.JTextField();
        jBconsultar = new javax.swing.JButton();
        jLinfo1 = new javax.swing.JLabel();
        jLtipocta1 = new javax.swing.JLabel();
        jTtipocta1 = new javax.swing.JTextField();
        jLtipotrans1 = new javax.swing.JLabel();
        jTtipotrans1 = new javax.swing.JTextField();
        jTvrtrans1 = new javax.swing.JTextField();
        jTdisponible1 = new javax.swing.JTextField();
        jLvrtrans1 = new javax.swing.JLabel();
        jLdisponible1 = new javax.swing.JLabel();
        jLalerta = new javax.swing.JLabel();
        jCresultados = new javax.swing.JComboBox();
        jMopciones = new javax.swing.JMenuBar();
        jMarchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPfondo.setBackground(new java.awt.Color(153, 153, 153));

        jLbienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLbienvenida.setText("BIENVENIDO A LA CONSULTA DE SALDOS Y TRANSACCIONES");

        jLusuario.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLusuario.setText("Digite el usuario:");

        jLcontraseña.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLcontraseña.setText("Digite la contraseña:");

        jTusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTusuarioActionPerformed(evt);
            }
        });

        jBconsultar.setBackground(new java.awt.Color(102, 102, 102));
        jBconsultar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jBconsultar.setText("CONSULTAR");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });

        jLinfo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLinfo1.setText("RESUMEN DE LA TRANSACCION:");

        jLtipocta1.setText("Tipo de cuenta:");

        jTtipocta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtipocta1ActionPerformed(evt);
            }
        });

        jLtipotrans1.setText("Tipo de transaccion:");

        jLvrtrans1.setText("Vr transaccion:");

        jLdisponible1.setText("Disonible:");

        jCresultados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLinfo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLalerta, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLusuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLtipocta1)
                                .addGap(18, 18, 18)
                                .addComponent(jTtipocta1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLcontraseña))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLtipotrans1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTtipotrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLvrtrans1)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(jBconsultar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTvrtrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLdisponible1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTdisponible1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jCresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLusuario)
                    .addComponent(jLcontraseña)
                    .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBconsultar))
                .addGap(30, 30, 30)
                .addComponent(jLinfo1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtipocta1)
                    .addComponent(jTtipocta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtipotrans1)
                    .addComponent(jTtipotrans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvrtrans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdisponible1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLvrtrans1)
                    .addComponent(jLdisponible1))
                .addGap(39, 39, 39)
                .addComponent(jCresultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLalerta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );

        javax.swing.GroupLayout jPfondoLayout = new javax.swing.GroupLayout(jPfondo);
        jPfondo.setLayout(jPfondoLayout);
        jPfondoLayout.setHorizontalGroup(
            jPfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfondoLayout.createSequentialGroup()
                .addGroup(jPfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPfondoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLbienvenida))
                    .addGroup(jPfondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPfondoLayout.setVerticalGroup(
            jPfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLbienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMarchivo.setText("Archivo");

        jMenuItem1.setText("Salir del sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMarchivo.add(jMenuItem1);

        jMopciones.add(jMarchivo);

        setJMenuBar(jMopciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed

        this.quemarCodigo();

        if (jTusuario.getText().equals(usuario) && jTcontrasena.getText().equals(contrasena)) {

            for (Usuario consulta : info) {
                jTtipocta1.setText(consulta.getTipocuenta());
                jTtipotrans1.setText(consulta.getTipotrans());
                jTvrtrans1.setText(String.valueOf(consulta.getVrTransaccion()));
                jTdisponible1.setText(String.valueOf(consulta.getSaldoDisponible()));

                jCresultados.addItem("TIPO DE CUENTA: " + consulta.getTipocuenta() + " --TIPO DE TRANSACCION: " + consulta.getTipotrans() + " --VALOR DE LA TRANSACCION: " + consulta.getVrTransaccion() + " --SALDO DISPONIBLE: " + consulta.getSaldoDisponible());

            }
        } else {
            jLalerta.setText("USUARIO NO VALIDO, POR FAVOR INGRESE DE NUEVO LOS DATOS.");

        }

    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTusuarioActionPerformed

    private void jTtipocta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtipocta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtipocta1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconsultar;
    public javax.swing.JComboBox jCresultados;
    private javax.swing.JLabel jLalerta;
    private javax.swing.JLabel jLbienvenida;
    private javax.swing.JLabel jLcontraseña;
    private javax.swing.JLabel jLdisponible1;
    private javax.swing.JLabel jLinfo1;
    private javax.swing.JLabel jLtipocta1;
    private javax.swing.JLabel jLtipotrans1;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JLabel jLvrtrans1;
    private javax.swing.JMenu jMarchivo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jMopciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPfondo;
    private javax.swing.JTextField jTcontrasena;
    private javax.swing.JTextField jTdisponible1;
    private javax.swing.JTextField jTtipocta1;
    private javax.swing.JTextField jTtipotrans1;
    private javax.swing.JTextField jTusuario;
    private javax.swing.JTextField jTvrtrans1;
    // End of variables declaration//GEN-END:variables
}