package practice;

import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] a ={9,5,7,4,3,9,2,2};
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<=a.length-1;i++){
           if(!arr.add(a[i])){
               System.out.println("duplicate found:"+ a[i]);
            }
        }
        /*for(int i=0;i<=a.length-1;i++){
            int count =0;
            for(int j=0;j<=a.length-1;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count >=2){
                System.out.println("Duplicate elemets :"+a[i]);
            }
        }*/
    }
}
