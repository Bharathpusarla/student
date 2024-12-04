package practice;

public class CountEven {
    public static void main(String[] args) {
        int num =83742976;
        int Count =0, Counteven =0,Countodd =0;
        while(num>0){
            int i=num%10;
            num=num/10;
            Count++;
            if(i%2==0) {
                Counteven++;
            }
            else {
                Countodd++;
            }
        }
        System.out.println("total digits "+Count+" total even digits "+Counteven+" total odd digits " +
                ""+ Countodd);

    }
}
