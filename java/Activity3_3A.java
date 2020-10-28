import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println("Size of queue:" + q.size());
		q.remove(4);
		System.out.println(q.peek());
		System.out.println("Updated size of queue:"+ q.size());
		
	}

}
