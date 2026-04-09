package Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S1 
{
	public static void main (String[] args)
	{
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

		// Ascending
		list.stream()
		.sorted()
		.forEach(System.out::println);

		System.out.println("-----");

		// Descending
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);

	}

}
