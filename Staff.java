//CS 3560 Assignment 2 Problem 5E
//Name: Jesus Regino

//this class inherits from the Employee class
public class Staff extends Employee{

	//attributes
	private int role;
	
	//full constructor, so every Staff object has a role as well as the Employee parameters
	public Staff(String name, int hours, int role) {
		//super is used to obtain attributes of the Employee class
		super(name, hours);
		this.role = role;
	}
}
