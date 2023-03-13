//CS 3560 Assignment 2 Problem 5A
//Name: Jesus Regino

//class is called "Student5" as there's already another java file named "Student" from question 1
//the 5 refers to question 5 on the assignment
public class Student5 {
	
	//attributes
	//"Student" points to "Transcript" so we are using a "Transcript" object in this class
	private String name;
	private Transcript transcript;
	
	//full constructor, so all Student objects will have a name
	public Student5(String name) {
		this.name = name;
	}
	
	//you would use getter methods to receive info from the transcript, like their course and gpa
	//the "Transcript" class has only a multiplicity of one, so only one "Transcript" object is needed
		
}
