/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grafica;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author tacom
 */
public class VentanaAd extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAd
     */
    public VentanaAd() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        CONTENT = new javax.swing.JPanel();
        ADMIN = new javax.swing.JLabel();
        CREAR = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout CONTENTLayout = new javax.swing.GroupLayout(CONTENT);
        CONTENT.setLayout(CONTENTLayout);
        CONTENTLayout.setHorizontalGroup(
            CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        CONTENTLayout.setVerticalGroup(
            CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        bg.add(CONTENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 470));

        ADMIN.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ADMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADMIN.setText("ADMIN. TICKETS");
        ADMIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(ADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 120, 50));

        CREAR.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        CREAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CREAR.setText("CREAR TICKET");
        CREAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREARMouseClicked(evt);
            }
        });
        bg.add(CREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        HOME.setBackground(new java.awt.Color(255, 20, 134));
        HOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HOME.setOpaque(true);
        bg.add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREARMouseClicked
        CrearTicket p1= new CrearTicket();
        showpanel(p1);
    }//GEN-LAST:event_CREARMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAd().setVisible(true);
            }
        });
    }
    private void showpanel(JPanel p){
        p.setSize(800,470);
        p.setLocation(0,0);
        CONTENT.removeAll();
        CONTENT.add(p, BorderLayout.CENTER);
        CONTENT.revalidate();
        CONTENT.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMIN;
    private javax.swing.JPanel CONTENT;
    private javax.swing.JLabel CREAR;
    private javax.swing.JLabel HOME;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}
