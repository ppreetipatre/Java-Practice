import java.util.ArrayList;
import java.util.Collections;

public class reverseusinglist {

	public static void main(String[] args) {
		String a="selenium";
		ArrayList<Character> ls = new ArrayList<Character>();
		
		for(int i=0;i<a.length();i++)
		{
			char c= a.charAt(i);
			ls.add(c);
			
		}
		Collections.reverse(ls);
		for(Character d:ls)
		{
			System.out.println(d);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
