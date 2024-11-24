/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table; 
import jakarta.persistence.Id; 
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author Radek
 */

@Entity 

@Table(name = "users") 

public class User { 

    @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    @Column(name = "id") 

    private int id; 

    @Column(name = "username") 

    private String username; 

    @Column(name = "password") 

    private String password; 

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true) 

    private List<Order> orders = new ArrayList<>();  


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
    public List<Order> getOrders() { 

        return orders; 

    } 
    public void setOrders(List<Order> orders) { 

        this.orders = orders; 

    } 
    public void addOrder(Order order) { 

    if (order != null) { 

        orders.add(order); 

        order.setUser(this);  

    } 

} 

} 