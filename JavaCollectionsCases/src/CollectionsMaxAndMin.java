import java.util.*;

public class CollectionsMaxAndMin {
//02
	public static void main(String[] args) {
		String[] coins = {"Penny","nickel","dime","Quarter","dollar"};
		Set<String> set = new TreeSet<String>();
		for(String s: coins) {
			set.add(s);
		}
		System.out.println(Collections.min(set));
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
		System.out.println();
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
	}

}
