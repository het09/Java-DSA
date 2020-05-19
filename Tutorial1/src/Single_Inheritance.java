
public class Single_Inheritance extends A{

	public static void main(String[] args) {
		A ob1 = new A();
		ob1.showA();
		//ob1.showSingle_Inheritance();
		
		Single_Inheritance ob2 = new Single_Inheritance();
		ob2.showA();
		ob2.showSingle_Inheritance();
		
	}
	void showSingle_Inheritance()
	{
		System.out.println("other class method");
	}
}
class A{
	void showA() {
		System.out.println("a class method");
	}
}

