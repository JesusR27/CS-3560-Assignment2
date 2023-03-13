//CS 3560 Assignment 2 Problem 1B
//Name: Jesus Regino


public class StudentTest {

	public static void main(String[] args) {
		
		//initiating two Student objects
		Student student1 = new Student("John", "CS", 3.5);
		Student student2 = new Student();
		
		//updating details of student2
		student2.setName("Mary Ann");
		student2.setMajor("CE");
		student2.setGpa(3.3);
		
		//printing the states of the two objects
		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}

}
