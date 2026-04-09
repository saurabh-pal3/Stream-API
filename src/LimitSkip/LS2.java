package LimitSkip;

import java.util.Arrays;
import java.util.List;

public class LS2
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		list.stream()
		.skip(3)
		.forEach(System.out::println);
		
		
	}

}
