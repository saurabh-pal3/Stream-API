package Count;

import java.util.Arrays;
import java.util.List;

public class C3 
{
	static class Employee
	{
	    String name;
	    double salary;

	    Employee(String name, double salary)
	    {
	        this.name = name;
	        this.salary = salary;
	    }

	    public double getSalary()
	    {
	        return salary;
	    }
	}

	
	    public static void main(String[] args)
	    {

	        List<Employee> list = Arrays.asList(
	                new Employee("Saurabh", 90000),
	                new Employee("Rahul", 50000),
	                new Employee("Amit", 85000),
	                new Employee("Neha", 75000)
	        );
	        
	        long count = list.stream().filter(emp-> emp.getSalary()> 80000).count();
	        System.out.println("Employees > 80k: " + count);

	    }
}
