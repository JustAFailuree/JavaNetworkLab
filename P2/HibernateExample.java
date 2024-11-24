/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernateexample;

import com.example.entity.Order;
import com.example.entity.User; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration; 

/**
 *
 * @author Radek
 */

public class HibernateExample { 

    public static void main(String[] args) { 

        SessionFactory sessionFactory = new Configuration() 
                .configure("hibernate.cfg.xml") 
                .addAnnotatedClass(User.class) 
                .addAnnotatedClass(Order.class) 
                .buildSessionFactory(); 

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
         
        User user = new User("Kapibara", "xd"); 


        Order order1 = new Order("Laptop"); 

        Order order2 = new Order("Smartphone"); 


        user.addOrder(order1); 

        user.addOrder(order2); 

        session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Dodano do bazy");

    } 

    } 
