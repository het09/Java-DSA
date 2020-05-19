
public class foreach_ex1 {
	public static void main(String[] args)
	{
		int[] marks = { 125, 132, 95, 116, 110 };
		int highest_marks = maximum(marks);
		System.out.println("The highest score is " +highest_marks);
	}
	
	public static int maximum(int[] numbers)
	{
		int maxSoFar = numbers[0];
		
		for(int num : numbers)
		{
			if(num > maxSoFar)
			{
				maxSoFar = num;
			}
		}
		return maxSoFar;
	}
}
