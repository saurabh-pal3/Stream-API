package MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class M3 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Java", "Python", "C", "JavaScript");
		
		Optional<String> min = list.stream().min(Comparator.comparing(String::length));
		
		min.ifPresent(n-> System.err.println("Min Length String is : "+n));
		
	}

}
