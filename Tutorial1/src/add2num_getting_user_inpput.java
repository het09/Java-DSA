import java.util.Scanner;

public class add2num_getting_user_inpput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum = a + b;
		System.out.println("Addition of : "+a+" and "+b+" is " +sum);
	}

}
