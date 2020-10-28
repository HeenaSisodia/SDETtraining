import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Name1");
		myList.add("Name2");
		myList.add("Name3");
		myList.add("Name4");
		myList.add("Name5");
		
		for (int i=0; i<5;i++)
		{
			System.out.println(myList.get(i));
		}
		
		System.out.println("Third name is"+myList.get(2));
		
		System.out.println("Does list contains name : Heena?"+ myList.contains("Heena"));
		
		System.out.println("Size of list is:"+ myList.size());
		
		myList.remove(4);
		System.out.println("New size of list is:"+myList.size());

	}

}
