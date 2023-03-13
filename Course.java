//CS 3560 Assignment 2 Problem 5B
//Name: Jesus Regino

import java.util.ArrayList;

public class Course {
	
	//attributes
	//this class can contain as many "Book" objects as it wants so this class has a list for them
	private int code;
	private ArrayList<Book> list = new ArrayList<Book>();
	
	//full constructor so every "Course" object has a code alongside it
	public Course(int code) {
		this.code = code;
	}
	
	//this method would be used to add "Book" objects to the list
	public void addBook(Book book) {
		list.add(book);
	}
	
}
