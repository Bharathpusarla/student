package datastructuresstrings;

public class Removechar {
    public static void main(String[] args){
       String res = removechar("bharath",'a');
       System.out.println(res);
    }
    public static String removechar(String str, char c){
        StringBuilder str1 = new StringBuilder();
        for (char ch :str.toCharArray()){
            if(ch != c){
                str1.append(ch);
            }
        }
         String result = str1.toString();
        return result;
    }
}
