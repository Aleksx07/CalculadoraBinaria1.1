/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Desktop;
import java.io.File;

/**
 *
 * @author jonat
 */
public class FrmManual extends javax.swing.JFrame {

    /**
     * Creates new form FrmDecimal
     */
    public FrmManual() {
        // Inicializa los componentes de la interfaz.
        initComponents();
    }

    public void abrirAyuda() {
        try {
            // Intenta abrir un archivo PDF utilizando la aplicación predeterminada del sistema.
            Desktop.getDesktop().open(new File("src/Manual/Manual.pdf"));
        } catch (Exception e) {
            // Si ocurre alguna excepción, se captura y se muestra en la consola.
            System.out.println(e);
        }
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
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AbrirPDF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 0, 17)); // NOI18N
        jLabel8.setText("Calculadora Binaria");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 5, 170, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 35, 585, 2);

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/cerrar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(539, 6, 26, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/idea.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(23, 265, 32, 32);

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción de Aplicación ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(66, 269, 205, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/1.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 590, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/ManualO.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(245, 60, 100, 100);

        AbrirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/AbrirPDF.png"))); // NOI18N
        AbrirPDF.setContentAreaFilled(false);
        AbrirPDF.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/AbrirPDFOver.png"))); // NOI18N
        AbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirPDFActionPerformed(evt);
            }
        });
        jPanel1.add(AbrirPDF);
        AbrirPDF.setBounds(170, 193, 246, 65);

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Manual De Ayuda");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(225, 155, 140, 32);

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Esta aplicación cuenta con tres módulos para la conversión de números binarios");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(25, 305, 520, 28);

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("a diferentes sistemas de numeración.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(25, 328, 240, 28);

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Entre ellos podemos encontrar los siguientes:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(25, 355, 300, 28);

        jLabel11.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("- Binario a Decimal: Introducimos el número binario que deseamos convertir");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 385, 500, 28);

        jLabel12.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("a Decimal, presionamos el botón de \"Realizar Conversión\" y podemos ver el");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 410, 500, 28);

        jLabel13.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("número en su forma decimal.");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 435, 500, 28);

        jLabel14.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("y podemos ver el número en su forma Hexadecimal.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 520, 500, 28);

        jLabel15.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setText("convertir a Hexadecimal, presionamos el botón de \"Realizar Conversión\"");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 495, 500, 28);

        jLabel16.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("- Binario a Hexadecimal: Introducimos el número binario que deseamos");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 470, 500, 28);

        jLabel18.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 51));
        jLabel18.setText("a Octal, presionamos el botón de \"Realizar Conversión\" y podemos ver el");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(40, 585, 500, 28);

        jLabel17.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 51));
        jLabel17.setText("número en su forma Octal.");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 610, 500, 28);

        jLabel19.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 51));
        jLabel19.setText("- Binario a Octal: Introducimos el número binario que deseamos convertir");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(40, 560, 500, 28);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/img/3A.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 580, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirPDFActionPerformed
        //es una llamada a una función o método llamado "abrirAyuda". Para proporcionar comentarios 
        //más detallados, necesitaría conocer el contenido de la función "abrirAyuda".
        abrirAyuda(); // TODO add your handling code here:
    }//GEN-LAST:event_AbrirPDFActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        // Crea una nueva instancia de la clase FrmMenu.
        FrmMenu ingreso = new FrmMenu();
        // Muestra la ventana FrmMenu.
        ingreso.show();
        // Cierra la ventana actual o la ventana en la que se ejecuta este código.
        dispose();
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
            java.util.logging.Logger.getLogger(FrmManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
