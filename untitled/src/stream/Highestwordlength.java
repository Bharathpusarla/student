package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Highestwordlength {
    public static void main(String[] args) {
        String str =" I am a good boyy1";
       String result= Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(result);
    }
}
