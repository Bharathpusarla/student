package datastructuresstrings;

public class Countvowels {
    public static void main(String[] args) {
        System.out.println(countVowels("bharath"));

    }
    public static int countVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vcount = 0, ccount=0;
        for (char c : str.toCharArray()) {
            for (char v : vowels) {
                if (c == v) {
                    vcount++;
                }
            }


        }
        ccount=str.length()-vcount;
        System.out.println("consonants : " + ccount);
        return vcount;
    }
}
