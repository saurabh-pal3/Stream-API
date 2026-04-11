package toArray;

import java.util.Arrays;
import java.util.List;

public class A2 
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

	
	    public static void main(String[] args) {

	        List<Employee> list = Arrays.asList(
	                new Employee("Saurabh"),
	                new Employee("Rahul"),
	                new Employee("Amit")
	        );
	        
	        String[] array = list.stream().map(Employee::getName).toArray(String[]:: new);
	        
	        System.err.println(Arrays.toString(array));

}
}
