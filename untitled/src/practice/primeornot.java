package practice;

public class primeornot {
    public static void main(String[] args) {
        System.out.println(prime(4));

    }
    public static boolean prime(int a){
        if(a<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }

        return true;
    }

}
