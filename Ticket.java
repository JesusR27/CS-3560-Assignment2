//CS 3560 Assignment 2 Problem 5F
//Name: Jesus Regino

//this class uses the Saleable interface
public class Ticket implements SaleableItem{
	
	//no-arg constructor so any number of Ticket objects can be made
	public Ticket() {
		
	}
	
	//uses the method from the interface
	public void sellCopy() {
		System.out.println("Selling tickets here.");
	}
}
