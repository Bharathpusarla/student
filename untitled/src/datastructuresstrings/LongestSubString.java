package datastructuresstrings;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubstring("bharath"));

    }
    public static String longestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, maxLength = 0;
        int maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start; // Track the starting index of the max substring
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }
}
