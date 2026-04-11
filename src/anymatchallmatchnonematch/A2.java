package anymatchallmatchnonematch;

import java.util.Arrays;
import java.util.List;

public class A2 
{
	public static void main(String[] args)
	{
        List<Integer> list = Arrays.asList(2, 5, 10, 8, 0);
        
        boolean allMatch = list.stream().allMatch(n -> n>0);
        
        System.err.println(allMatch);

		
	}

}
