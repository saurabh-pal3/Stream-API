package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3
{
	static class Employee
	{
		String name;

		public Employee(String name)
		{
			this.name=name;
		}

		public String getName()
		{
			return name;
		}
	}

	public static void main(String[] args)
	{
		List<Employee> emp=Arrays.asList(
		                       new Employee("Saurabh"),
		                       new Employee("Ram"),
		                       new Employee("Karan"),
		                       new Employee("Nilima")

		                   );
		List<String> e=emp.stream().map(Employee::getName).collect(Collectors.toList());

		System.err.println(e);

	}

}
