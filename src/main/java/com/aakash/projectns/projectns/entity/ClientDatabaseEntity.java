package com.aakash.projectns.projectns.entity;

import javax.persistence.*;

@Entity
public class ClientDatabaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String clientId;
    private String position;
    private String email;
    private String address;
    private String username;
    private String password;

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ClientDatabaseEntity{" +
                "clientId='" + clientId + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
