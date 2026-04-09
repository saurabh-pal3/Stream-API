package Distinct;

import java.util.Arrays;
import java.util.List;

public class D1 
{
	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5,5,3,2,1);

		List<Integer> unick=list.stream()
		                    .distinct()
		                    .toList();
		System.out.print(unick);

	}

}
