package datastructuresstrings;

import java.util.HashMap;
import java.util.Map;

public class Countwords {
    public static void main(String[] args){
     Map<String,Integer> result =  countwords("a apple ball is apple in a ball");
     System.out.println(result);

    }
    public static Map<String,Integer> countwords(String str){
        Map<String,Integer> wordcount = new HashMap<>();
        String[] words = str.split(" ");
        for(String i : words){
            wordcount.put(i,wordcount.getOrDefault(i, 0)+1);
        }
        return wordcount;
    }
}
