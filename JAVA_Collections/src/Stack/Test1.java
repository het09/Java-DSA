package Stack;

import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		s.push("Het");
		s.push("Param");
		s.push("Yash");
		System.out.println(s);
		System.out.println(s.search("Param"));
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());

	}

}
