package FlatMap;

import java.util.Arrays;
import java.util.List;

public class F3 
{

    // ✅ Make static
    static class Employee
    {
        String name;

        Employee(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }
    }

    // ✅ Make static + fix constructor
    static class Department
    {
        List<Employee> employees;

        Department(List<Employee> employees)
        {
            this.employees = employees; // ✅ fixed
        }

        public List<Employee> getEmployees()
        {
            return employees;
        }
    }

    public static void main(String[] args)
    {

        Department d1 = new Department(Arrays.asList(
                new Employee("Saurabh"),
                new Employee("Karan")
        ));

        Department d2 = new Department(Arrays.asList(
                new Employee("Nilima"),
                new Employee("Kajal")
        ));

        List<Department> departments = Arrays.asList(d1, d2);

        // ✅ flatMap logic
        departments.stream()
                   .flatMap(d -> d.getEmployees().stream())
                   .map(Employee::getName)
                   .forEach(System.out::println);
    }
}