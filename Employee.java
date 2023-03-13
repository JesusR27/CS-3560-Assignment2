//CS 3560 Assignment 2 Problem 5E
//Name: Jesus Regino

//italics mean this is an abstract class
public abstract class Employee {
	
	//attributes
	private String name;
	private int hours;
	
	//full constructor, so every employee has a name and a set number of hours
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	//method for calculating salary
	public double calculateSalary() {
		return hours * 20;
	}
	
	
}
