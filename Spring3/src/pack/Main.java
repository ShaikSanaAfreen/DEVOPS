package pack;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;
public class Main {

	public static void main(String[] args) {
		//BeanFactory context=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
	AbstractApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");  
		BeanClass1 obj=(BeanClass1)context.getBean("b");
obj.getMessage();
context.registerShutdownHook();
	}

}
