package Adavnac;



import java.util.*;
import java.util.stream.Collectors;

public class A15 
{
    public static void main(String[] args)
    {
        String[] s = {"pat", "tap", "pan", "nap", "Team", "tree", "meat"};

        Collection<List<String>> result = Arrays.stream(s)
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] ch = word.toLowerCase().toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        }
                ))
                .values();

        System.out.println(result);
    }
}