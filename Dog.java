//CS 3560 Assignment 2 Problem 5D
//Name: Jesus Regino

public class Dog {
	
	//attributes
	//the "Paw" class has a multiplicity of 4 exactly so we can do just fine with an array
	private String breed;
	private String name;
	private Paw[] paws = new Paw[4];
	
	//no-arg constructor, so "Dog" objects can be made without a specific breed or name
	public Dog() {
		
	}
	
	//this method would let us add paws to the dog, using a getter for the position from the Paw object
	//the "- 1" is to accomodate for arrays starting at 0
	public void addPaw(Paw paw) {
		paws[paw.getPosition - 1] = paw;
	}
	
}
