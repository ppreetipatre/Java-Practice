package Javaproject;

public class Demo10 {

	public static void main(String[] args) {
		// print 40 to 50 value except 43, 47 and 49 value using for loop
		
		for(int i=40; i<=50;i++)
		{
			if(!((i==43)||(i==47)||(i==49)))
			{
				System.out.println(i);
			}
		}

	}

}
