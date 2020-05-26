package Thread;

public class Test1 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("Main method");
	}

}

class MyThread2 extends Thread{
	public void start() {
		System.out.println("Start method");
	}
	
	public void run() {
		System.out.println("run method");
	}
}