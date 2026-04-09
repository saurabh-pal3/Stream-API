package forEach;

import java.util.*;

public class F3
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(50, 120, 80, 200, 30);

        list.stream()
            .filter(n -> n > 100)
            .forEach(System.out::println);
    }
}
