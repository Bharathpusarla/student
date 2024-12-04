package Collections.src.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo extends StringLengthComparator {

	public static void main(String[] args) {
		
		Set<String> myset = new TreeSet<>();
		myset.add("hello");
		myset.add("ok");
		myset.add("noo");
		myset.add("nani");
		myset.add("parsim");
		System.out.println(myset);
		
		Set<String> myset1 = new TreeSet<>(new StringLengthComparator());
		myset1.add("hello");
		myset1.add("ok");
		myset1.add("noo");
		myset1.add("nani");
		myset1.add("parsim");
		System.out.println(myset1);
		
}
}