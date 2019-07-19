import java.util.*;
import java.util.stream.Collectors;

public class CollectionProg2 {
	public static void main(String[] args) {
		List<String> aList=Arrays.asList("Geeks","for","GeeksQuiz","GeeksforGeeks","GFG");
		Set<String> set=aList.stream().collect(Collectors.toSet());
		for(String x:aList)
		{
			System.out.println(x);
		}
		
		/*Set<String> aSet=HashSet.asSet("Geeks","for","GeeksQuiz","GeeksforGeeks","GFG");
		List<String> list=aSet.stream().collect(Collectors.toList());
		*/
		List<String> aList1=Arrays.asList("Geeks","for","GeeksQuiz","GeeksforGeeks","GFG");
		Set<String> s=new HashSet<>(aList);
		for(String x:s)
		{
			System.out.println(x);
		}
		
	}

}
