import java.util.*;

public class CollectionsListToArray {
//11
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("S");
		list.add("h");
		list.add("a");
		list.add("w");
		list.add("n");
		String[] str = list.toArray(new String[0]);
		for(String s:str) {
			System.out.println(s);
		}
	}

}
