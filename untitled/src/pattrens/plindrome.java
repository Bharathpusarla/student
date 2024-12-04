package pattrens;

public class plindrome {
    public static void main(String[] args) {
        System.out.println(isPlindrome("bharath"));

    }
    public static boolean isPlindrome(String str){
        String reversed="";
        for(int i= str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);

        }
        if(str.equals(reversed)){
            return true;
        }
        return false;
    }
}
