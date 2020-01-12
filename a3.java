package assignment3;
import java.util.Scanner; 
import java.math.*; 

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// generate random array of 1000 in length 
		int min = 0; 
		int max = 100; 
		int nums[] = new int[1000]; 
		
		for (int i = 0; i < nums.length; i++) { 
				nums[i] = (int)(Math.random()*((max-min) + 1))+min; 
				
		}; 
		
		int histogram[] = new int[10]; 
		
		for (int j = 0; j < nums.length; j++) { 
			int var = nums[j]; 
			if (var < 10 && var >= 0) { 
				histogram[0] += 1; 
			}
			if (var < 20 && var >= 10) { 
				histogram[1] += 1; 
			}
			if (var < 30 && var >= 20) { 
				histogram[2] += 1; 
			}
			if (var < 40 && var >= 30) { 
				histogram[3] += 1; 
			}
			if (var < 50 && var >= 40) { 
				histogram[4] += 1; 
			}
			if (var < 60 && var >= 50) { 
				histogram[5] += 1; 
			}
			if (var < 70 && var >= 60) { 
				histogram[6] += 1; 
			}
			if (var < 80 && var >= 70) { 
				histogram[7] += 1; 
			}
			if (var < 90 && var >= 80) { 
				histogram[8] += 1; 
			}
			if (var <= 100 && var >= 90) { 
				histogram[9] += 1; 
			}
		}; 
		
		// printArray(histogram); 
		
		String newArray[] = new String[10]; 
		int ages[] = new int[10]; 
		
		
		newArray[0] = "Abdul"; 
		ages[0] = 55; 
		newArray[1] = "Khaled"; 
		ages[1] = 3; 
		
		// a loop that prints out the firsdt four numbers 
		
		for (int count = 0; count <= 10; count++ ) { 
			System.out.println(count); 
		
		}; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		int costs[] = {50,6000,120,500}; // array initialization array[i] 
			for( int i = 0; i < costs.length; i++) { // loop 
				if (costs[i] == 120) { //array indexing 
					System.out.println("found"); // output to command line 
				}
				else {  // if else statements 
					System.out.println("not found"); 
				}
			}
	
		}
		
	public static void printArray(int[] array) { // method
		for (int c = 0; c< array.length ; c++ ) { 
			System.out.println(array[c]); 
		}
	}
		
		
		
	
}



