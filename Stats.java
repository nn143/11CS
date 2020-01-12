package basicStats;
import java.math.*;
public class Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] newArray = createArray(10); 
		printArray(bubbleSort(newArray)); 
		int median = calcMedian(newArray);
		System.out.println("The median is: " +median);
	
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
	
	public static int[] bubbleSort(int[] thisArray) { 
		// to be completed in class 
		int size = thisArray.length; 
		for (int i = 0; i < size - 1; i++) { 
			for (int j = 0; j < size - 1; j++) { 
				if (thisArray[j] > thisArray[j+1]) { 
					int temp = thisArray[j]; 
					thisArray[j] = thisArray[j+1];
					thisArray[j+1] = temp; 
				}
			}
		
		}
		
		return thisArray; 
	}
	
	public static void printArray(int[] array) { 
		for (int i = 0; i < array.length; i++) { 
			System.out.println(" " + array[i]); 
		}
	}
	

	public static int calcAvg(int[] array) { 
		int sum = 0; 
		for (int i =0; i < array.length; i++) {
			sum += array[i]; 
		}
		return sum/array.length; 
		
	}
	
	public static int calcMedian(int[] array) { 
		array = bubbleSort(array); 
		double midIndex = (array.length-1)/2; 
		int newIndex = (int)Math.round(midIndex);
		return array[newIndex]; 
	}
	
	public static int findMax(int[] array) { 
		int max = 0; 
		for(int i = 0; i < array.length; i++) { 
			if(array[i] > max) { 
				max = array[i]; 
			}
		}
		return max;
	}
	public static int findMin(int[] array) { 
		int min = 122020; 
		for(int i = 0; i < array.length; i++) { 
			if(array[i] < min) { 
				min = array[i]; 
			}
		}
		return min;
	}
	
	
}
