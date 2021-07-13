import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class mappractice {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1, "hi");
		map.put(1, "Hello");
		
		System.out.println(map);
		
		int a=4;
		int b=8;
		if((b-a--)>=a)//a++====>a=a+1,a--=====>a=a-1===>a=3
		{
		if((b+a)%2==1)//11/2=5, 11%2=1
		System.out.println(a*b);
		else
		System.out.println(b+a);
		}
		
		
	
			for (int index = 0; true; index++) { //for(intialize; condition; increment or decrement)
			System.out.println("Welcome");
			break;
			}
			
			String s = "Virat";
			s.concat(" Kohli");
			System.out.println(s);
			
//			input = tomorrow
//			output =t$m$$rr$$$w
			
			String input= "tomorrowsresworesdsd";
			int count=1;
			String symbol="$";
			String symbolinsert ="";
			char arr[]=input.toCharArray();
			String output ="";
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i]=='o')
				{
					for(int j=1;j<=count;j++)
					{
						symbolinsert=symbolinsert+symbol;
						System.out.println(symbolinsert);
					}
					//arr[i]='$';
					//System.out.println(arr[i]);
					output=output+symbolinsert;
					count++;
					symbolinsert="";
				}
				
				else
				{
				output=output+arr[i];
				//System.out.println(output);
				}
			}
			
			System.out.println(output);
			
			//numberprint(1,100);
			
			IntStream.range(1, 101).forEach(num -> System.out.println(num));

	}
	
	
	
	public static void numberprint(int startnum,int endnum)
	{
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
		
		if(startnum<=endnum)
		{
			System.out.println(startnum);
			startnum++;
			numberprint(startnum,endnum);
		}
	}

}
