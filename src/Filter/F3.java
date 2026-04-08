package Filter;

import java.util.Arrays;
import java.util.List;

class Employee
{
    String name;
    double salary;
    
    
    public Employee(String name , double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    
}

public class F3
{
    public static void main (String[] args)
    {
    	List<Employee> emp = Arrays.asList(
             new Employee("Amit", 40000),
            new Employee("Rahul", 60000),
            new Employee("Saurabh", 70000)
            
            
            );
            
            emp.stream()
            .filter( emp1 -> emp1.getSalary() > 50000)
            .map(Employee::getName)
            .forEach(System.out::println);
    }
}
