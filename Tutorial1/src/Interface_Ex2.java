
public class Interface_Ex2 {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	}

}

interface Animals{
	public void eat();
	public void travel();
}

class Mammal implements Animals{
	public void eat()
	{
		System.out.println("Mammal eats");
	}
	public void travel()
	{
		System.out.println("Mammal travels");
	}
	public int noOfLegs()
	{
		return 0;
	}
}