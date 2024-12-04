package stream;

import java.util.Arrays;

public class SpecificVowelsinString {
    public static void main(String[] args) {
        String str ="hello hyderabad  i am coming";
        int vowels =2;
        Arrays.stream(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);
    }
}
