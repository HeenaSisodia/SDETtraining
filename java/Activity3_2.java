import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num= new HashSet<>();
		num.add(1);
		num.add(2);
		num.add(23);
		num.add(5);
		num.add(7);
		num.add(13);
		
		System.out.println("Size of HashSet:"+ num.size());
		num.remove(1);
		num.remove(25);
		System.out.println("Does number 23 present?"+ num.contains(23));
		
		System.out.println("New size is:"+ num.size());
	}

}
