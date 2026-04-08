package Map;

import java.util.Arrays;
import java.util.List;

public class M4
{
	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5);

		List<String> result= list.stream()
				.map(n-> String.valueOf(n))
				.toList();
		System.out.print(result);

	}

}
