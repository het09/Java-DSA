package CloeningSerializationDEMO;

public class Test1 implements Cloneable{

	
	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 t1 = new Test1();
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		Test1 t2 = (Test1)t1.clone();
		System.out.println(t1.a);
		System.out.println(t1.b);
		
	}

}
