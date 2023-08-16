package Javaproject;

public class Demo5 {

	public static void main(String[] args) {
		
		int a= 10, b=20, c=10;
		
		if ((a==b)&&(b==c)&&(c==a))
			
		{
			System.out.println("all values are duplicate");
		}
	
		else if (a==b)
		{
			System.out.println("a &b are duplicate");
			
		}
		
		else if (a==c)
		{
			System.out.println("a and c are duplicate");
			
		}
		
		else if(b==c)
		{
			System.out.println("b and c are duplicate");
		}
		else 
		{
			System.out.println("no value duplicate");
			
		}
		
	}
}
		
		
		
		
		
		