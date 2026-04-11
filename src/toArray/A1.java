package toArray;

import java.util.Arrays;
import java.util.List;

public class A1
{
	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		
		Integer[] array = list.stream().toArray(Integer[]:: new);
		
		System.err.println(Arrays.toString(array));
		
	}

}
