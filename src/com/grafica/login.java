/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grafica;

import java.awt.Color;

/**
 *
 * @author tacom
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        jLabel1 = new javax.swing.JLabel();
        BtLogin = new javax.swing.JLabel();
        Tittletext = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BgBt = new javax.swing.JPanel();
        UsuarioTxt = new javax.swing.JLabel();
        UsuarioField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PSWTxt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        PSWField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 20, 134));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        BtLogin.setBackground(new java.awt.Color(255, 20, 134));
        BtLogin.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        BtLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtLogin.setText("ENTRAR");
        BtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtLogin.setOpaque(true);
        BtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtLoginMouseClicked(evt);
            }
        });
        bg.add(BtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 110, 50));

        Tittletext.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Tittletext.setText("INCIAR SESION ");
        bg.add(Tittletext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 10));

        javax.swing.GroupLayout BgBtLayout = new javax.swing.GroupLayout(BgBt);
        BgBt.setLayout(BgBtLayout);
        BgBtLayout.setHorizontalGroup(
            BgBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        BgBtLayout.setVerticalGroup(
            BgBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        bg.add(BgBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, 50));

        UsuarioTxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        UsuarioTxt.setText("USUARIO");
        bg.add(UsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        UsuarioField.setForeground(new java.awt.Color(232, 232, 232));
        UsuarioField.setText("Correo");
        UsuarioField.setBorder(null);
        UsuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioFieldMouseClicked(evt);
            }
        });
        bg.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 450, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 480, 10));

        PSWTxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        PSWTxt.setText("COTRASEÑA");
        bg.add(PSWTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 480, 10));

        PSWField.setForeground(new java.awt.Color(232, 230, 230));
        PSWField.setText("jPasswordField1");
        PSWField.setBorder(null);
        PSWField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PSWFieldMouseClicked(evt);
            }
        });
        bg.add(PSWField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 480, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtLoginMouseClicked
        if("1".equals(UsuarioField.getText())){
            VentanaAd newV = new VentanaAd();
            newV.setVisible(true);
            this.dispose();
        }else if("2".equals(UsuarioField.getText())){
            VentanaAd newV = new VentanaAd();
            newV.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_BtLoginMouseClicked

    private void UsuarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioFieldMouseClicked
       UsuarioField.setText("");
       UsuarioField.setForeground(Color.black);
    }//GEN-LAST:event_UsuarioFieldMouseClicked

    private void PSWFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSWFieldMouseClicked
        PSWField.setText("");
        PSWField.setForeground(Color.black);
    }//GEN-LAST:event_PSWFieldMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgBt;
    private javax.swing.JLabel BtLogin;
    private javax.swing.JPasswordField PSWField;
    private javax.swing.JLabel PSWTxt;
    private javax.swing.JLabel Tittletext;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JLabel UsuarioTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
