
class Multilevel_Inheritance{

	
	void showMultilevel_Inheritance()
	{
		System.out.println("other class method");
	}
}


class A1 extends Multilevel_Inheritance{
	void showA1() {
		System.out.println("a1 class method");
	}
}

class B1 extends A1{
	void showB1(){
		System.out.println("b1 class method");
	}
	public static void main(String[] args) {
		
		
		Multilevel_Inheritance ob1 = new Multilevel_Inheritance();
		ob1.showMultilevel_Inheritance();
		//ob1.showA1();	
		//ob1.showB1();
		System.out.println("---------------------");
		
		A1 ob2 = new A1();
		ob2.showMultilevel_Inheritance();
		ob2.showA1();
		//ob2.showB1();
		System.out.println("---------------------");
		
		B1 ob3 = new B1();
		ob3.showMultilevel_Inheritance();
		ob3.showA1();
		ob3.showB1();
		
	}
}