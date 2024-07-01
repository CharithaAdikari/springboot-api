package com.example.nexa.dto;

import java.util.Date;

public class ClientDTO {

    private Long clientID; // Add this line
    private String email;
    private String gender;
    private String name;
    private Date bdate;
    private String password;

    // Getters and Setters

    public Long getClientID() {
        return clientID; // Add this method
    }

    public void setClientID(Long clientID) { // Add this method
        this.clientID = clientID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
