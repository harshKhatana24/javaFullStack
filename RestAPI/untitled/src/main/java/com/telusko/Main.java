package com.telusko;


import org.hibernate.Session;
import org.hibernate.Session.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args) {

        Alien a=new Alien();
        a.setAid(102);
        a.setAname("Cheetah");
        a.setPoints(90);

        //hey hibernate save with a1 object
        Configuration config=new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
//        config.configure("hibernate.cfg.xml");
        config.configure("hibernate.cfg.xml");

        config.configure();//load the configuration

        SessionFactory factory=config.buildSessionFactory();

        Session session=factory.openSession();

        Transaction transaction=session.beginTransaction();

        //create
//        session.persist(a); //we also have to commit the transaction
//        transaction.commit();


        //read
        Alien a1=session.find(Alien.class,111);
        System.out.println(a1.toString());

        //lazy fetching and egar fetching


        //update
//        session.merge(a);
//        transaction.commit();



        //delete
//        Alien a1=session.find(Alien.class,110);
//        session.remove(a1);
//        transaction.commit();

        session.close();
        factory.close();


    }
}
