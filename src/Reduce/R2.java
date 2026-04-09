package Reduce;

import java.util.Arrays;
import java.util.List;

public class R2 
{
	public static void main(String[] args)
	{
        List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);
        
        Integer reduce = list.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a : b);
        System.err.println(reduce);

		
	}

}
