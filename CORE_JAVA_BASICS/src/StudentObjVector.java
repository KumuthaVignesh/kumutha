
import java.util.Vector;
public class StudentObjVector {
		
		public static void main(String args[]) {
			Vector<Student> al1 = new Vector<>();
			Student s1 = new Student(6, "a", 25);
			Student s2 = new Student(9, "B", 35);
			Student s3 = new Student(7, "B", 35);
			Student s4 = new Student(0, null, 0);
			Student s5 = new Student(7, "B", 35);
			Student s6 = new Student(8, "B", 35);
			al1.add(s1);
			al1.add(s2);
			al1.add(s3);
			al1.add(s4);
			al1.add(s5);
			al1.add(s1);
			//al1.addFirst(s6);
			//al1.addLast(s2);
			// al1.size();
			System.out.println();

			for (Student su : al1) {
				System.out.println(su.id + " " + su.name + " " + su.age);
			}
			System.out.println("Vector Allows Duplicate");
		}

	}

