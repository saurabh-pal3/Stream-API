package LimitSkip;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LS4
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
	            new Employee("Amit", 50000),
	            new Employee("Rahul", 30000),
	            new Employee("Saurabh", 70000),
	            new Employee("Neha", 60000)
	        );
	        
	        list.stream()
	        .sorted(Comparator.comparing(Employee::getSalary).reversed())
	        .skip(1)
	        .limit(1)
	        .forEach(e -> System.out.println(e.name + " " + e.salary));


	}
}
	
