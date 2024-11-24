/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernateexample;

import com.example.entity.User; 

import org.hibernate.Session; 

import org.hibernate.SessionFactory; 

import org.hibernate.Transaction; 

import org.hibernate.cfg.Configuration; 

 

public class HibernateExample { 

    public static void main(String[] args) { 

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setId(1);  
        user.setUsername("Kapibara");
        user.setPassword("xd");

        session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println("Użytkownik zapisany!");
    }
}

