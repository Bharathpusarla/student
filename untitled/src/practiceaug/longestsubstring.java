package practiceaug;

import java.util.HashSet;

public class longestsubstring {
    public static void main(String[] args) {
        System.out.println(longestsubstring("bharath"));
    }
    public static   int longestsubstring(String s){
        int left =0;
        int maxlengnth =0;
        String maxsubstring ="" ;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(right-left+1>maxlengnth){
                maxlengnth= right-left+1;
                maxsubstring =s.substring(left,right+1);
            }
        }
        return maxlengnth;
    }
}
///BHARATH
