import java.util.*;

public class CollectionsIterator {
//03
	public static void main(String[] args) {
		HashMap<String,String> hMap = new HashMap<>();
		hMap.put("1", "1st");
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		Collection<String> c1 = hMap.values();
		Iterator<String> itr = c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
