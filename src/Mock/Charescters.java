package Mock;

public class Charescters 
{
	public static void main(String[] args) 
	{
		String str="Hi Am Saurabh Pal";
		
		str.chars().mapToObj(c -> (char) c)
		.filter(c -> c !=' ')
		.skip(2)
		.findFirst()
		.ifPresent(System.out::println);
		
		
		
		
	}
	

}
