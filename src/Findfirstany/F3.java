package Findfirstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class F3
{
	public static void main(String[] args)
	{
        List<String> list = Arrays.asList("Java", "Python", "C", "JavaScript");
        
        Optional<String> first = list.stream()
        		.filter(n -> n.length() > 5)
        		.findFirst();
        
        first.ifPresent( x-> System.err.println("First : "+x));
        
        

	}

}
