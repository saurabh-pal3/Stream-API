package Adavnac;

import java.util.Arrays;
import java.util.List;

public class A2 
{
	public static void main(String[] args)
	{
//		2. Remove duplicates from the string and return in the same order. 
			    
		String s = "dabcadefg"; 
		
		 List<String> list = Arrays.stream(s.split(" ")).distinct().toList();
		 
		
	System.out.println(list);
			      
		
	}

}
