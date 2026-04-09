package Peek;

import java.util.*;

public class P2
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(1, 2, 3);

        list.stream()
            .peek(n -> System.out.println("Original: " + n))
            .map(n -> n * 2)
            .peek(n -> System.out.println("After map: " + n))
            .forEach(System.out::println);
    }
}