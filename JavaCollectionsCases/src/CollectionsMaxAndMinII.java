import java.util.*;

public class CollectionsMaxAndMinII {
//13
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println(list);
		System.out.println("Max: "+Collections.max(list));
		System.out.println("Min: "+Collections.min(list));
	}

}
