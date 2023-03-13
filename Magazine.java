//CS 3560 Assignment 2 Problem 5F
//Name: Jesus Regino

//this class uses the interface SaleableItem
public class Magazine implements SaleableItem{

	//no-arg constructor so it can make as many "Magazine" objects
	public Magazine() {
		
	}
	
	//using the method from the interface
	public void sellCopy() {
		System.out.println("Selling magazines here.");
	}
}
