package Nov12;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	
	private int age;

	public Student(int i,String aName, int aAge) {
		super();
		id=i;
		name = aName;
		age = aAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int aAge) {
		age = aAge;
	}

	@Override
	public String toString() {
		return "Id : "+id+",name : " + name + ", age : " + age;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class LinkedListEx {
	static LinkedList<Student> list = new LinkedList<Student>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch!=-1){
			System.out.println("1. add Student to LinkedList");
			System.out.println("2. get Number of student of given age");
			System.out.println("3. get and display all students of given age");
			System.out.println("4 Remove student by ID");
			System.out.println("5 Exit");
			System.out.println("Enter your option");
			ch=sc.nextInt();
			int id=0;
			int age=0;
			String name="";
			int count=0;
			switch(ch){
			case 1:
				sc.nextLine();
				System.out.println("Enter name");
				name=sc.nextLine();
				System.out.println("Enter id");
				id=sc.nextInt();
				System.out.println("Enter age");
				age=sc.nextInt();
				list.add(new Student(id,name,age));
				break;
			case 2:
				System.out.println("Enter age");
				age=sc.nextInt();
				
				for(Student s:list){
					if(s.getAge()==age)
						count++;
				}
				System.out.println("There are "+count+" Students with age "+age);
				break;
			case 3:
				System.out.println("Enter age");
				age=sc.nextInt();
				count=0;
				for(Student s:list){
					if(s.getAge()==age){
						count++;
						System.out.println(s);
					}
				}
				System.out.println("There are "+count+" Students with age "+age);
				break;
			case 4:
				System.out.println("Enter id");
				id=sc.nextInt();
				Student temp=null;
				for(Student s:list){
					if(s.getId()==id){
						temp=s;
						break;
					}
				}
				list.remove(temp);
			break;
			case 5:
				ch=-1;
			}
		}
	}
}
