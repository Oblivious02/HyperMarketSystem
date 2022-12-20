/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import System.* ;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;


public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LoginLable = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UserNameLable = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JPasswordField();
        ShowPasswordRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginLable.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        LoginLable.setForeground(new java.awt.Color(51, 51, 51));
        LoginLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLable.setText("LOGIN");

        LoginButton.setBackground(new java.awt.Color(0, 153, 153));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 153, 153));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.setToolTipText("");
        ClearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        UserNameLable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserNameLable.setText("User Name:");

        UserNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordLabel.setText("Password:");

        PasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ShowPasswordRadioButton.setText("Show Password");
        ShowPasswordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(LoginLable, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(129, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(UserNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ShowPasswordRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LoginLable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UserNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ShowPasswordRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LoginButton)
                                        .addComponent(ClearButton))
                                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    public static ArrayList<User>Users ;
    public static ArrayList<Product>Products ;

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void ShowPasswordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ShowPasswordRadioButton.isSelected()) {
            PasswordTextField.setEchoChar((char) 0);
        } else {
            PasswordTextField.setEchoChar('*');
        }
    }

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Admin> admins;
        admins = (ArrayList<Admin>) (Object) FileOperations.read("admin.txt");
        String EnteredUsername = UserNameTextField.getText();
        String EnteredPassword = PasswordTextField.getText();
        for (Admin admin: admins) {
            if (Objects.equals(EnteredUsername, admin.getUsername()) && Objects.equals(EnteredPassword, admin.getPassword())) {
                this.setVisible(false);
                new AdminConsole().setVisible(true);
                break;
            }

        }



        Users = (ArrayList<User>) (Object) FileOperations.read("User.txt");
        EnteredUsername = UserNameTextField.getText();
        EnteredPassword = PasswordTextField.getText();

        for (User user: Users) {
            if (Objects.equals(EnteredUsername, user.getUsername()) && Objects.equals(EnteredPassword, user.getPassword())) {
                this.setVisible(false);
                new UserFrame().setVisible(true);
                DefaultTableModel tableModel = (DefaultTableModel) UserFrame.UserTable.getModel();
                Object rowData[] = { user.getID(), user.getUsername() , user.getPassword()
                        , user.getPhoneNumber() ,user.getEmail()};
                tableModel.addRow(rowData);
                Users.remove(user);

                break;
            }

        }

        ArrayList<MarketUser> marketUsers = (ArrayList<MarketUser>) (Object) FileOperations.read("marketUsers.txt");
        EnteredUsername = UserNameTextField.getText();
        EnteredPassword = PasswordTextField.getText();

        Boolean marketUserFound = false;
        for (MarketUser user: marketUsers) {
            if (Objects.equals(EnteredUsername, user.getUsername()) && Objects.equals(EnteredPassword, user.getPassword())) {
                this.setVisible(false);
                new MarketingFrame().setVisible(true);
                marketUserFound = true;
                break;
            }

        }
        if (marketUserFound){
            Products = (ArrayList<Product>) (Object) FileOperations.read("products.txt");
            DefaultTableModel tableModel = (DefaultTableModel) MarketingFrame.ProductTable.getModel();
            for (Product product: Products) {
                Object rowData[] = {String.valueOf(product.getID()), product.getName()};
                tableModel.addRow(rowData);
            }
        }



        ArrayList<Seller> sellers = (ArrayList<Seller>) (Object) FileOperations.read("seller.txt");

        EnteredUsername = UserNameTextField.getText();
        EnteredPassword = PasswordTextField.getText();
        for (Seller seller: sellers) {
            if (Objects.equals(EnteredUsername, seller.getUsername()) && Objects.equals(EnteredPassword, seller.getPassword())) {
                this.setVisible(false);
                new SalesConsole().setVisible(true);
                break;
            }

        }

        ArrayList<Employee> Employees = (ArrayList<Employee>) (Object) FileOperations.read("employee.txt");

        EnteredUsername = UserNameTextField.getText();
        EnteredPassword = PasswordTextField.getText();
        for (Employee Employee: Employees) {
            if (Objects.equals(EnteredUsername, Employee.getUsername()) && Objects.equals(EnteredPassword, Employee.getPassword())) {
                this.setVisible(false);
                new InventoryConsole().setVisible(true);
                break;
            }

        }

    }



    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        UserNameTextField.setText(null);
        PasswordTextField.setText(null);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton ClearButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLable;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JRadioButton ShowPasswordRadioButton;
    private javax.swing.JLabel UserNameLable;
    private javax.swing.JTextField UserNameTextField;

    private javax.swing.JPanel jPanel2;
}

