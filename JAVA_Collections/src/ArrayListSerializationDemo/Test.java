package ArrayListSerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111,"Het"));
		al.add(new Emp(222,"Param"));
		al.add(new Emp(333,"Yash"));
		al.add(new Emp(444,"Meet"));
		
		//serialization of ArrayList
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serialization process completed.....");
		
		//deserialization of arraylist
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> newal = (ArrayList<Emp>)ois.readObject();
		for(Emp e : newal) {
			System.out.println(e.eid+" "+e.ename);
		}
		ois.close();
		
	}

}
