package practice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr ={2,8,5,7,1,9};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
