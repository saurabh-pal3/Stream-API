package Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S3 
{
	public static void main(String[] args)
	{
	    List<String> list = Arrays.asList("Java", "Spring", "C", "Hibernate");
	    
	    list.stream()
	    .sorted(Comparator.comparing(String::length))
	    .forEach(System.out::println);
		
	    list.stream()
	    .sorted((a,b)-> a.length() - b.length())
	    .forEach(System.out::println);
	}

}
