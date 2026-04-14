package Adavnac;

import java.util.Arrays;

public class A10
{
	public static void main(String[] args)
	{
//		10.  Given an array find the sum of unique elements  
		
		int []arr = {1,6,7,8,1,1,8,8,7}; 
		
		int sum = Arrays.stream(arr).distinct().sum();
		
		System.out.println(sum);
		
	}

}
