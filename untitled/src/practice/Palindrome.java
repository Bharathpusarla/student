package practice;

public class Palindrome {
    public static void main(String[] args) {
        String str ="sumus";
        StringBuilder sc = new StringBuilder(str);
        String rev= String.valueOf(sc.reverse());
        System.out.println(str.equals(rev));
    }
}
