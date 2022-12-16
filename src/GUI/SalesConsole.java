/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Users.Employee;
import Users.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static GUI.LoginFrame.Products;

/**
 *
 * @author MichaelM
 */
public class SalesConsole extends javax.swing.JFrame {

    /**
     * Creates new form SalesConsole
     */
    public SalesConsole() {
        initComponents();
    }
    DefaultTableModel ProductsTableModel;
    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Product> products = new ArrayList<>();
        products = (ArrayList<Product>) (Object) FileOperations.read("products.txt");
        ProductsTableModel = (DefaultTableModel) ProductTable.getModel();
        ProductsTableModel.setRowCount(0);
        for (Product product: products) {
            Object rowData[] = { product.getName(),product.getID(),product.getPrice(),product.getQuantity(),product.getCategory()};
            ProductsTableModel.addRow(rowData);
        }
    }


        private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(NameLabel.getText().equals("") || PriceLabel.getText().equals("")||QuantityText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please ENTER ALL DATA!");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            Product p = new Product();
            Integer UpdateQty;
            UpdateQty = 0;
            for (int i = 0; i < ProductTable.getRowCount(); i++) {
                if (model.getValueAt(i, 1).equals(ID)) {
                    UpdateQty = Integer.parseInt(model.getValueAt(i, 3).toString()) - Integer.parseInt(QuantityText.getText());

                    p.setID(Integer.parseInt(model.getValueAt(i, 1).toString().trim()));
                    p.setName(model.getValueAt(i, 0).toString().trim());
                    p.setPrice(model.getValueAt(i, 2).toString().trim());
                    p.setQuantity(Integer.parseInt(model.getValueAt(i, 3).toString().trim()));
                    p.setCategory(model.getValueAt(i, 4).toString().trim());

                    if (UpdateQty >= 0) {
                        model.setValueAt(UpdateQty, i, 3);
                        int tableIndex = ProductTable.getSelectedRow();
                        double total = Double.parseDouble(PriceLabel.getText()) * (Double.valueOf(QuantityText.getText()));

                        String data[] ={ NameLabel.getText(), String.valueOf(Integer.parseInt(String.valueOf(ProductsTableModel.getValueAt(tableIndex,1)))), String.valueOf(total),QuantityText.getText()};
                        DefaultTableModel tb1Model= (DefaultTableModel)ItemTable.getModel();
                        tb1Model.addRow(data);

                    } else {
                        JOptionPane.showMessageDialog(null, "Order can't be placed\nNot enough Quantity!");

                    }
                    break;

                }


            }

        }
        QuantityText.setText("");
        NameLabel.setText("");
        PriceLabel.setText("");

    }

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        QuantityText.setText("");
        NameLabel.setText("");
        PriceLabel.setText("");
        DefaultTableModel ItemTableModel = (DefaultTableModel) ItemTable.getModel();
        int rowCount = ItemTableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ItemTableModel.removeRow(i);
        }

    }

        private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Product> products = new ArrayList<>();
        products = (ArrayList<Product>) (Object) FileOperations.read("products.txt");
        ProductsTableModel = (DefaultTableModel) ProductTable.getModel();
        ProductsTableModel.setRowCount(0);
        for (Product product: products) {

            if (Objects.equals(SearchText.getText(), product.getID()) || Objects.equals(SearchText.getText(), String.valueOf(product.getID()))) {
                Object rowData[] = { product.getName(),product.getID(),product.getPrice(),product.getQuantity(),product.getCategory()};
                ProductsTableModel.addRow(rowData);
            }
        }
    }


    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        //To get value of Price from Table

        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int tableIndex = ProductTable.getSelectedRow();
        NameLabel.setText(model.getValueAt(tableIndex, 0).toString());
        PriceLabel.setText(model.getValueAt(tableIndex, 2).toString());
        ID = Integer.parseInt(model.getValueAt(tableIndex, 1).toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Name = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        QuantityText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        SearchText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();

        ListButton = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();

        PriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name.setText("Name :");

        Price.setText("Price :");

        Quantity.setText("Quantity :");

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "ID", "Price", "Quantity"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ItemTable);

        jLabel5.setText("Product List ");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "ID", "Price", "Quantity", "Category"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
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

        ListButton.setText("List");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        Total.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(AddButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(ListButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CancelButton)
                                                .addGap(76, 76, 76))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(14, 14, 14))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(50, 50, 50)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(PriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(9, 9, 9)))))
                                                .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(SearchButton)
                                                .addGap(40, 40, 40)
                                                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Name)
                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Price)
                                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(75, 75, 75)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(138, 138, 138)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AddButton)
                                                        .addComponent(CancelButton)
                                                        .addComponent(ListButton))
                                                .addGap(141, 141, 141))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Total)
                                                        .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(SalesConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesConsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesConsole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private static javax.swing.JTable ItemTable;
    private javax.swing.JButton ListButton;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel PriceLabel;
    private static javax.swing.JTable ProductTable;
    private javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantityText;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchText;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private int ID;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}