package com.badri;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
//        s1.setAge(19);
//        s1.setSid(101);
//        s1.setName("dummy");

        Student s2=null;
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.badri.Student.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

        Transaction T= session.beginTransaction();
        // session.persist(s1); //inseting data to DB
        session.merge(s1); //update

        //delete
        s1=session.get(Student.class,101);
        session.remove(s1);

        T.commit();

        s2=session.get(Student.class,101); //fetching data frm DB

        session.close();
        sf.close();
        System.out.println(s2);

    }
}