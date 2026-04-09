package Count;

import java.util.Arrays;
import java.util.List;

public class C1 
{
	public static void main(String[] args)
	{
        List<String> list = Arrays.asList("Amit", "Rahul", "Ankit", "Saurabh", "Ajay");
        
        long count = list.stream().filter(name -> name.startsWith("A")).count();
        
        System.err.println("String start with A  is "+count);

		
	}

}
