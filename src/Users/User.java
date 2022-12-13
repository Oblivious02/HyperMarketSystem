package Users;

import GUI.FileOperations;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int ID ;
    private int PhoneNumber ;
    private String email ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getID() {
        return ID;
    }
    public void setID (int ID) {this.ID=ID ;}

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private void ShowUserInfo(java.awt.event.ActionEvent evt) {
        ArrayList<User> Users = new ArrayList<>();
        Users = (ArrayList<User>) (Object) FileOperations.read("User.txt");
        DefaultTableModel tableModel = (DefaultTableModel) UserTable.getModel();
        JTable table = new JTable(tableModel);
        tableModel.setRowCount(0);
        for (User user: Users) {
            Object rowData[] = { user.getUsername(), user.getPassword() , user.getPhoneNumber()
                    , user.getEmail() ,user.getID(),};
            tableModel.addRow(rowData);
        }
    }


    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton UpdateInfoButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable UserTable;
    private javax.swing.JTextField jTextField1;



}
