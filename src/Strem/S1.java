package Strem;

import java.util.Arrays;
import java.util.List;

public class S1 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);

		list.stream()
		.filter(n -> n%2==0)
		.forEach(System.out::println);

	}

}
