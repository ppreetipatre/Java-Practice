package Javaproject;

public class Arrpract {

	public static void main(String[] args) {
		
		
		//print all reverse value in array
		String s[] = {"pune","mumbai","dubai","usa"};
		String  a =null;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equalsIgnoreCase("dubai"))
			{
				a=s[i];
			}
		}
		int p=s.length;
		System.out.println(p);
		
		for(int j=p-1; j>=0; j--)
		{
			System.out.println(a.charAt(j));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
