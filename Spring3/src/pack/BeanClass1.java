package pack;
public class BeanClass1 {
String message;

public void getMessage() {
System.out.println("WELCOME");
}

public void setMessage(String message) {
	this.message = message;
}
public void init()
{
	System.out.println("Init method");
}
public void destroy()
{
	System.out.println("Destroy method");
}
}
