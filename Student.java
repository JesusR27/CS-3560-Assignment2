
public class Student {

	private String name;
	private String major;
	private double gpa;
	
		
	public Student() {
		name = "";
		major = "";
		gpa = 0.0;
	}
		
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
		gpa = 0.0;
	}
		
	public Student (String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
		
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
		
	public String toString() {
		return name + " is majoring in " + major + " and their gpa is " + Double.toString(gpa);
	}
	
	public boolean equals(Student student) {
		String n = student.getName();
		String m = student.getMajor();
		
		if (name.equals(n) && (major.equals(m))){
			return true;
		}
		
		return false;
	}
	
}

