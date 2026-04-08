package Filter;

import java.util.Arrays;
import java.util.List;

public class F2
{
	public static void main(String[] args)
	{
		List<String> list =Arrays.asList("Saurabh", "Aniket", "Ram", "Amol");

		list.stream()
		.filter( n -> n.startsWith("A"))
		.forEach(System.out::println);
	}

}
