package forEach;

import java.util.Arrays;
import java.util.List;

public class F2
{
	

	static class Employee {
	    String name;

	    Employee(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	    public static void main(String[] args) {

	        List<Employee> list = Arrays.asList(
	            new Employee("Amit"),
	            new Employee("Rahul"),
	            new Employee("Saurabh")
	        );

	        list.stream()
	            .map(e -> e.getName().toUpperCase())
	            .forEach(System.out::println);
	    
	}

}
