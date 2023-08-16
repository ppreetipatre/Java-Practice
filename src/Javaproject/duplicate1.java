package Javaproject;

import java.util.Arrays;

public class duplicate1 {
	//check specific string is present or not
	public static void valuepresent()
	{
	String abc[] = new String[5];
	abc[0] = "selenium";
	abc[1] = "TestNG";
	abc[2] = "Cucumber";
	abc[3] = "POM";
	abc[4] = "Jenkins";
	boolean a = Arrays.asList(abc).contains("POM");
	System.out.println(a);
	}
	//check specific value present or not
	
	public static void dupliarr()
	{
		int pqr[] = {10,20,30,20,30};
		for(int i=pqr.length-1;i>=0;i++)
		{
			for(int j=pqr.length;j<=5;j++)
			{
				pqr[i]=pqr[j];
				System.out.println("duplicate value is" +pqr[i]+pqr[j]);
			}
		}
	
	}
	
		public static void main(String[] args) {
		
		duplicate1.valuepresent();
		duplicate1.dupliarr();

	}

}
