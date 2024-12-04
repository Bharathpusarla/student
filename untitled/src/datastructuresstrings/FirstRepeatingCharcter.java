package datastructuresstrings;

public class FirstRepeatingCharcter {
    public static void main(String[] args) {
        Firstreapting("Bharath");

    }
    public static void Firstreapting(String str){
        for(char c:str.toCharArray()){
            int count=0;
            for(int j=0;j<=str.length()-1;j++) {
                if (c == str.charAt(j)) {
                    count++;
                }
            }
                if(count>1){
                    System.out.println(c);
                    break;
                }


        }
    }
}
