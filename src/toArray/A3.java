package toArray;

import java.util.Arrays;
import java.util.List;

public class A3 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(5, 3, 1, 2, 3, 4, 5);
		
		Integer[] array = list.stream().distinct().sorted().toArray(Integer[]::new);
		
		System.err.println(Arrays.toString(array));
		
	}

}
