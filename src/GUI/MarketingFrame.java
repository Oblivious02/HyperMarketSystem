/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import System.Product;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import static GUI.LoginFrame.Products;

/**
 *
 * @author kenzy
 */
public class MarketingFrame extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public MarketingFrame() {
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

        SendButton = new javax.swing.JButton();
        ReportLabel = new javax.swing.JLabel();
        SaleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        DiscountField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        SendButton.setBackground(new java.awt.Color(0, 153, 153));
        SendButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SendButton.setForeground(new java.awt.Color(255, 255, 255));
        SendButton.setText("Send");
        SendButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        ReportLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        ReportLabel.setForeground(new java.awt.Color(0, 153, 153));
        ReportLabel.setText("Report :");

        SaleLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        SaleLabel.setForeground(new java.awt.Color(0, 153, 153));
        SaleLabel.setText("Discount :");

        ReportField.setColumns(20);
        ReportField.setRows(5);
        jScrollPane1.setViewportView(ReportField);

        ProductTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Product Name"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
                                          public void mouseClicked(java.awt.event.MouseEvent evt) {
                                              ProductTableMouseClicked(evt);
                                          }
                                      }
        );
        jScrollPane2.setViewportView(ProductTable);

        DiscountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Marketing Module");

        LogOutButton.setBackground(new java.awt.Color(0, 153, 153));
        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(DiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(ReportLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(SendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(119, 119, 119)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SaleLabel)
                                                        .addComponent(DiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ReportLabel)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SendButton)
                                        .addComponent(LogOutButton))
                                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        for (Product product: Products) {
            if (ID == product.getID()){
                product.setDiscount(DiscountField.getText());
                product.setReport(ReportField.getText());
            }
        }
        Boolean firstTime = true;
        for (Product product: Products) {
            String s = String.valueOf(product.getID()) + ',' + product.getName() + ',' + product.getPrice()
                    + ',' + product.getExpireDate()  + ',' + product.getQuantity()  + ',' + product.getDiscount() + ',' +
                    product.getCategory() + ',' + product.getReport();
            if (firstTime) {
                FileOperations.write(s, "products.txt", false);
                firstTime = false;
                continue;
            }
            FileOperations.write(s, "products.txt", true);
        }
    }

    private void DiscountFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel productTableModel = (DefaultTableModel) ProductTable.getModel();
        int selectedRow = ProductTable.getSelectedRow();
        ID = Integer.parseInt(String.valueOf(productTableModel.getValueAt(selectedRow, 0)));
        for (Product product: Products) {
            if (ID == product.getID()){
                DiscountField.setText(product.getDiscount());
                ReportField.setText(product.getReport());
            }
        }
    }

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new LoginFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(MarketingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField DiscountField;
    private javax.swing.JButton LogOutButton;
    public static javax.swing.JTable ProductTable;
    private javax.swing.JTextArea ReportField;
    private javax.swing.JLabel ReportLabel;
    private javax.swing.JLabel SaleLabel;
    private javax.swing.JButton SendButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private int ID;
    private javax.swing.JScrollPane jScrollPane2;

    // End of variables declaration
}
