package Sorted;

import java.util.Arrays;
import java.util.List;

public class S4
{
	public static void main(String[] args)
	{
        List<String> names = Arrays.asList("amit", "Rahul", "saurabh", "Ankit");

        names.stream()
        .sorted(String.CASE_INSENSITIVE_ORDER)
        .forEach(System.out::println);
		
	}

}
