import java.util.*;

public class CollectionHashmap {
	public static void main(String[] args) {

		HashMap<Integer,String> al = new HashMap<>();
		al.put(9, "susan");
		al.put(4, "Ramesh");
		al.put(1,"susan");
		al.put(8,"Deena");
		al.put(10,null);
		
		
		

		System.out.println("Simple print");
		System.out.println(al); // output: [Susan, Ramesh, Rohit, Deena]

		/*
		 * System.out.println("using Forloop"); for (int i = 0; i < al.size(); i++) {
		 * System.out.println(al.get(i)); // Susan Ramesh Rohit Deena }
		 */

		System.out.println("Enhanced Loop");
		for (Map.Entry w : al.entrySet()) {
			System.out.println(w.getKey()+" "+w.getValue());
		}

		/*System.out.println("Iterating while Loop");
		Iterator itr = ((Set<Entry<Integer, String>>) al).iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/

	}



}
