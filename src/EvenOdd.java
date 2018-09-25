import java.util.Scanner;

public class EvenOdd {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int Counter = 0;
		int Number = 0;
		int Result = 0;
		
		while(Counter < 10) {
			
			System.out.println( "Type a number");
			Number = scan.nextInt();
			
			Result = Number % 2;
					if (Result == 0) {
						
						System.out.println("The number is even");
					}
			
					else {
						
						System.out.println("Number is odd");
					}
		}
	}

}
