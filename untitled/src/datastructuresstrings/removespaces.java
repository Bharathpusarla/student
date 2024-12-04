package datastructuresstrings;

public class removespaces {
    public static void main(String[] args){
        removespace("My name is bharath");

    }
    public static void removespace(String input){
        StringBuilder str = new StringBuilder();
        for(char c :input.toCharArray()){
            if(c!=' '){
                str.append(c);
            }
        }
        System.out.println(str);

    }
}
