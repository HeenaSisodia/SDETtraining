import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> q= new LinkedList<String>();
		q.add("Lion");
		q.add("Tiger");
		q.add("Elephant");
		q.add("Deer");
		q.add("Wolf");
		q.add("Bat");
		
		Iterator<String> iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("Head of the queue"+ q.peekFirst());
        System.out.println("Tail of the queue"+ q.peekLast());
        System.out.println("Is Wolf present in queue?"+ q.contains("Wolf"));
         q.removeFirst();
         q.removeLast();
         
         System.out.println("New size of queue"+ q.size());
		
	}

}
