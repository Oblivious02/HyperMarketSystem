/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import System.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Objects;

import static GUI.LoginFrame.Products;

/**
 *
 * @author Mohamed Kandeel
 */
public class InventoryConsole extends javax.swing.JFrame {

    /**
     * Creates new form InventoryConsole
     */
    public InventoryConsole() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTableInventory = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Inventory Dashboard");

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setBackground(new java.awt.Color(0, 153, 153));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setBackground(new java.awt.Color(0, 153, 153));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setBackground(new java.awt.Color(0, 153, 153));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        listButton.setText("List");
        listButton.setBackground(new java.awt.Color(0, 153, 153));
        listButton.setForeground(new java.awt.Color(255, 255, 255));
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listButtonMouseClicked(evt);
            }
        });

        productsTableInventory.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Price", "Expriry Date", "Quantity", "Discount", "Category"
                }
        ));
        productsTableInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsTableInventoryMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(productsTableInventory);

        searchButton.setText("Search");
        searchButton.setBackground(new java.awt.Color(0, 153, 153));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        jLabel2.setText("Report from Marketing Team:");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));


        logoutButton.setBackground(new java.awt.Color(0, 153, 153));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(185, 185, 185)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        productsTableInventory.setBackground(new java.awt.Color(204, 204, 204));
        productsTableInventory.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Price", "Expriry Date", "Quantity", "Discount", "Category"
                }
        ));
        jScrollPane2.setViewportView(productsTableInventory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel tableModel = (DefaultTableModel) productsTableInventory.getModel();
        tableModel.addRow(new Object[]{});

    }
    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }
    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {
        String[] rowData = new String[8];
        DefaultTableModel productsTableInventoryModel = (DefaultTableModel) productsTableInventory.getModel();

        for (int i = 0; i < productsTableInventoryModel.getRowCount(); i++) {
            for (int j = 0; j < 7; j++) {
                rowData[j] = String.valueOf(productsTableInventoryModel.getValueAt(i, j));
            }
            for (Product product: Products){
                if (Objects.equals(rowData[0], String.valueOf(product.getID()))){
                    rowData[7] = product.getReport();
                    break;
                }
            }
            String s = rowData[0] + ',' + rowData[1] + ',' + rowData[2] + ',' + rowData[3]
                    + ',' + rowData[4] + ',' + rowData[5] + ',' + rowData[6] + ',' + rowData[7];
            if (i == 0)
                FileOperations.write(s, "products.txt", false);
            else FileOperations.write(s, "products.txt", true);
        }
    }

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel productsTableInventoryModel = (DefaultTableModel) productsTableInventory.getModel();
        if (productsTableInventory.getSelectedRow() != -1)
            productsTableInventoryModel.removeRow(productsTableInventory.getSelectedRow());
    }

    private void listButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Products = (ArrayList<Product>) (Object) FileOperations.read("products.txt");
        DefaultTableModel tableModel = (DefaultTableModel) productsTableInventory.getModel();
        tableModel.setRowCount(0);
        for (Product product: Products) {
            Object rowData[] = {String.valueOf(product.getID()), product.getName(), product.getPrice(), product.getExpireDate(),
                    product.getQuantity(), product.getDiscount(), product.getCategory()};
            tableModel.addRow(rowData);
            if( product.getQuantity()<15) {
                String prompt_message = product.getName() + "'s quantity is " + product.getQuantity() + " (lower than 15)";

                JOptionPane.showMessageDialog(null, prompt_message);
            }
        }
    }

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Products = (ArrayList<Product>) (Object) FileOperations.read("products.txt");
        for (Product product: Products){
            if (Objects.equals(searchTextField.getText(), String.valueOf(product.getID())) ||
                    Objects.equals(searchTextField.getText(), product.getName())){
                DefaultTableModel tableModel = (DefaultTableModel) productsTableInventory.getModel();
                tableModel.setRowCount(0);
                Object rowData[] = {String.valueOf(product.getID()), product.getName(), product.getPrice(), product.getExpireDate(),
                        product.getQuantity(), product.getDiscount(), product.getCategory()};
                tableModel.addRow(rowData);
                reportLabel.setText(product.getReport());
                break;
            }
        }
    }

    private void productsTableInventoryMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel productsModel = (DefaultTableModel) productsTableInventory.getModel();
        int selectedRow = productsTableInventory.getSelectedRow();
        int selectedID = Integer.parseInt(String.valueOf(productsModel.getValueAt(selectedRow, 0)));
        for (Product product: Products){
            if (selectedID == product.getID()){
                reportLabel.setText(product.getReport());
            }
        }
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
            java.util.logging.Logger.getLogger(InventoryConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryConsole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify

    private float total;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listButton;
    private javax.swing.JTable productsTableInventory;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;


    private javax.swing.JButton logoutButton;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}
