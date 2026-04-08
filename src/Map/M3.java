package Map;

import java.util.Arrays;
import java.util.List;

 class M3 
{
	static class Employee {
	    int id;
	    String name;

	    Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}
	
	public static void main(String[] args)
	{
		List<Employee> emp=Arrays.asList(
				new Employee(1, "Saurabh"),
	            new Employee(2, "Rahul")
				);
		
		emp.stream()
		.map(Employee::getName)
		.forEach(System.out::println);
	}

}
