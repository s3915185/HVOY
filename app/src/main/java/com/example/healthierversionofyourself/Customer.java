package com.example.healthierversionofyourself;

public class Customer {
    private int id;
    private String password;
    private String phonenumber;

    public Customer(int id, String password, String phonenumber) {
        this.id = id;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

