package LimitSkip;

import java.util.Arrays;
import java.util.List;

public class LS3 
{
	static class Student
	{
		String name;
	    int marks;

	    Student(String name, int marks)
	    {
	        this.name = name;
	        this.marks = marks;
	    }

	    public int getMarks()
	    {
	        return marks;
	    }
	
	}
	
	public static void main(String[] args)
	{
		List<Student> std=Arrays.asList(
				
				new Student("Amit", 85),
	            new Student("Rahul", 92),
	            new Student("Saurabh", 78),
	            new Student("Neha", 95),
	            new Student("Ankit", 88)
	            
				);
		
		std.stream()
		.sorted((a,b)-> b.getMarks() - a.getMarks())
		.limit(3)
		.forEach(s->System.out.println(s.name+" "+s.marks));
		
	}

}
