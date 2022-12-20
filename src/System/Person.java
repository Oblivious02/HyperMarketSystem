package System;

public class Person {
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

}
