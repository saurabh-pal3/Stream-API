package Adavnac;

public class A12 
{
	public static void main(String[] args)
	{
		
//		12.  Guven a string, find the first repeated character
		String s = "Hello World";
//		output: l

		char repeated=s.chars()
		              .mapToObj(c-> (char) c)
		              .filter(ch -> s.indexOf(ch) !=s.lastIndexOf(ch))
		              .findFirst()
		              .orElse(' ');

		System.out.println(repeated);
	}

}
