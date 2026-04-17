package Adavnac;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A8
{
	public static void main(String[] args)
	{
//		8. Given a word, find the occurrence of each character.  
	     String s = "Mississippi"; 
//		output: {p=2, s=4, i=4, M=1}
	     
	     Map<Character, Long> collect = s.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    
	    System.out.println(collect);
		
		
		
	}

}
