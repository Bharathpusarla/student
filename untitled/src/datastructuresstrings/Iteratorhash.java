package datastructuresstrings;

import java.util.Map;

public class Iteratorhash {
    public static void main(String args[]){

    }
    public void iterateHashMap(Map<String, String> map) {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
