
public class diffbet_string_and_stringbuffer {

	public static void main(String[] args)
	{
		//String is immutable means non-changeable
		/*String s = new String("Het");
		s.concat("Godhani");
		System.out.println(s);
		*/
		
		//String Buffer is mutable
		StringBuffer sb = new StringBuffer("Het");
		sb.append("Godhani");
		System.out.println(sb);
	}
}
