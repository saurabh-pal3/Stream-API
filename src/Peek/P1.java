package Peek;

import java.util.Arrays;
import java.util.List;

public class P1
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		list.stream()
		.peek(n -> System.out.println("Before Filter "+n))
		.filter(n -> n%2==0)
		.forEach(n ->System.err.println("After Filter "+n));
		
	}

}
