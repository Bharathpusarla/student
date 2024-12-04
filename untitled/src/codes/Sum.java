package codes;

import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String args[]){

        List<Integer> s = Arrays.asList(8,4,2,1,9);
        Integer sum = s.stream().filter(n->n%2 == 0).mapToInt(i->i*i).sum();

        System.out.println(sum);    }
}
