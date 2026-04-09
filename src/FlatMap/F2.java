package FlatMap;

import java.util.Arrays;
import java.util.List;

public class F2 
{
	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList(
                "Java is good",
                "Java is powerful"
            );

List<String> result=list.stream()
              .flatMap(n -> Arrays.stream(n.split(" ")))
              .distinct()
              .toList();

System.out.print(result);

}

}
