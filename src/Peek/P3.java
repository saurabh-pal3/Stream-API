package Peek;

import java.util.*;
public class P3
{
static class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}



    public static void main(String[] args)
    {

        List<Employee> list = Arrays.asList(
            new Employee("Amit", 50000),
            new Employee("Rahul", 30000),
            new Employee("Saurabh", 70000)
        );

        list.stream()
            .peek(e -> System.out.println("Before filter: " + e.name + " " + e.salary))
            .filter(e -> e.salary > 40000)
            .peek(e -> System.out.println("After filter: " + e.name + " " + e.salary))
            .forEach(e -> System.out.println("Final: " + e.name));
    
}
}