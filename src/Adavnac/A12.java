package Adavnac;

public class A12 
{
	public static void main(String[] args)
	{
//		12.  Guven a string, find the first repeated character 
		String s = "Hello World"; 
//		output: l
		
		for(char ch : s.toCharArray())
		{
			if(s.indexOf(ch) != s.lastIndexOf(ch))
			{
				System.err.println(ch);
				break;
			}
		}
		
	}

}
