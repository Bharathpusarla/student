package datastructuresstrings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] agrs){
        Duplicate("abbccc");

    }
    public static void Duplicate(String str){
        HashMap<Character,Integer> chars = new HashMap<>();
        for (char c :str.toCharArray()){
            chars.put(c,chars.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : chars.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" apperas " +entry.getValue());
            }
        }
    }
}
