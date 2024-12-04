package stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLength {
    public static void main(String[] args){
        String s = "i am very decent Boy";
        String result1 = Arrays.stream(s.split(" ")).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        //
        String result = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();


        Integer n = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(result1);
        System.out.println(n);
    }
}
