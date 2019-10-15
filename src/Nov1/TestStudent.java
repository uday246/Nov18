package Nov1;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

class Student {
	private String studentName;

	private int studentNumber;

	private String major;

	private double grade;

	public Student(String aStudentName, int aStudentNumber, String aMajor, double aGrade) {
		super();
		studentName = aStudentName;
		studentNumber = aStudentNumber;
		major = aMajor;
		grade = aGrade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String aStudentName) {
		studentName = aStudentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int aStudentNumber) {
		studentNumber = aStudentNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String aMajor) {
		major = aMajor;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double aGrade) {
		grade = aGrade;
	}

	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", studentNumber=" + studentNumber + ", major=" + major
				+ ", grade=" + grade + "]";
	}

}

public class TestStudent {
	public static void main(String[] args) throws Exception {
		String file1=JOptionPane.showInputDialog(null,"Enter name of file1");
		String file2=JOptionPane.showInputDialog(null,"Enter name of file2");
		Student s1 = readStudentInfo(file1);
		Student s2 = readStudentInfo(file2);
		System.out.println(s1);
		System.out.println(s2);
	}

	private static Student readStudentInfo(String aFile1) throws Exception {
		Student s1 =null;
		BufferedReader br = new BufferedReader(new FileReader(aFile1));
		String name = br.readLine();
		int id = Integer.parseInt(br.readLine().trim());
		String major = br.readLine();
		double grade = Double.parseDouble(br.readLine());
		s1 = new Student(name, id, major, grade);
		return s1;
	}
}
