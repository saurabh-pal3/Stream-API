package Strem;

import java.util.Arrays;
import java.util.List;

public class S7
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 30, 40);

		Double avg=list.stream()
		           .mapToInt(Integer::intValue)
		           .average()
		           .getAsDouble();

		System.out.println("Average = " + avg);
		
	}

}
