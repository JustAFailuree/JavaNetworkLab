/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Entity; 
import jakarta.persistence.Table; 
import jakarta.persistence.Id; 

/**
 *
 * @author Radek
 */

@Entity 

@Table(name = "users") 

public class User { 

    @Id 

    private int id; 

    private String username; 

    private String password; 

        public User() { 

    } 
    public User(String username, String password) { 

        this.username = username; 

        this.password = password; 

    } 
    public int getId() { 

        return id; 

    } 
    public void setId(int id) { 

        this.id = id; 

    } 
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

} 
