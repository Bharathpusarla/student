package datastructuresstrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        uniquechar("bharath");
    }
    public static void uniquechar(String str){
        char[] c = str.toCharArray();
        for(char i:c){
           int count=0;
            for (int j=0;j<=c.length-1;j++){
                if(i== str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
            }
        }

    }
}
