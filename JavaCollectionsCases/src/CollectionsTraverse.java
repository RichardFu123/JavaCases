import java.util.*;

public class CollectionsTraverse {
//06
	public static void main(String[] args) {
		setTest();
		listTest();
	}
	
	private static void setTest() {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Cpp");
		set.add("C");
		set.add("Java");
		set.add("JS");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	private static void listTest() {
		List<String> set = new ArrayList<>();
		set.add("Java");
		set.add("Cpp");
		set.add("C");
		set.add("Java");
		set.add("JS");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i));
		}
		System.out.println();
		for(String s:set) {
			System.out.println(s);
		}
	}

}
