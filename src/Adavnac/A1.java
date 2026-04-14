package Adavnac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class A1
{
	public static void main(String[] args)
	{
//		'1. Given a sentence, find the word that has the hight length. 
	       String s = "I am learning streams API in Java"; 
	      
	       Optional<String> max = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length));
	       System.err.println(max);
		
	}

}
