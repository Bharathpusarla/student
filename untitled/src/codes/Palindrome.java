package codes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String s =sc.nextLine();
        String rev= "";
         for(int i=s.length()-1;i>=0;i--){
             rev = rev + s.charAt(i);
         }
         System.out.println(rev);
       if(s.equals(rev)){
            System.out.println("its palindrome");
        }
       else {
           System.out.println("its not a palindrome");
       }

    }
}
