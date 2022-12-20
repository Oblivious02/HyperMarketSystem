/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import System.Product;

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
        setLocationRelativeTo(null);
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
        setTitle("saler");
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483646));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setText("Name :");

        Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Price.setText("Price :");

        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quantity.setText("Quantity :");

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("PPRODUCTS LIST");

        CancelButton.setBackground(new java.awt.Color(0, 153, 153));
        CancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }

        });

        AddButton.setBackground(new java.awt.Color(0, 153, 153));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");

        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);}
        });
        SearchButton.setBackground(new java.awt.Color(0, 153, 153));
        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 255));
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

        ListButton.setBackground(new java.awt.Color(0, 153, 153));
        ListButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListButton.setForeground(new java.awt.Color(255, 255, 255));
        ListButton.setText("List");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        CheckoutButton.setBackground(new java.awt.Color(0, 153, 153));
        CheckoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckoutButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckoutButton.setText("CHECKOUT");
        CheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButtonActionPerformed(evt);}
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
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

        LogOutButton.setBackground(new java.awt.Color(0, 153, 153));
        LogOutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
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
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(81, 81, 81))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(ListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(CancelButton)
                                                                                .addGap(68, 68, 68)))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SearchButton)
                                                                                .addGap(50, 50, 50)
                                                                                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(33, 33, 33)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CheckoutButton)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(388, 388, 388))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel5))
                                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SearchButton)
                                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Name)
                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(97, 97, 97)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Price)
                                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(55, 55, 55))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(98, 98, 98)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AddButton)
                                                        .addComponent(ListButton)
                                                        .addComponent(CancelButton))
                                                .addGap(82, 82, 82)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(CheckoutButton)
                                        .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private int ID;
    // End of variables declaration
}
