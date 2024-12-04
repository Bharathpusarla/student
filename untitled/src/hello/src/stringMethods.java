package hello.src;

public class stringMethods {
	public static void main(String[] args) {
	String s = "hello";
	System.out.println(s);
	System.out.println("length ="+s.length());
	System.out.println("index of w ="+ s.indexOf('w'));
	System.out.println("index of l="+ s.indexOf('l'));
	System.out.println("character at 3="+ s.charAt(3));
	System.out.println("index of l="+ s.indexOf('l',5));
	System.out.println("substring ="+ s.substring(3));
	System.out.println("substring ="+ s.substring(0,3));
	String[] s2 = s.split("");
	System.out.println(s2[0]);
	System.out.println(s2[1]);
	String[] s3 = s.split("o");
	System.out.println(s3[0]);
	System.out.println("repalced " +s.replace("l", "j"));
	System.out.println("uppercase:" + s.toUpperCase());
	System.out.println("Creating buiderstring:");
	StringBuilder a = new StringBuilder("hey ");
	String b= "i am fine";
	a.append("oh");
	System.out.println(a);
	System.out.println(a.delete(0,2));
	System.out.println(a.reverse());
	
	
	}
	

}
