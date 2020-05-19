
class Interface_Ex1 {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}

}

interface Animal{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	
	public void sleep() {
		System.out.println("Zzz");
	}
	
	public void animalSound() {
		System.out.println("The pig says : wee wee");
	}
}
