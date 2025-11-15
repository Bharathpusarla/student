package datastructuresstrings;

import java.util.Arrays;

public class RotationofStrings {
    public static void main(String[] args) {
        System.out.println(rotationofStrings("abcd","bcda"));

    }
    public static boolean rotationofStrings(String s1,String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
