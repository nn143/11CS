package classesDemo;

public class Employee {
	String name; 
	int age; 
	int dob; 
	
	private int Salary; 
	private int ID; 
	
	
	// we will skip the constructor for now 
	// let Eclipse autogenerate a default constructor 
	
	public int getSalary() { 
		return this.Salary; 
	}
	
	public int getID() { 
		return this.ID; 
	}

	public void setSalary(int s) { 
		this.Salary = s; 
	}
	
	public void setID(int id) { 
		this.ID = id; 
	}
}
