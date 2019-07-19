import java.util.*;
import java.util.stream.Collectors;
public class Collectionsettolistconvert {
	public static void main(String[] args) {
		
		/*System.out.println("Set to list using Stream Method");
		Set<String> al = new HashSet<String>();
		al.add("Susan");
		al.add("Ramesh");
		al.add("Rohit");
		al.add("Deena");
		List<String> list=al.stream().collect(Collectors.toList());
		System.out.println("Simple print");
		System.out.println(al); // output: [Susan, Ramesh, Rohit, Deena]
		System.out.println("Enhanced Loop");
		for (String w : al) {
			System.out.println(w);
		}
		
		List<String> bl = new ArrayList<String>();
		al.add("Susan");
		al.add("Ramesh");
		al.add("Rohit");
		al.add("Deena");
		Set<String> set=bl.stream().collect(Collectors.toSet());
		System.out.println("Simple print");
		System.out.println(bl); // output: [Susan, Ramesh, Rohit, Deena]
		System.out.println("Enhanced Loop");
		for (String w1 : bl) {
			System.out.println(w1);
		}
*/
		/*System.out.println("Set to list using normal Method");
		List<String> s=new ArrayList<String>();
		s.add("Susan");
		s.add("Ramesh");
		s.add("Rohit");
		s.add("Deena");
		s.add("Rohit");
		s.add("Deena");
		System.out.println("Loop");
		Set<String> e=new HashSet<>(s);
				for (String w1 : e) {
			System.out.println(w1);
		}*/
				
				System.out.println("list to set using normal Method");
				Set<String> s1=new HashSet<String>();
				s1.add("Susan");
				s1.add("Ramesh");
				s1.add("Rohit");
				s1.add("Deena");
				s1.add("Rohit");
				s1.add("Deena");
				System.out.println("Loop");
				List<String> e1=new ArrayList<String>(s1);
						for (String w1 : e1) {
					System.out.println(w1);
				}
		

}}
