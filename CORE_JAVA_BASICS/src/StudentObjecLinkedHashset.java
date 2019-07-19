import java.util.LinkedHashSet;

public class StudentObjecLinkedHashset {
	public static void main(String args[]) {
		LinkedHashSet<StudentLinkedHashset> al1 = new 	LinkedHashSet<>();
		StudentLinkedHashset s1 = new 	StudentLinkedHashset(6, "a", 25);
		StudentLinkedHashset s2 = new 	StudentLinkedHashset(9, "B", 35);
		StudentLinkedHashset s3 = new 	StudentLinkedHashset(7, "B", 35);
		StudentLinkedHashset s4 = new 	StudentLinkedHashset(0, null, 0);
		StudentLinkedHashset s5 = new 	StudentLinkedHashset(7, "B", 35);
		StudentLinkedHashset s6 = new 	StudentLinkedHashset(8, "B", 35);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		al1.add(s6);
		//al1.addFirst(s6);
		//al1.addLast(s2);
		// al1.size();
		System.out.println();

		for (StudentLinkedHashset su : al1) {
			System.out.println(su.id + " " + su.name + " " + su.age);
		}
		System.out.println("LinkedList Allows Duplicate");
	}


}
