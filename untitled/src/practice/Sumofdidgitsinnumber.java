package practice;

public class Sumofdidgitsinnumber {
    public static void main(String[] args) {
        int num= 3297843;
        int sum=0;
        while(num>0){
            int i= num%10;
            num=num/10;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
