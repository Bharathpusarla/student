package pattrens;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] list ={0,7,4,8,6};
        for(int i=0;i<list.length-1;i++){
            for (int j=0;j< list.length-i-1;j++){

                if(list[j]>list[j+1]){
                   int temp =list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));

    }
}
