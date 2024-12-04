package codes;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value :");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i=2;i<= Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num +" its a prime ");
        }
        else {
            System.out.println("its not a prime " + num);
        }
    }
}
