package Mock;

import java.util.Arrays;

public class Strings
{
	public static void main(String[] args) 
	{
		String str="Hi am Saurabh Pal";
		
		Arrays.stream(str.split(" "))
		.skip(2)
		.findFirst()
		.ifPresent(System.out::println);
	}
	
	

}
