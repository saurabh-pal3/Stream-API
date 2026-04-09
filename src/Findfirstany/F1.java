package Findfirstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class F1 
{
	public static void main(String[] args)
	{
        List<Integer> list = Arrays.asList(1,3,7,8,10,12);
        
        
        Optional<Integer> first = list.stream()
        .filter(n -> n%2==0)
        .findFirst();
        
        first.ifPresent(n-> System.err.println("First Even :"+n));
		
	}

}
