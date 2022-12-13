/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Users.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author kenzy
 */
public  class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFramee
     */
    public UserFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        LogOutButton = new javax.swing.JButton();
        UpdateInfoButton = new javax.swing.JButton();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserTable.setModel(new javax.swing.table.DefaultTableModel(


                new Object [][] {

                },
                new String [] {
                        "UserName", "Password", "phone number", "E-mail", "ID"
                }
        ));;
        jScrollPane2.setViewportView(UserTable);

        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        UpdateInfoButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateInfoButton.setText("Update your info");
        UpdateInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateInfoButtonActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextArea2.setRows(1);
        jTextArea2.setText("User Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(171, 171, 171)
                                                                )
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(207, 207, 207)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(UpdateInfoButton)
                                                                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(UpdateInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>

    private void UpdateInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("jojojoj");
                System.out.println("jojojoj");
            }
        });
    }


    private void ShowUserInfo(java.awt.event.ActionEvent evt) {
        ArrayList<User> Users = new ArrayList<>();
        Users = (ArrayList<User>) (Object) FileOperations.read("User.txt");
        DefaultTableModel tableModel = (DefaultTableModel) UserTable.getModel();
        JTable table = new JTable(tableModel);
        for (User user: Users) {
            Object rowData[] = { user.getUsername(), user.getPassword() , user.getPhoneNumber()
                    , user.getEmail() ,user.getID(),};
            tableModel.addRow(rowData);
        }
    }

    private void LogOutActionPerformed (java.awt.event.ActionEvent evt)
    {
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }

    
    // Variables declaration - do not modify
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton UpdateInfoButton;
    public static javax.swing.JTable UserTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration
}