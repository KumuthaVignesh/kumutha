import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTreeset {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Susan");
		al.add("Ramesh");
		al.add("Rohit");
		al.add("Deena");

		System.out.println("Simple print");
		System.out.println(al); // output: [Susan, Ramesh, Rohit, Deena]

		System.out.println("using Forloop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // Susan Ramesh Rohit Deena
		}

		System.out.println("Enhanced Loop");
		for (String w : al) {
			System.out.println(w);
		}

		System.out.println("Iterating while Loop");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Foreach Method");
		al.forEach(w -> {
			System.out.println(w);
		});
	}
}
