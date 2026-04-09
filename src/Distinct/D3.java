package Distinct;

import java.util.Arrays;
import java.util.List;

public class D3 
{
	static class Employee
	{
		String name;
		String department;

		public Employee(String name, String department)
		{
			this.name=name;
			this.department=department;
		}

		public String getDepartment()
		{
			return department;
		}
	}

	public static void main(String[] args)
	{
		List<Employee> e1 = Arrays.asList(
		                        new Employee("Amit", "IT"),
		                        new Employee("Rahul", "HR"),
		                        new Employee("Saurabh", "IT"),
		                        new Employee("Neha", "Finance"),
		                        new Employee("Kiran", "HR")
		                    );

		e1.stream()
		.map(Employee::getDepartment)
		.distinct()
		.forEach(System.out::println);

	}
}
