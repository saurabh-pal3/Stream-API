package Strem;

import java.util.Arrays;
import java.util.List;

public class S5 
{
	public static void main (String[] args)
	{
		List<Integer> list = Arrays.asList(5, 2, 9, 1, 3);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);

	}

}
