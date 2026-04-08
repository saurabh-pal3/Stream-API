package Map;

import java.util.Arrays;
import java.util.List;

public class M1
{
	public static void main(String[] args)
	{
		List<String> list= Arrays.asList("Saurabh", "Karan","Kajal");

		list.stream()
		// .map( n -> n.toUpperCase())
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}

}
