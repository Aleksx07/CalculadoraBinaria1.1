/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author jonatddede
 */
public class FrmMenu extends javax.swing.JFrame {

    /**deddeded
     * Creates new form Menu
     */
    public FrmMenu() {
       // Inicializa los componentes de la interfaz.
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnbiDecimal = new javax.swing.JButton();
        btnbiHexa = new javax.swing.JButton();
        btnbioctual = new javax.swing.JButton();
        btnManual = new javax.swing.JButton();
        btnDesarrolladores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/datosBinariosO.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(125, 86, 100, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/1.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 610, 350, 35);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 608, 350, 2);

        btnbiDecimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/Decimal.png"))); // NOI18N
        btnbiDecimal.setContentAreaFilled(false);
        btnbiDecimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/DecimalOver.png"))); // NOI18N
        btnbiDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiDecimalActionPerformed(evt);
            }
        });
        jPanel1.add(btnbiDecimal);
        btnbiDecimal.setBounds(50, 255, 246, 65);

        btnbiHexa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/Hexadecimal.png"))); // NOI18N
        btnbiHexa.setContentAreaFilled(false);
        btnbiHexa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/HexadecimalOver.png"))); // NOI18N
        btnbiHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiHexaActionPerformed(evt);
            }
        });
        jPanel1.add(btnbiHexa);
        btnbiHexa.setBounds(50, 325, 246, 65);

        btnbioctual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/Octal.png"))); // NOI18N
        btnbioctual.setContentAreaFilled(false);
        btnbioctual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/OctalOver.png"))); // NOI18N
        btnbioctual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbioctualActionPerformed(evt);
            }
        });
        jPanel1.add(btnbioctual);
        btnbioctual.setBounds(50, 395, 246, 65);

        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/Manual.png"))); // NOI18N
        btnManual.setContentAreaFilled(false);
        btnManual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/ManualOver.png"))); // NOI18N
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });
        jPanel1.add(btnManual);
        btnManual.setBounds(50, 466, 246, 65);

        btnDesarrolladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/Desarrolladores.png"))); // NOI18N
        btnDesarrolladores.setContentAreaFilled(false);
        btnDesarrolladores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/DesarrolladoresOver.png"))); // NOI18N
        btnDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesarrolladoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesarrolladores);
        btnDesarrolladores.setBounds(50, 535, 246, 65);

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menú Principal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(57, 185, 240, 62);

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Calculadora Binaria");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(73, 45, 200, 42);

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/cerrar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(315, 6, 26, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 350, 35);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 35, 350, 2);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/3A.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 350, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbiDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiDecimalActionPerformed
        // TODO add your handling code here:
        // Crea una nueva instancia de la clase FrmDecimal.
FrmDecimal ingreso = new FrmDecimal();

// Hace visible la ventana FrmDecimal, mostrándola en la interfaz de usuario.
ingreso.setVisible(true);

// Cierra la ventana actual o la ventana en la que se ejecuta este código.
dispose();
    }//GEN-LAST:event_btnbiDecimalActionPerformed

    private void btnbiHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiHexaActionPerformed
        // TODO add your handling code here:
       // Crea una nueva instancia del formulario FrmHexadecimal.
FrmHexadecimal ingreso = new FrmHexadecimal();

// Hace visible la ventana FrmHexadecimal, mostrándola en la interfaz de usuario.
ingreso.setVisible(true);

// Cierra la ventana actual desde la que se llama este código.
dispose();
    }//GEN-LAST:event_btnbiHexaActionPerformed

    private void btnbioctualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbioctualActionPerformed
        // TODO add your handling code here:
      // Crea una nueva instancia del formulario FrmOctal.
FrmOctal ingreso = new FrmOctal();

// Hace visible la ventana FrmOctal, mostrándola en la interfaz de usuario.
ingreso.setVisible(true);

// Cierra la ventana actual desde la que se llama este código.
dispose();
    }//GEN-LAST:event_btnbioctualActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        // TODO add your handling code here:
       // Crea una nueva instancia del formulario FrmManual.
FrmManual ingreso = new FrmManual();

// Hace visible la ventana FrmManual, mostrándola en la interfaz de usuario.
ingreso.setVisible(true);

// Cierra la ventana actual desde la que se llama este código.
dispose();
    }//GEN-LAST:event_btnManualActionPerformed

    private void btnDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesarrolladoresActionPerformed
        // TODO add your handling code here:
        // Crea una nueva instancia del formulario FrmDesarrolladores.
        FrmDesarrollladores ingreso = new FrmDesarrollladores();
        // Hace visible la ventana FrmDesarrolladores, mostrándola en la interfaz de usuario.
        ingreso.setVisible(true);
        // Cierra la ventana actual desde la que se llama este código.
        dispose();
    }//GEN-LAST:event_btnDesarrolladoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        // Finaliza la ejecución del programa Java de manera abrupta.
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesarrolladores;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbiDecimal;
    private javax.swing.JButton btnbiHexa;
    private javax.swing.JButton btnbioctual;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
