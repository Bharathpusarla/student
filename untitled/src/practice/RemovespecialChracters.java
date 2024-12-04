package practice;

public class RemovespecialChracters {
    public static void main(String[] args) {
        String str="u08re7rmnew8-0emak2e3^T*%7";
        String str1="";
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                str1=str1+c;
            }
        }
        System.out.println(str1);
    }
}
