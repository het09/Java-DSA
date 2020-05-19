import java.io.*;

public class Interface implements In1{
	
	public void display()
	{
		System.out.println("Interface Implementation");
	}

	public static void main(String[] args) 
	{
		Interface i = new Interface();
		i.display();
		System.out.println(a);
	}
}

interface In1
{
	//We can use any of public,static,final
	final int a = 10;
	
	//public and abstract
	void display();
}