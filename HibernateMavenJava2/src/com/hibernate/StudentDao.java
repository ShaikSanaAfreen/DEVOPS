package com.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StudentDao {
public static int Register(Student s)
{
	int i=0;
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();	
	Transaction t=session.beginTransaction();
	i=(Integer)session.save(s);
	t.commit();
	session.close();
	return i;
	
	
}
}
