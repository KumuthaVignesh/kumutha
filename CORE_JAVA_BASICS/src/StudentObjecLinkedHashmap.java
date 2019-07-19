import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentObjecLinkedHashmap {
	public static void main(String args[]) {
		LinkedHashMap<Integer,StudentHashmap> al1 = new LinkedHashMap<>();
		StudentHashmap s1 = new StudentHashmap(6, "a", 25);
		StudentHashmap s2 = new StudentHashmap(9, "B", 35);
		StudentHashmap s3 = new StudentHashmap(7, "B", 35);
		StudentHashmap s4 = new StudentHashmap(0, null, 0);
		StudentHashmap s5 = new StudentHashmap(7, "B", 0);
		StudentHashmap s6 = new StudentHashmap(8, "B", 35);
		
		al1.put(9, s1);
		al1.put(2, s2);
		al1.put(3, s3);
		al1.put(4, s4);
		al1.put(5, s5);
		al1.put(6, s6);
		al1.put(6, s6);
		al1.put(4, s4);
		
		
		System.out.println();

		for (Map.Entry<Integer, StudentHashmap> su : al1.entrySet()) {
			int key=su.getKey();
			StudentHashmap value=su.getValue();
			System.out.print(key+" ");
			System.out.println(value.id+" "+value.name+" "+value.age);
			System.out.println();
		}
		System.out.println("Hashmap Doesn't Allows Duplicate");
	}


}
