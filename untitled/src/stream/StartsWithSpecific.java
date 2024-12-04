package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithSpecific {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana","Apple","mango","apple");
        List<String> resut= fruits.stream().filter(i -> i.startsWith("A")||i.startsWith("a")).collect(Collectors.toList());

        System.out.println(resut);
    }
}