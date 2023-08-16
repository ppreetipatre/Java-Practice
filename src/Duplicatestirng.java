import java.util.LinkedHashSet;

public class Duplicatestirng {




public static void main(String []args)
{
String a= "preeti";
String b="";
LinkedHashSet ls= new LinkedHashSet();
	for(int i=0;i<a.length();i++)
{
	char c=a.charAt(i);
	ls.add(c);
}
for(Object d:ls)
{
System.out.println(d);
}
}
}

