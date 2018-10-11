import java.util.*;

public class CollectionsLength {
//04
	public static void main(String[] args) {
		HashSet<String> collection = new HashSet<>();
		Iterator<String> itr;
		collection.add("1");
		collection.add("22");
		collection.add("333");
		collection.add("4444");
		collection.add("55555");
		itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		if(collection.isEmpty()) {
			System.out.println("The collection is empty.");
		}
		else
		{
			System.out.println("The length of collection is: "+collection.size());
		}
	}

}
