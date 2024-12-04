package datastructuresstrings;

public class Firstnonrepated {
    public static void main(String[] args){
      Character result = Firstnonrepatedchar("baba");
      System.out.println(result);

    }

    public static Character Firstnonrepatedchar(String str) {
        for (char c : str.toCharArray()) {
            int count = 0;
            for (int i = 0; i <= str.length()-1; i++) {
                if (c == str.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                return c;
            }
        }
        return null;
    }
}
