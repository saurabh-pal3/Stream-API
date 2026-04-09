package Findfirstany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class F2
{
	static class Employee
	{
		String name;
		String department;

		Employee(String name, String department)
		{
			this.name = name;
			this.department = department;
		}

		public String getDepartment()
		{
			return department;
		}

		public String getName()
		{
			return name;
		}
	}



	public static void main(String[] args)
	{

		List<Employee> list = Arrays.asList(
		                          new Employee("Saurabh", "IT"),
		                          new Employee("Rahul", "HR"),
		                          new Employee("Amit", "IT")
		                      );

		Optional<Employee> e=    list.stream()
		                         .filter(emp-> emp.getDepartment().equals("IT"))
		                         .findAny();

		e.ifPresent(n-> System.err.println("Employee "+ n.getName()));
	}
}

