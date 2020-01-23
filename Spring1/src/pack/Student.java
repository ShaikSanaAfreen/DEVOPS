package pack;
import java.util.*;

public class Student {
	private int id;
	private String name;
	private List<String> Mobile; 
	
	public Student(int id, String name, List<String> mobile) {
		
		this.id = id;
		this.name = name;
		this.Mobile = mobile;
	}

	public void display()
{
	System.out.println("sid:"+this.id+"\n"+"Sname"+this.name+"\n");
	Iterator i=Mobile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
