package stream;

import java.util.Arrays;
import java.util.List;

public class ListofEvenorOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,7,6,2,8,9,4,3,0);
        List<Integer> l = list.stream().filter(i ->i%2 ==0).toList();
        System.out.println(l);
    }
}
