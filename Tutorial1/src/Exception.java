
public class Exception {

	public static void main(String[] args) {
	
		//String str = null;
		//System.out.println(str.length());
		//Built-in Exceptions
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("Result : " +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide the number by zero");
		}
		
		try {
			int num = Integer.parseInt("Hello");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat Exception");
		}
		
		try {
			int a[] = new int[5];
			a[7] = 9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
		finally
		{
			System.out.println("Finally is always executed");
		}
		
	}

}
