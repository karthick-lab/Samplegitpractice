import java.util.ArrayList;

public class Duplicatesinarray {

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,3,6,20,30,40,5};
		ArrayList duplicates=new ArrayList();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					//System.out.println("Duplicate Element is "+ arr[i]);
					duplicates.add(arr[i]);
				}
			}
		}
		
		System.out.println(duplicates);

	}

}

