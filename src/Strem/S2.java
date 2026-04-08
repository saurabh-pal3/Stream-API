package Strem;

import java.util.Arrays;
import java.util.List;

public class S2 
{
	public static void main (String[] args)
	{
	    List<String> list= Arrays.asList("Java", "Paython", "C++", "HTML");
	    
	    list.stream()
	   // .map(s -> s.toUpperCase())
	   // .forEach(System.out::println);
	    
	   .map(String::toUpperCase)
	   .forEach(System.out::println);
	    
	}

}
