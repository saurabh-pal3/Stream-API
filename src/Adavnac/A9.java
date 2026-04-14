package Adavnac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class A9 
{
	public static void main(String[] args)
	{
//		9. Given an int[] array, re-arrange the elements to form the highest/lowest possible. 
	     int []arr = {1, 2, 3, 5, 4}; 
//		  output:  12345 
//		   54321
	     
	   

	        // Lowest Number
	        String lowest = Arrays.stream(arr)
	                .sorted()
	                .mapToObj(String::valueOf)
	                .collect(Collectors.joining());

	        // Highest Number
	        String highest = Arrays.stream(arr)
	                .boxed()
	                .sorted(Comparator.reverseOrder())
	                .map(String::valueOf)
	                .collect(Collectors.joining());

	        System.out.println(lowest);
	        System.out.println(highest);
	}

}
