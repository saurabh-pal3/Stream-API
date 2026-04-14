package Adavnac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A14 
{
	public static void main(String[] args)
	{
//		14.  Given a list of Strings, create a list that contains only integers.  
		 String [] s = {"abc", "123", "456", "xyz"}; 
//		output: [123, 456]
		 
		 List<Integer> collect = Arrays.stream(s).
				 filter(str-> str.matches("\\d+"))
				 .map(Integer::parseInt)
				 .collect(Collectors.toList());// Only didgit
		 
		 System.out.println(collect);
		
	}

}
