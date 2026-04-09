package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C2
{
	public static void main(String[] args)
	{
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        
       Set<String> set= words.stream().collect(Collectors.toSet());
       
       System.err.println(set);

		
	}

}
