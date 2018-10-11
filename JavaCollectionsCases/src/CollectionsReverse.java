import java.util.*;

public class CollectionsReverse {
//07
	public static void main(String[] args) {
		String[] coins = {"Penny","nickel","dime","Quarter","dollar"};
		List<String> l = new ArrayList<String>();
		for(String s:coins) {
			l.add(s);
		}
		ListIterator<String> itr = l.listIterator();
		System.out.println("Before reverse: ");
		while(itr.hasNext()) System.out.println(itr.next());
		Collections.reverse(l);
		itr = l.listIterator();
		System.out.println("After reverse: ");
		while(itr.hasNext()) System.out.println(itr.next());
	}

}
