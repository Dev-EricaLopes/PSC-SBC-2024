/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import Classes.Usuario;

/**
 *
 * @author erica
 */
public class TelaCadUsu extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadUsu
     */
    public TelaCadUsu() {
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

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        ckAdm = new javax.swing.JCheckBox();
        txtConfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ckSenha = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 53, 16);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(180, 40, 182, 22);

        jLabel2.setText("E-mail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 80, 37, 16);

        jLabel3.setText("Usuário");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 120, 68, 16);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(180, 80, 182, 22);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 120, 182, 22);

        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 70, 16);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 160, 180, 22);

        ckAdm.setText("Administrador  ");
        getContentPane().add(ckAdm);
        ckAdm.setBounds(80, 270, 160, 25);

        txtConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfSenha);
        txtConfSenha.setBounds(180, 200, 180, 22);

        jLabel5.setText("Confimar Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 90, 16);

        ckSenha.setText("Exibir Senha  ");
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(80, 240, 180, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 60, 0, 2);

        jButton1.setText("Incluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 310, 80, 50);

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 310, 79, 50);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Incluir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Excluir");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Alterar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Consultar");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Fechar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(486, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfSenhaActionPerformed

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed

                if (ckSenha.isSelected()) {
                    // Exibe a senha
                    txtSenha.setEchoChar((char) 0);
                    txtConfSenha.setEchoChar((char) 0);
                } else {
                    // Oculta a senha
                    txtSenha.setEchoChar('*');
                    txtConfSenha.setEchoChar('*');

                }
        
        
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Usuario usu = new Usuario();
        
        usu.setNome(txtNome.getText());
        usu.setEmail(txtEmail.getText());
        usu.setUsuario(txtUsuario.getText());
        usu.setSenha(txtSenha.getText());
        
        usu.inserir();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Usuario usu = new Usuario();
        
        usu.setNome(txtNome.getText());
        usu.setEmail(txtEmail.getText());
        usu.setUsuario(txtUsuario.getText());
        usu.setSenha(txtSenha.getText());
        
        usu.alterar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckAdm;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
