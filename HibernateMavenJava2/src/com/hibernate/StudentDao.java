package com.hibernate;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;

public class StudentDao {
public static int Register(Student s)
{
	int i=0;
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();	
	Transaction t=session.beginTransaction();
	Criteria c=session.createCriteria(Student.class);
	c.add(Restrictions.gt("id",2));
	List<Student> list=c.list();  
	
	
	
	for(Student s1:list)
	{
	System.out.println(s1);
		
	}
	
	return i;
	
	
}
}
