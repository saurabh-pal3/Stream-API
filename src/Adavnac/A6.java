package Adavnac;

import java.util.Arrays;

public class A6 
{
	public static void main(String[] args)
	{
		 String s = "I am learning streams API in Java";  
		 
		 Arrays.stream(s.split(" ")).filter(word-> countVowels(word)==2).forEach(System.out::println);
		
	}
	
	public static long countVowels(String  word)
	{
		return word.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
		
	}

}
