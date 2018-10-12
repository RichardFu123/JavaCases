import java.util.*;

public class CollectionsHashTable {
//14
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<>();
		ht.put("1", "one");
		ht.put("2", "two");
		ht.put("3", "three");
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
