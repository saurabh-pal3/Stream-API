package Adavnac;

public class A11
{
public static void main(String[] args) 
{
//	11.  Given a string, find the first non-repeated character.  
	String s = "Hello World";

	char nonrepeated=	s.chars()
	                    .mapToObj(ch-> (char)ch)
	                    .filter(n -> s.indexOf(n) == s.lastIndexOf(n))
	                    .findFirst()
	                    .orElse(' ');
	
	               System.out.println(nonrepeated);
}

}
