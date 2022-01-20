package com.demo.Hibernatetproject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo
{
public static void main(String[] args){
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session=factory.getCurrentSession();
	
	StudentEntity stu=new StudentEntity();
	
	stu.setCity("nasik");
	stu.setName("Priya");
	
	Certificate cert=new Certificate("Java","6 month");
    stu.setCerti(cert);
   
	 
StudentEntity stu2 = new StudentEntity();
	
	stu2.setCity("Mumbai");
	stu2.setName("Ajay");
	
	Certificate cert1=new Certificate("Hibernate","2 month");
	stu2.setCerti(cert1);

	
	Session s=factory.openSession();
	org.hibernate.Transaction tx = s.beginTransaction();
	
	s.save(stu);
	s.save(stu2);
	session.close();
	
	tx.commit();
}
}
