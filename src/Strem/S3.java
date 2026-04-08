package Strem;

import java.util.Arrays;
import java.util.List;

public class S3
{
	public static void main (String[] args)
	{
        List<String> name = Arrays.asList("Amit", "Rahul", "Ankit", "Saurabh");
	    
	    long count=name.stream()
	    .filter(n -> n.startsWith("A"))
	    .count();
	    
	    System.out.println("The Count is "+count);
	   
	}

}
