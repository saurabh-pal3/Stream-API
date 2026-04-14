package Adavnac;

import java.util.Arrays;
import java.util.Comparator;

public class A3
{
	
  public static void main(String[] args)
  {
//		3. Given a sentence, find the word that has the 2nd(nth) highest length. 
	     String s = "I am learning streams API in Java"; 
	     
	    Arrays.stream(s.split(" "))
	    .sorted(Comparator.comparing(String::length)
	    		.reversed())
	    .skip(1)
	    .limit(1)
	    .forEach(System.out::println);
	
}


}
