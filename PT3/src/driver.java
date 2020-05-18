import java.util.Scanner; 

public class driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // initializes memory 
		Scanner input2 = new Scanner(System.in); 
		Scanner input3 = new Scanner(System.in);  
		
		Student[] theStudents = new Student[5];
		String n; 
		int id; 
		double g; 
		
		for (int i = 0; i < 5; i++) { 
			System.out.println("What is the name?"); 
			n = input.nextLine(); 
			System.out.println("What is the ID?"); 
			id = input2.nextInt(); 
			System.out.println("What is the GPA?"); 
			g = input3.nextDouble();
			
			theStudents[i] = new Student(n,id,g); 
			
			
		}
		
		input.close(); // cleans up memory 
		input2.close();
		input3.close(); 
		
		
		
	}

}
