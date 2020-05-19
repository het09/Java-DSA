package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	void serialization() throws IOException {
		
		Emp e = new Emp(111,"Het");
		FileOutputStream fos = new FileOutputStream("het.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("Serialization Process Completed");
	}
	
	void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("het.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject();
		System.out.println(e.eid+" "+e.ename);
		ois.close();
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Test t = new Test();
		t.serialization();
		t.deserialization();
	}

}
