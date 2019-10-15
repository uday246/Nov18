package Nov20;
public class CourseClient{
	public static void main(String[] args) {
		Course c1 = new Course(1,"IT1006","6");
		Course c2 = new Course(2,"IT4782","3");
		Course c3 = new Course(3,"IT4789","3");
		Course c4 = new Course(4,"IT4079","6");
		Course c5 = new Course(5,"IT2230","3");
		Course c6 = new Course(6,"IT3345","3");
		Course c7 = new Course(7,"IT2249","6");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		
		 
		
	}
}
class Course {
	private int sno;
	private String Id;
	private String creditHours;
	public Course(int n,String aId, String aCreditHours) {
		super();
		sno=n;
		Id = aId;
		creditHours = aCreditHours;
	}
	public String getId() {
		return Id;
	}
	public void setId(String aId) {
		Id = aId;
	}
	public String getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(String aCreditHours) {
		creditHours = aCreditHours;
	}
	@Override
	public String toString() {
		return "["+sno+"] "+Id+" ("+creditHours + ")";
	}
	
}
