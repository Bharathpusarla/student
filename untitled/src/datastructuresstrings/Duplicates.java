package datastructuresstrings;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
       findDuplicates("aabbccc");

    }
    public static  void findDuplicates(String input) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (Character c : input.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> i : chars.entrySet()) {
            if (i.getValue() > 1) {
                //System.out.println(i.getKey() + " appears " + i.getValue() + " times");
                System.out.print(i.getKey());
            }
        }
    }
}
