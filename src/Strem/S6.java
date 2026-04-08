package Strem;

import java.util.Arrays;
import java.util.List;

public class S6
{
	public static void main (String[] args)
	{
		List<List<Integer>> list=Arrays.asList(
		                             Arrays.asList(1,2),
		                             Arrays.asList(3,4),
		                             Arrays.asList(5,6)
		                         );

		list.stream()
		.flatMap(x -> x.stream())
		.forEach(System.out::println);

	}

}
