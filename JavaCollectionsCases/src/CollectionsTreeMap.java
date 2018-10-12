import java.util.*;

public class CollectionsTreeMap {
//10
	public static void main(String[] args) {
		TreeMap<String,String> tMap = new TreeMap<>();
		tMap.put("1","Sunday");
		tMap.put("2", "Monday");
		tMap.put("3", "Tuesday");
		tMap.put("4", "Wednesday");
		tMap.put("5", "Thursday");
		tMap.put("6", "Friday");
		tMap.put("7", "Saturday");
		System.out.println(tMap.keySet());
		System.out.println(tMap.values());
		System.out.println(tMap.get("5"));
		System.out.println(tMap.firstKey());
		System.out.println(tMap.get(tMap.firstKey()));
		System.out.println(tMap.lastKey());
		System.out.println(tMap.get(tMap.lastKey()));
		System.out.println(tMap.remove(tMap.firstKey()));
		System.out.println(tMap.keySet());
		System.out.println(tMap.values());
		System.out.println(tMap.remove(tMap.lastKey()));
		System.out.println(tMap.keySet());
		System.out.println(tMap.values());
		
		
	}

}
