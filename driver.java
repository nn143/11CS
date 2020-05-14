
public class driver {

	public static void main(String[] args) {
		
		String s = "Hyundai"; 
		int c = 89819201; 
		int my = 2020; 
		
		int HP = 300; 
		int seats = 4; 
		
		Car OOF = new Car(c, my, s,HP,4); 
		
		System.out.println("Make of Car: "  +OOF.make);
		System.out.println("Capacity: " +OOF.seats); //concatenation 
		System.out.println("Model Year: " +OOF.ModelYear);
		
	}

}
