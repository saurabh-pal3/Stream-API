package forEach;

import java.util.*;

public class F1
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        list.stream()
            .forEach(System.out::println);
    }
}
