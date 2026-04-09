package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Collect.C4.Employee;

public class C4
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
		                          new Employee("Amit", "IT"),
		                          new Employee("Neha", "HR")
		                      );

		Map<String,List<Employee>> collect = list.stream()
		                                     .collect(Collectors.groupingBy(Employee::getDepartment));

		collect.forEach((dept,empList)-> {
			System.err.println(dept+" "+ empList.stream()
			                   .map(Employee::getName)
			                   .toList());
		});


	}
}
