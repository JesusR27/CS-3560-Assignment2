//CS 3560 Assignment 2 Problem 5E
//Name: Jesus Regino

//this class inherits from the Employee class
public class Professor extends Employee{
	
	//attributes
	private String field;
	
	//full constructor so every Professor object has a field they work in, alongside the Employee class parameters
	public Professor(String name, int hours, String field) {
		//super is used to obtain the attributes of the Employee class
		super(name, hours);
		this.field = field;
	}
	
	//we would use a getter here to get the hours of the employee and use it here with this method
	public double calculateSalary() {
		return super.getHours() * 30;
	}
}
