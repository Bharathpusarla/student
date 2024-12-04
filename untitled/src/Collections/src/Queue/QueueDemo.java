package Collections.src.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> myq = new PriorityQueue<Integer>();
		for (int i=10;i<100;i=i+12) {
			myq.offer(i);
		}
		System.out.println(myq);
		System.out.println("hi");
	}

}
