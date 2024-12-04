package datastructuresstrings;

import java.util.Arrays;

public class Anagramstring {
    public static void main(String[] args){
        System.out.println(anagram("Monday","Daymon"));
    }
    public static boolean anagram(String str,String str1){
        char[] s1 = str.replaceAll(" ","").toLowerCase().toCharArray();
        char[] s2 = str1.replaceAll(" ","").toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return  Arrays.equals(s1, s2);
    }
}
