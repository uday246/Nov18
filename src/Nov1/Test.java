package Nov1;

final class CompletedCourse {
	private final String courseName;
	private final int term;
	private final int year;
	private final int units;
	private final int letterGrade;

	public CompletedCourse(String aCourseName, int aTerm, int aYear, int aUnits, int aLetterGrade) {
		super();
		courseName = aCourseName;
		term = aTerm;
		year = aYear;
		units = aUnits;
		letterGrade = aLetterGrade;
	}

	public CompletedCourse() {
		courseName = "";
		term = 0;
		year = 0;
		units = 0;
		letterGrade = 0;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getTerm() {
		return term;
	}

	public int getYear() {
		return year;
	}

	public int getUnits() {
		return units;
	}

	public int getLetterGrade() {
		return letterGrade;
	}

}

public class Test {
	public static double getGpa(CompletedCourse course[]) {
		double sum = 0;
		for (int i = 0; i < course.length; i++) {
			sum += course[i].getLetterGrade();
		}
		return sum / course.length;
	}
	public static void main(String[] args) {
		CompletedCourse c1 = new CompletedCourse("Test1", 10, 2018, 10, 4);
		CompletedCourse c2 = new CompletedCourse("Test2", 11, 2018, 10, 3);
		CompletedCourse c3 = new CompletedCourse("Test3", 12, 2018, 10, 4);
		CompletedCourse arr[]= new CompletedCourse[3];
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		System.out.println(getGpa(arr));
	}
}
