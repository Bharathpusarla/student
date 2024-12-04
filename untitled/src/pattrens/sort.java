package pattrens;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] list ={0,7,4,8,6};
        for(int i=0;i<list.length;i++){
            for (int j=0;j< i;j++){
                int temp;
                if(list[j]>list[j+1]){
                    temp =list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));

    }
}
