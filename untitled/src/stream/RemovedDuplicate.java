package stream;

import java.util.Arrays;

public class RemovedDuplicate {
    public static void main(String[] args) {
        String s ="davhdbccb";
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
