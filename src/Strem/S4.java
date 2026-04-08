package Strem;

import java.util.Arrays;
import java.util.List;

public class S4 
{
	public static void main (String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 5, 40, 15);

		int min=list.stream().min(Integer::compare).get();
		int max=list.stream().max(Integer::compare).get();

		System.out.println("Max = " + max);
		System.out.println("Min = " + min);

	}

}
