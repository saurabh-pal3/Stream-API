package MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class M4 
{
	 static class Person 
	{
	    String name;
	    int age;

	    Person(String name, int age) 
	    {
	        this.name = name;
	        this.age = age;
	    }

	    public int getAge() 
	    {
	        return age;
	    }

	    public String getName() 
	    {
	        return name;
	    }
	}

	   public static void main(String[] args) {

	        List<Person> list = Arrays.asList(
	                new Person("Saurabh", 25),
	                new Person("Rahul", 30),
	                new Person("Amit", 28)
	        );
	        
	        Optional<Person> max = list.stream().max(Comparator.comparing(Person::getAge));
	        
	        max.ifPresent(n-> System.err.println(n.getName()));

}
}
