package Adavnac;

import java.util.Arrays;
import java.util.Comparator;

public class A4 
{
	public static void main(String[] args)
	{
//		4. Find the 2nd highest length word in a sentence. 
		
	     String s = "I am learning streams API in Java"; 
	     
	   int length = Arrays.stream(s.split(" "))
	   .sorted(Comparator.comparing(String::length)
			   .reversed())
	   .skip(1)
	   .findFirst().get().length();
	   
	   System.err.println(length);
	     
	     
	    
		
	}

}
