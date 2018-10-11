import java.util.*;

public class CollectionsRemove {
//08
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		Iterator<String> itr;
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		itr = hashSet.iterator();
		System.out.println("Before remove 'c': ");
		while(itr.hasNext()) System.out.print(itr.next()+" ");
		System.out.println();
		hashSet.remove("c");
		itr = hashSet.iterator();
		System.out.println("After: ");
		while(itr.hasNext()) System.out.print(itr.next()+" ");
		System.out.println();
		System.out.println("The length of set: " + hashSet.size());
	}

}
