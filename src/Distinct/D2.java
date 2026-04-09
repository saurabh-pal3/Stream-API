package Distinct;

import java.util.Arrays;
import java.util.List;

public class D2
{
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Amit", "Rahul", "Amit", "Saurabh", "Rahul");

		names.stream()
		.distinct()
		.forEach(System.out::println);
	}

}
