import java.util.*;
import java.util.stream.Collectors;

public class Collectionprog3 {
	public static void main(String[] args) {
		List<Student>stu =Arrays.asList(new Student(007,"james",46),
				new Student(420,"rahul",28),
				new Student(500,"sas",25));
		/*LinkedHashSet<StudentLinkedHashset> al1 = new 	LinkedHashSet<>();
		StudentLinkedHashset s1 = new 	StudentLinkedHashset(6, "a", 25);
		StudentLinkedHashset s2 = new 	StudentLinkedHashset(9, "B", 35);
		//StudentLinkedHashset s3 = new 	StudentLinkedHashset(7, "B", 35);
		//StudentLinkedHashset s4 = new 	StudentLinkedHashset(0, null, 0);
		StudentLinkedHashset s5 = new 	StudentLinkedHashset(7, "B", 35);
		StudentLinkedHashset s6 = new 	StudentLinkedHashset(8, "B", 35);
		al1.add(s1);
		al1.add(s2);
		//al1.add(s3);
		//al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		al1.add(s6);*/
		
Map<Integer,String> name =stu.stream().collect(Collectors.toMap(s->s.getId(), s-> s.getName()));
/*for(Map.Entry<Integer, String> m : name.entrySet()) {
	String k=m.getValue();
	System.out.println(k);
}*/
name.forEach((k,v)->System.out.println(k+" "+v));
System.out.println("Result list to map : "+name);
	}

}
