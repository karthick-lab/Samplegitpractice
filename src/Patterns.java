import java.util.stream.IntStream;

public class Patterns {
	
public static void main(String[] args) {
		
		for(int i=0; i<=4;i++){
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<=4;i++) {
			for( int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		int alpha=65;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
		}
			
		System.out.println("-----------------");
		
		for(int i=0; i<=4; i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
