import java.util.stream.IntStream;

public class Printingnumberswithoutloop {
	
	public static void printnumbers(int startnum,int endnum)
	{
		
		if(startnum<=endnum)
		{
			System.out.println(startnum);
			startnum++;
			printnumbers(startnum,endnum);
		}
	}

	public static void main(String[] args) {
		
		//printnumbers(1,100);
		IntStream.range(1, 101).forEach(num -> System.out.println(num));	

	}

}
