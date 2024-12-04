package pattrens;

public class Prime {
    public static void main(String[] args){
        System.out.println(isprime(18));

    }
    public static Boolean isprime(int x) {
        if (x<2){
            return false;
        }
        for (int i =2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
}
