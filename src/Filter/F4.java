package Filter;

import java.util.Arrays;
import java.util.List;

public class F4 
{
	public static boolean isPrime(int num)
	{
		if( num <=1)
		{
			return false;
		}
		
		for(int i= 2; i<=Math.sqrt(num); i++)
		{
			if( num % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream()
		.filter(F4::isPrime)
		.forEach(System.out::println);

	}
	
}
