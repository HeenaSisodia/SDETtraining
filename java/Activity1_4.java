import java.util.Arrays;

public class Activity1_4 {
	
	public static void sort(int arr[]) {
		int n= arr.length;
		for (int i=1; i<n;i++) {
			int k= arr[i];
			int j=i-1;
			while(j>=0 && k<arr[j]) {
				arr[j+1]=arr[j];
				--j;
			}
			arr[j+1]= k;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {9,5,1,4,3};
		sort(a);
		System.out.println("Sorted Array is"+ Arrays.toString(a));
	}

}
