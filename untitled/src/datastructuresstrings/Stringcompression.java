package datastructuresstrings;

public class Stringcompression {
    public static void main(String[] args) {
        System.out.println(stringcompression("bbvvcfgggllll"));
    }
    public static String stringcompression(String str){
        String result="";
        int count=1;
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(j)==str.charAt(j+1)){
                    count++;
                }
                else{
                    result=result+str.charAt(j);
                    result=result+count;
                    count=1;
                }
            }
            result=result+str.charAt(str.length()-1);
            result=result+count;

        return result;
    }
}
