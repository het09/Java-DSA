
public class String_Buffer_EX1 {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		System.out.println("\n\tS1 Length: "+s1.length());
		System.out.println("\n\tS1 Capacity: "+s1.capacity());
		
		StringBuffer s2 = new StringBuffer(10);
		System.out.println("\n\tS2 Length: "+s2.length());
		System.out.println("\n\tS2 Capacity: "+s2.capacity());
		
		StringBuffer s3 = new StringBuffer("JAVA");
		System.out.println("\n\tS3: "+s3);
		System.out.println("\n\tLength: "+s3.length());
		System.out.println("\n\tCapacity: "+s3.capacity());
	}

}
