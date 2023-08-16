package Javaproject;

public class Demo6 {

	public static void main(String[] args) {	
			int a=400, b=200, c=200, d=200, e=200;	
			if ((a==b)||(a==c)||(a==d)||(a==e))
			{
				if (a==b)
				{
					System.out.println("Values of A & B are duplicate"+a+ "=" +b);
				}
				else if(a==c)
				{
					System.out.println("Values of A & C are duplicate"+a+ "=" +c);
				}
				else if(a==d)
				{
					System.out.println("Values of A & D are duplicate"+a+ "=" +d);
				}
				else
				{
					System.out.println("Values of A & E are duplicate"+a+ "=" +e);
				}
			}
			else if ((b==c)||(b==d)||(b==e))
			{
				if (b==c)
				{
					System.out.println("Values of B & C are duplicate"+b+ "=" +c);
				}
				else if(b==d)
				{
					System.out.println("Values of B & D are duplicate"+b+ "=" +d);
				}
				else
				{
					System.out.println("Values of B & E are duplicate"+b+ "=" +e);
				}
			}
			else if ((c==d)||(c==e))
			{
				if (c==d)
				{
					System.out.println("Values of C & D are duplicate"+c+ "=" +e);
				}
				else 
				{
					System.out.println("Values of C & E are duplicate"+c+ "=" +e);
				}
			}
			else
			{
				System.out.println("Values of D & E are duplicate"+d+ "=" +e);
			}
		
	
	}

}
