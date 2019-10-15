package Nov11;


import java.util.Arrays;

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public Person(String aName) {
		super();
		name = aName;
	}
	public Person() {
	}
	public boolean hasSameName(Person s){
		return this.name.equals(s.getName());
	}
	public void writeOutput( ){
		
	}
}

public class Student extends Person implements Comparable
// modify this line to show that Student implements Comparable
{
   private int studentNumber;

   public Student( )
   {
       super( ); // discussed later - calls a Person constructor
       studentNumber = 0;//Indicating no number yet
   }

   public Student(String initialName, int initialStudentNumber)
   {
       super(initialName); // discussed later - calls a Person constructor
       studentNumber = initialStudentNumber;
   }

   public void reset(String newName, int newStudentNumber)
   {
       setName(newName); // setName inherited from Person
       studentNumber = newStudentNumber;
   }

   public int getStudentNumber( )
   {
       return studentNumber;
   }

   public void setStudentNumber(int newStudentNumber)
   {
       studentNumber = newStudentNumber;
   }

   @Override // have Java check that the writeOutput signature is correct for overriding
   public void writeOutput( ) // method that overrides Person's writeOutput
   {
       System.out.println("Name: " + getName( )); // getName inherited from Person
       System.out.println("Student Number: " + studentNumber);
   }

   public boolean equals(Student otherStudent)
   {
       return this.hasSameName(otherStudent) && // hasSameName inherited from Person
           (this.studentNumber == otherStudent.studentNumber);
   }

   @Override
   public String toString( )
   {
       return "Name: " + getName( ) + // getName inherited from Person
           "\nStudent number: " + studentNumber;
   }
  
   /* write the version of compareTo that compares Students by student number here
  
   @Override
   public int compareTo(Object other)
   {
   // write this version here, inside the block comment
     Student s=(Student)other;
     Integer i1=this.studentNumber;
     Integer i2=s.studentNumber;
     return i1.compareTo(i2);
   }
   */
  
   /* write the version of compareTo that compares Students by name here;
   you can use String's compareTo inside this method (String implements Comparable) */
  
   @Override
   public int compareTo(Object other)
   {
	   
	   Student s=(Student)other;
	   return -1*s.getName().compareTo(this.getName());
   }
  
   public static void main(String[] args)
   {
   /* DO NOT MODIFY THIS MAIN METHOD */
       Student[] students = new Student[4];

       students[0] = new Student("Fred", 991);
       students[1] = new Student("Bill", 331);
       students[2] = new Student("Adam", 412);
       students[3] = new Student("Chris", 121);

       Arrays.sort(students);

       // Output the sorted array of students
       for (Student s : students)
       {
           System.out.println(s);
       }
   }
}
