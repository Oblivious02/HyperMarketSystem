/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Users.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

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
    Integer UpdateQty;
    double NetTotal=0;

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(NameLabel.getText().equals("") || PriceLabel.getText().equals("")||QuantityText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please ENTER ALL DATA!");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            Product p = new Product();
            ;
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
                        double total = Double.parseDouble(PriceLabel.getText()) * (Double.parseDouble(QuantityText.getText()));
                        NetTotal = NetTotal + total;


                        String[] data ={ NameLabel.getText(), String.valueOf(Integer.parseInt(String.valueOf(ProductsTableModel.getValueAt(tableIndex,1)))), String.valueOf(total),QuantityText.getText()};
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
    private void CheckoutButtonActionPerformed(java.awt.event.ActionEvent evt){
        TotalLabel.setText(String.valueOf(NetTotal));


    }

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        QuantityText.setText("");
        NameLabel.setText("");
        PriceLabel.setText("");

        TotalLabel.setText("");

        DefaultTableModel ItemTableModel = (DefaultTableModel) ItemTable.getModel();
        int rowCount = ItemTableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ItemTableModel.removeRow(i);
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
    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new LoginFrame().setVisible(true);
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
        SearchText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        ListButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        CheckoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        TotalLabel = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483646));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setText("Name :");

        Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Price.setText("Price :");

        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quantity.setText("Quantity :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("PPRODUCTS LIST");

        CancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddButton.setText("Add");
        AddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);}
        });


        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton.setText("search");
        SearchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        ListButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListButton.setText("List");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        CheckoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckoutButton.setText("CHECKOUT");
        CheckoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButtonActionPerformed(evt);}
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("total:");

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
        jScrollPane3.setViewportView(ItemTable);

        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutButton.setText("LOG OUT");
        LogOutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(81, 81, 81))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(AddButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(ListButton)
                                                .addGap(30, 30, 30)
                                                .addComponent(CancelButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(CheckoutButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 16, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LogOutButton)
                                                .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LogOutButton)
                                        .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SearchButton)
                                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2)
                                                                .addGap(53, 53, 53))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(98, 98, 98)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(AddButton)
                                                                                        .addComponent(ListButton)
                                                                                        .addComponent(CancelButton))
                                                                                .addGap(58, 58, 58))
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(CheckoutButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Name)
                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(97, 97, 97)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Price)
                                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)))
                                .addGap(34, 34, 34))
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
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JTable ItemTable;
    private javax.swing.JButton ListButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantityText;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchText;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private int ID;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration
}
