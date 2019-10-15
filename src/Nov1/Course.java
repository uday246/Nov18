package Nov1;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();

	public Course(String aCourseName) {
		super();
		courseName = aCourseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String aCourseName) {
		courseName = aCourseName;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> aStudents) {
		students = aStudents;
	}

	public int getNoOfStudents() {
		return students.size();
	}

	public void dropStudent(String str) {
		students.remove(str);
	}

	public void addStudent(String str) {
		students.add(str);
	}

}
