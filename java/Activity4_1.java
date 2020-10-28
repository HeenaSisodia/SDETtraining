import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers");
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		while(scan.hasNextInt()) {
            arr1.add(scan.nextInt());
        }
		
		Random indexGen  = new Random();
		
		Integer nums[] = arr1.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        
        System.out.println("Index value"+ index);
        System.out.println("array value at above index"+ nums[index]);
	}

}
