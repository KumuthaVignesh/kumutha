import java.util.*;

public class StudentObjec {
	public static void main(String args[]) {
		ArrayList<Student> al1 = new ArrayList<>();
		Student s1 = new Student(6, "a", 25);
		Student s2 = new Student(7, "B", 35);
		Student s3 = new Student(7, "B", 35);
		Student s4 = new Student(0, null, 0);
		Student s5 = new Student(7, "B", 35);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		//al1.size()
		System.out.println();

		for (Student su : al1) {
			System.out.println(su.id + " " + su.name + " " + su.age);
		}
		System.out.println("List Allows Duplicate");
	}

}
