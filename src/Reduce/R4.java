package Reduce;

import java.util.Arrays;
import java.util.List;

public class R4
{
	public static void main(String[] args)
	{
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        Integer reduce = list.stream().reduce(1,(a,b)-> a*b);
        
        System.err.println(reduce);

		
	}

}
