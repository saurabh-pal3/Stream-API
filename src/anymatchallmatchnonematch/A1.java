package anymatchallmatchnonematch;

import java.util.Arrays;
import java.util.List;

public class A1
{
	public static void main(String[] args)
	{
        List<Integer> list = Arrays.asList(3, 7, 11, 20, 9);
        
        boolean anyMatch = list.stream().anyMatch(n -> n % 5==0);
        
        System.err.println(anyMatch);

		
	}

}
