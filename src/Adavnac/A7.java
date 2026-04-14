package Adavnac;

import java.util.Arrays;

public class A7
{
	public static void main(String[] args)
	{
		  int[] arr = {1,2,3,4,5,6,7,8};
		  
		  Arrays.stream(arr).filter(n-> n%2==0).forEach(System.out::println);
		  
		  System.out.println("------------------");
		  
		  Arrays.stream(arr).filter(n-> n%2 !=0).forEach(System.out::println);
		
	}

}
