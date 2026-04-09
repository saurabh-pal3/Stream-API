package Reduce;

import java.util.Arrays;
import java.util.List;

public class R3 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Java", " ", "Stream", " ", "API");
		
		String reduce = list.stream().reduce(" ", (a,b)-> a+b);
		
		System.err.println(reduce);
	}

}
