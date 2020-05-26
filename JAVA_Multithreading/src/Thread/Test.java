package Thread;

public class Test {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1();
		t.start();
	}

}

class MyThread1 extends Thread{
	public void run() {
		System.out.println("No-argument run....");
	}
	
	public void run(int i) {
		System.out.println("int-argument run...");
	}
}