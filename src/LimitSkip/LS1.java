package LimitSkip;

import java.util.Arrays;
import java.util.List;

public class LS1
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		list.stream()
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("--------------");
		
		list.stream()
		.skip(2)
		.forEach(System.out::println);
		
	}

}
