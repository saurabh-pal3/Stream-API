package FlatMap;

import java.util.Arrays;
import java.util.List;

public class F1 
{
	public static void main(String[] args)
	{
		List<List<Integer>> list=Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(3,4),
				Arrays.asList(5,6)
				
				);
		
		List<Integer> result=list.stream()
				.flatMap(n -> n.stream())
				.toList();
		
		System.err.println(result);
	}

}
