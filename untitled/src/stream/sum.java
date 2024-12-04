package stream;

import java.util.Arrays;
import java.util.List;

public class sum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,6,7,9,7,2);
        Long result = numbers.stream().distinct().mapToLong(Integer::intValue).sum();
        System.out.println(result);
    }
}
