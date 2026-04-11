package MinMax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class M1
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 5, 30, 2, 15);
		
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		
		min.ifPresent(n-> System.err.println("Smmelest Number : "+n));
		
	}


}
