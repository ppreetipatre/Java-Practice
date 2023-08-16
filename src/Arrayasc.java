import java.util.NavigableSet;
import java.util.TreeSet;

public class Arrayasc {

	public static void main(String[] args) {
		String a [] = {"selenium","cucumber","testNG","hamcrust","jenkins","pojo"};
		TreeSet ts = new TreeSet();
//		for(int i=0;i<a.length;i++)
//		{
//			ts.add(a[i]);
//			System.out.println(ts);
//		}
		for(String abc:a)
		{
			ts.add(abc);
		}
		NavigableSet n1= ts.descendingSet();	
		System.out.println(n1);

	}

}
