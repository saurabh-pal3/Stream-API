package Adavnac;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A5
{
	public static void main(String[] args)
	{
//		5. Given a sentence, find the occurrence of each word. 
		
		      String s = "I am learning streams API in Java Java"; 
//		       output: {Java=2, in=1, streams=1, I=1, API=1, learning=1, am=1}
		      Map<String,Long> collect = Arrays.stream(s.split(" "))
		    		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		      
		      System.out.println(collect);
		
	}

}
