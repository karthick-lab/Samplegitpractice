import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicates {

	public static void main(String[] args) {
		
		int arr[]= {1,3,5,2,3,5,10,1,10,20};//{1,1,2,3,3,5,5,10,10,20}

		Arrays.sort(arr);
		
		List li=new ArrayList();
		for(int i=0; i<arr.length;i++)
		{
			li.add(arr[i]);
		}
		
		for(int i=0;i<=li.size();i++)
		{
			try
			{
			if(li.get(i)==li.get(i+1))
			{
				System.out.println("duplicate is : "+ li.get(i));
			}
			}
			catch(Exception e)
			{
				
			}
		}
		
		System.out.println("hi");
		
	}

}
