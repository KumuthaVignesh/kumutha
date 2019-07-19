import java.util.Set;
import java.util.TreeSet;

public class StudentObjecTree {
	public static void main(String args[]) {
		TreeSet<StudentTreeset> al1 = new TreeSet<>();
		StudentTreeset s1 = new StudentTreeset(6, "a", 25);
		StudentTreeset s2 = new StudentTreeset(9, "B", 35);
		StudentTreeset s3 = new StudentTreeset(7, "B", 35);
		StudentTreeset s4 = new StudentTreeset(0, null, 0);
		StudentTreeset s5 = new StudentTreeset(7, "B", 35);
		StudentTreeset s6 = new StudentTreeset(8, "B", 35);
		// StudentTreeset s7 = new StudentTreeset();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		// al1.addFirst(s6);
		// al1.addLast(s2);
		// al1.size();
		System.out.println();

		for (StudentTreeset su : al1) {
			System.out.println(su.id + " " + su.name + " " + su.age);
		}
		System.out.println("TreeSet Allows Duplicate");
	}

}
