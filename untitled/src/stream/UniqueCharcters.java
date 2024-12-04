package stream;

import java.util.Arrays;
import java.util.List;

public class UniqueCharcters {

    public static void main(String[] args) {
        String str ="bharath";
       List<String> result = Arrays.stream(str.split("")).distinct().toList();
        System.out.println(result);
    }
}
