package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countnum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,7,6,7,9,7,2);
      Long result = numbers.stream().filter(num-> num == 7).count();
        System.out.println(result);
    }
}
