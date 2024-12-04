package datastructuresstrings;

public class StartwithSpecificChar {
    public static void main(String[] args) {
        System.out.println(startswithA("charath","c"));
    }
    public static boolean startswithA(String str , String c){
        if(str.startsWith(c)){
            return true;
        }
        return false;
    }

}
