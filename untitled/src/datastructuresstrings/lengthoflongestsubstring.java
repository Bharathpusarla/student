package datastructuresstrings;

import java.util.HashSet;
import java.util.Set;

public class lengthoflongestsubstring {
    public static void main(String[] args) {
        System.out.println(longestlength("bharathie"));
    }
    public static int longestlength(String str){
        Set<Character> set = new HashSet<>();
        int left=0,right=0,max =0;
        while(left<str.length()){
            if(!set.contains(str.charAt(left))){
                set.add(str.charAt(left));
                max =Math.max(max, set.size());
                left++;
            }else{
                set.remove(str.charAt(right));
                right++;
            }
        }
        return max;
    }
}
