package practice;

public class ReverseEachwordinString {
    public static void main(String[] args) {
        String s=" I am new to this world";
        String[] str1 =s.split(" ");
        String revesredstring= "";
        for(String str:str1){
            String revesredstring1="";
            for(int i=str.length()-1;i>=0;i--){
                revesredstring1=revesredstring1+str.charAt(i);
            }
            revesredstring=revesredstring+revesredstring1+" ";
        }
        System.out.println(revesredstring);
    }
}
