package hello.src;

public class string {
	public static void main(String[] args) {
		String name ="Bharath";
		String s2 = new String("say something");
		char[] c = {'h','e','l','l','o'};
		String s3 = new String(c);
		byte[] b = {64,65,66};
		String s4 =new String(b);
		System.out.println("name = " + name+" " +s3);
		System.out.println("name = " + name+" " +s2 );
		System.out.println("len= " + name.length() );
		System.out.println(s4);
	}

}
