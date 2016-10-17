/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projobiekt_hotel;

/**
 *
 * @author Bieron
 */
public class MainFrame extends javax.swing.JFrame {

    private static Hotel HotelObj = new Hotel();
    private boolean signinMode;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        userTypeGroup = new javax.swing.ButtonGroup();
        jButtonCheckRooms = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonConfirm = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelNameArea = new javax.swing.JPanel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanelUserType = new javax.swing.JPanel();
        jCheckBoxManager = new javax.swing.JCheckBox();
        jCheckBoxEmployee = new javax.swing.JCheckBox();
        jCheckBoxGuest = new javax.swing.JCheckBox();
        jButtonSignIn = new javax.swing.JButton();
        jButtonLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel main window");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonCheckRooms.setText("Check rooms");
        jButtonCheckRooms.setToolTipText("");
        jButtonCheckRooms.setActionCommand("Check room avalabity");

        jLabel1.setText("Email");
        jLabel1.setToolTipText("");

        jLabel2.setText("Password");

        jButtonConfirm.setText("OK");
        jButtonConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmMouseClicked(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });

        jLabel3.setText("Name");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanelNameAreaLayout = new javax.swing.GroupLayout(jPanelNameArea);
        jPanelNameArea.setLayout(jPanelNameAreaLayout);
        jPanelNameAreaLayout.setHorizontalGroup(
            jPanelNameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNameAreaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanelNameAreaLayout.setVerticalGroup(
            jPanelNameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNameAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNameAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userTypeGroup.add(jCheckBoxManager);
        jCheckBoxManager.setText("Manager");
        jCheckBoxManager.setToolTipText("");

        userTypeGroup.add(jCheckBoxEmployee);
        jCheckBoxEmployee.setText("Employee");

        userTypeGroup.add(jCheckBoxGuest);
        jCheckBoxGuest.setText("Guest");

        javax.swing.GroupLayout jPanelUserTypeLayout = new javax.swing.GroupLayout(jPanelUserType);
        jPanelUserType.setLayout(jPanelUserTypeLayout);
        jPanelUserTypeLayout.setHorizontalGroup(
            jPanelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserTypeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jCheckBoxManager)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxEmployee)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxGuest)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelUserTypeLayout.setVerticalGroup(
            jPanelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserTypeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelUserTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxManager)
                    .addComponent(jCheckBoxEmployee)
                    .addComponent(jCheckBoxGuest))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanelNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoginLayout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanelUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(26, 26, 26)
                .addComponent(jButtonConfirm)
                .addGap(93, 93, 93))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonConfirm))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButtonSignIn.setText("Sign in");
        jButtonSignIn.setName(""); // NOI18N
        jButtonSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSignInMouseClicked(evt);
            }
        });

        jButtonLogIn.setText("Log in");
        jButtonLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonCheckRooms)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckRooms)
                    .addComponent(jButtonSignIn)
                    .addComponent(jButtonLogIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignInMouseClicked
        // TODO add your handling code here:
        this.jPanelLogin.setVisible(true);
        this.jPanelNameArea.setVisible(true);
        this.jPanelUserType.setVisible(true);
        this.jButtonLogIn.setVisible(false);
        this.jButtonSignIn.setVisible(false);
        this.signinMode = true;
    }//GEN-LAST:event_jButtonSignInMouseClicked

    private void jButtonLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogInMouseClicked
        // TODO add your handling code here:
        this.jPanelLogin.setVisible(true);
        this.jPanelNameArea.setVisible(false);
        this.jPanelUserType.setVisible(false);
        this.jButtonLogIn.setVisible(false);
        this.jButtonSignIn.setVisible(false);
        this.signinMode = true;
    }//GEN-LAST:event_jButtonLogInMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.jPanelLogin.setVisible(false);
        this.signinMode = false;
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        // TODO add your handling code here:
        this.jPanelLogin.setVisible(false);
        this.jButtonLogIn.setVisible(true);
        this.jButtonSignIn.setVisible(true);
        this.signinMode = false;
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmMouseClicked
        // TODO add your handling code here:
        this.jPanelLogin.setVisible(false);
        if(this.signinMode) {
            
        }
        else {
            
        }
    }//GEN-LAST:event_jButtonConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCheckRooms;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JCheckBox jCheckBoxEmployee;
    private javax.swing.JCheckBox jCheckBoxGuest;
    private javax.swing.JCheckBox jCheckBoxManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelNameArea;
    private javax.swing.JPanel jPanelUserType;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.ButtonGroup userTypeGroup;
    // End of variables declaration//GEN-END:variables
}
