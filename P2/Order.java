/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import jakarta.persistence.Entity; 
import jakarta.persistence.Table; 
import jakarta.persistence.Id; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Column; 
import jakarta.persistence.FetchType; 
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.ManyToOne; 

/**
 *
 * @author Radek
 */

@Entity 

@Table(name = "orders") 

public class Order { 

    @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    @Column(name = "id") 

    private int id; 

    @Column(name = "product") 

    private String product; 

    @ManyToOne(fetch = FetchType.LAZY) 

    @JoinColumn(name = "user_id") 

    private User user; 

    public Order() {} 

    public Order(String product) { 

        this.product = product; 

    } 
    public int getId() { 

        return id; 

    } 
    public void setId(int id) { 

        this.id = id; 

    } 
    public String getProduct() { 

        return product; 

    } 
    public void setProduct(String product) { 

        this.product = product; 

    } 
    public User getUser() { 

        return user; 

    } 
    public void setUser(User user) { 

        this.user = user; 

    } 

} 