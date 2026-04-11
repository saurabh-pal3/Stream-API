package anymatchallmatchnonematch;

import java.util.Arrays;
import java.util.List;

public class A3
{
	static class Employee
	{
	    String name;

	    Employee(String name)
	    {
	        this.name = name;
	    }

	    public String getName()
	    {
	        return name;
	    }
	}

	
	    public static void main(String[] args)
	    {

	        List<Employee> list = Arrays.asList(
	                new Employee("Saurabh"),
	                new Employee("Rahul"),
	                new Employee("Amit")
	        );
	        
	        boolean noneMatch = list.stream().noneMatch(emp-> emp.getName()==null);
	        
	        System.err.println(noneMatch);


}
}
