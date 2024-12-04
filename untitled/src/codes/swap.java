package codes;

public class swap {
    public static void main(String[] args){
        int a = 7;
        int b = 4;
        /*int c= a+b;
            a = c-a;
            b=c-a;*/
       /* int c = a*b;
            a = c/a;
            b= c/a;*/
       /* a=a+b;
        b= a-b;
        a=a-b;*/

        int temp =a;
        a=b;
        b=temp;
            System.out.println(a);
            System.out.println(b);
    }
}
