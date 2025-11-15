package stream;

import java.util.*;
public class average {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,6,7,9,7,2);
        OptionalDouble result = numbers.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(result);
    }
}
