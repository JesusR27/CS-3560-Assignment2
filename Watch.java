//CS 3560 Assignment 2 Problem 1A
//Name: Jesus Regino

//this is an association class
public class Watch {

	//attributes
	//since it's an association class, it keeps track of the association rather than a class
	//so we have an object for each class
	private int rating;
	private Person person;
	private Movie movie;
	
	//full constructor so every "Watch" object has its own rating
	public Watch(Person person, Movie movie, int rating) {
		this.person = person;
		this.movie = movie;
		this.rating = rating;
	}
}
