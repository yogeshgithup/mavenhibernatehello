package com.mypack.mavenhibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StudentDemo {

    public static void main(String[] args) {

        Configuration cf = new Configuration();
        Configuration cfg = cf.configure("com/mypack/mavenhibernate/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Student e = new Student();

            e.setName("c2");
            e.setPassword("space");
            e.setCno(88888);
            e.setCpi(123);
            e.setSpi(100);
            session.save(e);

            System.out.println("data has been saved");
            tx.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
