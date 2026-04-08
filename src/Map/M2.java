package Map;

import java.util.Arrays;
import java.util.List;

public class M2
{
	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5);

		list.stream()
		.map( n -> n*n)
		.forEach(System.out::println);

	}

}
