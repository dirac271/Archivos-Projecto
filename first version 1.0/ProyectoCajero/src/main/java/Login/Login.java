/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO REQUENA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Fondo = new javax.swing.JPanel();
        BarraIzq = new javax.swing.JPanel();
        BotonOpciones = new javax.swing.JButton();
        BotonOpciones1 = new javax.swing.JButton();
        BotonOpciones2 = new javax.swing.JButton();
        PanelDeUsuario = new javax.swing.JPanel();
        PanelDeAdmin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(901, 518));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setMinimumSize(new java.awt.Dimension(400, 400));

        BarraIzq.setBackground(new java.awt.Color(255, 255, 255));

        BotonOpciones.setBackground(new java.awt.Color(255, 255, 255));
        BotonOpciones.setFont(new java.awt.Font("Helonia", 1, 24)); // NOI18N
        BotonOpciones.setText("Manual Tecnico");
        BotonOpciones.setBorder(null);
        BotonOpciones.setBorderPainted(false);
        BotonOpciones.setFocusPainted(false);
        BotonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpcionesActionPerformed(evt);
            }
        });

        BotonOpciones1.setBackground(new java.awt.Color(255, 255, 255));
        BotonOpciones1.setFont(new java.awt.Font("Helonia", 1, 24)); // NOI18N
        BotonOpciones1.setText("Opciones");
        BotonOpciones1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BotonOpciones1.setBorderPainted(false);
        BotonOpciones1.setFocusPainted(false);
        BotonOpciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpciones1ActionPerformed(evt);
            }
        });

        BotonOpciones2.setBackground(new java.awt.Color(255, 255, 255));
        BotonOpciones2.setFont(new java.awt.Font("Helonia", 1, 24)); // NOI18N
        BotonOpciones2.setText("Manual de Usuario");
        BotonOpciones2.setBorder(null);
        BotonOpciones2.setFocusPainted(false);
        BotonOpciones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpciones2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraIzqLayout = new javax.swing.GroupLayout(BarraIzq);
        BarraIzq.setLayout(BarraIzqLayout);
        BarraIzqLayout.setHorizontalGroup(
            BarraIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonOpciones2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(BotonOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonOpciones1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap())
        );
        BarraIzqLayout.setVerticalGroup(
            BarraIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraIzqLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(BotonOpciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(BotonOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BotonOpciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelDeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        PanelDeUsuario.setMinimumSize(new java.awt.Dimension(400, 400));
        PanelDeUsuario.setLayout(new java.awt.BorderLayout());

        PanelDeAdmin.setBackground(new java.awt.Color(255, 255, 255));
        PanelDeAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelDeAdmin.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(BarraIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(PanelDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(PanelDeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonOpcionesActionPerformed

    private void BotonOpciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonOpciones1ActionPerformed

    private void BotonOpciones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpciones2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonOpciones2ActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraIzq;
    private javax.swing.JButton BotonOpciones;
    private javax.swing.JButton BotonOpciones1;
    private javax.swing.JButton BotonOpciones2;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelDeAdmin;
    private javax.swing.JPanel PanelDeUsuario;
    // End of variables declaration//GEN-END:variables
}
