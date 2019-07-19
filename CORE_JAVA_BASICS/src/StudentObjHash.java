
import java.util.HashSet;

public class StudentObjHash {

	public static void main(String args[]) {
		HashSet<StudentHash> al1 = new HashSet<>();
		StudentHash s1 = new StudentHash(6, "a", 25);
		StudentHash s2 = new StudentHash(9, "B", 35);
		StudentHash s3 = new StudentHash(7, "B", 35);
		StudentHash s4 = new StudentHash(0, null, 0);
		StudentHash s5 = new StudentHash(7, "B", 35);
		StudentHash s6 = new StudentHash(9, "B", 35);
		StudentHash s7 = new StudentHash(0, null, 0);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		al1.add(s7);
		al1.add(s1);
		// al1.addFirst(s6);
		// al1.addLast(s2);
		// al1.size();
		System.out.println();

		for (StudentHash su : al1) {
			System.out.println(su.id + " " + su.name + " " + su.age);
		}
		System.out.println("Hash Allows Duplicate");
	}

}
