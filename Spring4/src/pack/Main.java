package pack;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");
StudentDao s=(StudentDao)ap.getBean("s");
/*int count=s.saveStudent(new Student(101,"Sana"));
System.out.println(count+"rows updates");*/
/*int count=s.updateStudent(new Student(101,"Afreen"));
System.out.println(count+"rows updates");
int count=s.deleteStudent(new Student(101));
System.out.println(count+"rows updates");*/
List<Student>list=s.getAllStudents();
for(Student e:list)
System.out.println(e);
	}

}
