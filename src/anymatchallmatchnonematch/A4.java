package anymatchallmatchnonematch;

import java.util.Arrays;
import java.util.List;

public class A4
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

	        List<Student> list = Arrays.asList(
	                new Student("Amit", 50),
	                new Student("Rahul", 40),
	                new Student("Neha", 70)
	        );
	        
	        boolean allMatch = list.stream().allMatch( n -> n.getMarks() >35);
	        
	        System.err.println(allMatch);

}
}
