import java.util.*;

public class CollectionsRotate {
//12
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one two three four five six".split(" "));
		System.out.println(list);
		Collections.rotate(list, 3);
		System.out.println(list);
	}

}
