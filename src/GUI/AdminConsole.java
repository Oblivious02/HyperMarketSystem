/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import System.Employee;


import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Objects;

public class AdminConsole extends javax.swing.JFrame {


    public AdminConsole() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeesTable = new javax.swing.JTable();
        ListButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddEmployee = new javax.swing.JButton();
        SearchEmployee = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        LogoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        EmployeesTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        EmployeesTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "UserName", "Password"
                }
        ));
        EmployeesTable.setGridColor(new java.awt.Color(255, 255, 255));
        EmployeesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(EmployeesTable);

        ListButton.setBackground(new java.awt.Color(0, 153, 153));
        ListButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListButton.setForeground(new java.awt.Color(255, 255, 255));
        ListButton.setText("List Employees");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(0, 153, 153));
        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("Update Employees");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 153, 153));
        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete Employee");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        AddEmployee.setBackground(new java.awt.Color(0, 153, 153));
        AddEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        AddEmployee.setText("Add Employee");
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        SearchEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchEmployee.setForeground(new java.awt.Color(0, 153, 153));
        SearchEmployee.setText("Search for Employee");
        SearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });


        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(0, 153, 153));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });




        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(88, 88, 88)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(AddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(SearchEmployee)
                                                .addGap(31, 31, 31)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }


    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EmployeesTableModel = (DefaultTableModel) EmployeesTable.getModel();
        if (EmployeesTable.getSelectedRow() != -1)
            EmployeesTableModel.removeRow(EmployeesTable.getSelectedRow());
    }

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String[] rowData = new String[3];
        EmployeesTableModel = (DefaultTableModel) EmployeesTable.getModel();

        for (int i = 0; i < EmployeesTableModel.getRowCount(); i++) {
            for (int j = 0; j < 3; j++) {
                rowData[j] = String.valueOf(EmployeesTableModel.getValueAt(i, j));
            }
            String s = rowData[0] + ',' + rowData[1] + ',' + rowData[2];
            if (i == 0)
                FileOperations.write(s, "employee.txt", false);
            else FileOperations.write(s, "employee.txt", true);
        }
    }


    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Employee> employees;
        employees = (ArrayList<Employee>) (Object) FileOperations.read("employee.txt");
        EmployeesTableModel = (DefaultTableModel) EmployeesTable.getModel();
        EmployeesTableModel.setRowCount(0);
        for (Employee employee: employees) {
            if (Objects.equals(jTextField1.getText(), employee.getUsername()) || Objects.equals(jTextField1.getText(), String.valueOf(employee.getID()))) {
                Object rowData[] = {employee.getID(), employee.getUsername(), employee.getPassword()};
                EmployeesTableModel.addRow(rowData);
            }
        }
    }


    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees = (ArrayList<Employee>) (Object) FileOperations.read("employee.txt");
        EmployeesTableModel = (DefaultTableModel) EmployeesTable.getModel();
        EmployeesTableModel.setRowCount(0);
        for (Employee employee: employees) {
            Object rowData[] = {employee.getID(), employee.getUsername(), employee.getPassword()};
            EmployeesTableModel.addRow(rowData);
        }
    }

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        EmployeesTableModel = (DefaultTableModel) EmployeesTable.getModel();
        int[] IDs = new int[EmployeesTableModel.getRowCount()];
        int max = -1;
        for (int i = 0; i < EmployeesTableModel.getRowCount(); i++) {
            if (i == 0) {
                max = Integer.parseInt(String.valueOf( EmployeesTableModel.getValueAt(i, 0)));
                continue;
            }
            if (max < Integer.parseInt(String.valueOf( EmployeesTableModel.getValueAt(i, 0))))
                max = Integer.parseInt(String.valueOf( EmployeesTableModel.getValueAt(i, 0)));
        }
        Object rowData[] = {max + 1};
        EmployeesTableModel.addRow(rowData);
    }


    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminConsole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddEmployee;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable EmployeesTable;


    DefaultTableModel EmployeesTableModel;
    private javax.swing.JButton ListButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
}
