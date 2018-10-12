import java.util.*;

public class CollectionsSubList {
//17
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :"+list);
		List<String> sublist = Arrays.asList("three Four".split(" "));
		System.out.println("subList: "+sublist);
		System.out.println("indexOfSubList: "+ Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSubList: "+ Collections.lastIndexOfSubList(list, sublist));
	}

}
