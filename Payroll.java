//CS 3560 Assignment 2 Problem 5H
//Name: Jesus Regino

//this is a class that depends on the Worker class
//so it has no attributes and uses the objects and their attributes from that class
public class Payroll {

	//no-arg constructor so Payroll objects can be made without parameters
	public Payroll() {
		
	}
	
	
	//here we would use a getter method to obtain the name of the worker contained in the "Worker" object
	public void processPayments(Worker worker) {
		System.out.println("Payment processed for worker " + worker.getName());
	}
}
