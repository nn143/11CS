package assignment4;


public class a4 {

	public static void main(String[] args) {
		// solutions to assignment 4 
		int[] theArray = createArray(10); 
		int avg = calcAvg(theArray); 
		int [] reversedArray = reverseArray(theArray); 
		int [] dupes = findDuplicates(theArray); 
		
		System.out.println("The Array is: \n");
		print1Darray(theArray); 
		System.out.println("The average value is: " +avg); 
		System.out.println("The reversed array is : \n" ); 
		print1Darray(reversedArray); 
		System.out.println("The duplicates in this array is : \n" ); 
		print1Darray(dupes); 
		
	}



	public static int[] createArray(int n) {  // create random array of length n 
		int [] newArray = new int[n]; 
		int min = 0; 
		int max = 100; 
		for (int i = 0; i < n; i++ ) { 
			newArray[i] = (int)(Math.random()*((max - min) + 1))+min; 
		}
		return newArray; 
	} 

	public static int calcAvg (int [] array ) {  // calculate average 
		int n = array.length; 
		int avg = 0 ; 
		for (int i = 0; i < n; i ++ ) { 
			avg += array[i]; 
		}
		avg = avg/n; 
		return avg; 
	}

	public static int[] findMaxMin(int[] array) {  // returns an array where [0] contains the min and [1] contains the max 
		int min = 101; 
		int max = 0; 
		for(int i = 0; i <  array.length; i++ ) { 
			if(array[i] < min) {
				min = array[i]; 
			}
			if (array[i] > max) { 
				max = array[i]; 
			}	
		}
		int [] vals = {min,max}; 
		return vals; 
	}

	public static int[] reverseArray(int [] array) {  // reverse the array 
		int [] reversed = new int[array.length]; 
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) { 
			reversed[j] = array[i]; 
			j++; 
		}
		return reversed; 
	}

	public static int[] findValue(int array[], int val) { // returns an array with {flag, index} 
		int flag = 0; 
		int index = 0; 
		for (int i: array) { 
			index = i;
			if (array[i] == val) { 
				flag = 1;  
				break; 
			}
		}
		int[] vals = {flag,index}; 
		return vals; 

	}

	public static int[] findDuplicates(int [] array) { //returns an array of all the duplicate values 
		int [] duplicates = new int[array.length]; //much cleaner to implement this as a linked list 

		int j = 0;
		for (int i = 0;i < array.length; i ++ ) { 
			// check if it is not already accounted for 
			if (findValue(duplicates, array[i])[0] == 1) { 
				continue; 
			}
			else if (findValue(array,array[i])[0] == 1 && findValue(array,array[i])[1] != i){ // check for duplicates and that it does not simply find itslef
				duplicates[j] = array[i]; 
				j++; 
			}
		}
		return duplicates; 
	}
	
	public static void print1Darray(int[] array) { 
		for (int i = 0; i < array.length; i++ ) { 
			System.out.print(" , " +array[i]);
		}
		System.out.println(" \n"); 
	}
	
	


}
