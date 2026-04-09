package Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S2
{
	static class Employee
	{
		String name;
		double salary;

		public Employee(String name, double salary)
		{
			this.name=name;
			this.salary=salary;
		}

		public double getSalary()
		{
			return salary;
		}
	}

	public static void main(String[] args)
	{

		List<Employee> emp= Arrays.asList(
		                        new Employee("Amit", 50000),
		                        new Employee("Rahul", 30000),
		                        new Employee("Saurabh", 70000)
		                    );
		emp.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(n -> System.err.println(n.name +" "+n.salary));


	}


}
