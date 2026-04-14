package Adavnac;

public class A11
{
public static void main(String[] args) 
{
//	11.  Given a string, find the first non-repeated character.  
    String s = "Hello World"; 
	
    for(char ch : s.toCharArray())
    {
    	if(s.indexOf(ch)==s.lastIndexOf(ch))
    	{
    		System.out.println(ch);
    		break;
    	}
    }
	
}

}
