package datastructuresstrings;

public class
alphabetsinString {
    public static void main(String[] args){
        System.out.println(alphabets("Bharath ! ! bro11"));
    //okay
    }
    public static String alphabets(String str){
        StringBuilder str1 = new StringBuilder();
        for(char i:str.toCharArray()){
            if(Character.isLetter(i)){
                str1.append(i);
            }
        }
        String result = str1.toString();
        return result;
    }
}
