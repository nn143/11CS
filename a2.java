package assignment2;
import java.util.Scanner; 

public class a2 {

	public static void main(String[] args) {
		
		// question 1 
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the number: "); 
		int num = input.nextInt(); 
		
		System.out.println("The number: " +num); 
		System.out.println("Half the number " +num/2); 
		System.out.println("Double the number" + 2*num);
		System.out.println("Square the number: " +(num*num)); 
		System.out.println("The number plus half the number: " +(num + num/2)); 
	

		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the number you want multiples of: "); 
		int n = in.nextInt(); 
		q2(n); 
		input.close(); 
		in.close(); 
		nested(); 
	}
	
	
	public static void q2(int n) { 
		// question 2 
		System.out.println("The number: "+n); 
		System.out.println("The first 10 multiples of " +n+ ":");
		for (int i = 1; i<=10; i++) { 
			System.out.print(+i*n+ " ,");
		}
		
	};
	
	public static void nested() { 
		for(int i = 1; i<=10; i++) { 
			for (int j=1; j<=10; j++) { 
				System.out.print(+i*j+ "  ,"); 
			}; 
			System.out.println("\n");
		}; 
	}; 

}
