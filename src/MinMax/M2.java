package MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class M2
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

	    public String getName()
	    {
	        return name;
	    }
	}

	  public static void main(String[] args) 
	  {

	        List<Employee> list = Arrays.asList(
	                new Employee("Saurabh", 90000),
	                new Employee("Rahul", 50000),
	                new Employee("Amit", 85000)
	        );
               
	        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
	        
	        max.ifPresent(n -> System.err.println("Max Salary Of Employee : "+n.getName()));
}
}
