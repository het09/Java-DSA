
public class Inheritance extends Animal1{
	
		public static void main(String[] args) {
			Inheritance i = new Inheritance();
			i.eat();
		}
	}


class Animal1{
	void eat() {
		System.out.println("I am eating....");
	}
}