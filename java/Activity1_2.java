
public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,77,10,54,-11,10};
		
		int num1 =10;
		int expResult = 30;
		
		int result;
		result = total(arr1, num1);
		
		if ( result == expResult) {
			System.out.println("Sum is equal to" + expResult);
		}
		else
			System.out.println("Sum is not equal to" + expResult);
		

	}
	
	public static int total(int[] num, int search) {
		int sum =0;
		
		for (int a1 : num)
		{
			if ( a1 ==  search) {
				sum = sum + search;
			}
		}
		return sum;
		
	}

}
