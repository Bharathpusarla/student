package pattrens;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        //String s = "bharath";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the string to be reversed: ");
      String  s= sc.nextLine();
        char[] ch = s.toCharArray();
        int left =0;
        int  right = ch.length-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
           ch[right] = temp;
            left++;
            right--;
        }
        String rev =  new String(ch);
        System.out.println(rev);
    }
}
