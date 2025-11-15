package practiceaug;

import practice.ReverseString;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(ReverseString("bharath"));
    }
    public static String ReverseString(String Str){
        int left =0,right=Str.length()-1;
        char[] strs =Str.toCharArray();
        while(left<right){
            char temp = strs[left];
            strs[left]= strs[right];
            strs[right]=temp;
            left++;
            right--;
        }
        return new String(strs);
    }
}
