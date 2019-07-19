
import java.util.*;
import java.util.stream.Collectors;
public class CollectionNewprog {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamalesh");
		map.put(12, "Kamalesh");
		map.put(13, "Kamalesh");
		map.put(12, "Kamalesh");
		
		
		System.out.println("Convert Map Values to List...");
		List<String> valueList=map.values().stream().collect(Collectors.toList());
		//valueList.forEach(n->System.out.println(n));
		for(String w:valueList)
			System.out.println(w);
		
		System.out.println("Convert Map Keys to List...");
		List<Integer> keyList=map.keySet().stream().collect(Collectors.toList());
		keyList.forEach(n->System.out.println(n));
		
		
		System.out.println("Convert Map Values to Set...");
		Set<String> valueSet=map.values().stream().collect(Collectors.toSet());
		valueList.forEach(n->System.out.println(n));
		
		System.out.println("Convert Map Keys to Set...");
		Set<Integer> keySet=map.keySet().stream().collect(Collectors.toSet());
		keyList.forEach(n->System.out.println(n));
		
		
	}

}
