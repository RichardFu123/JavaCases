import java.util.Collections;
import java.util.Vector;

public class DataIndex {
//07
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("S");
		v.add("h");
		v.add("a");
		v.add("w");
		v.add("n");
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "w");
		System.out.println("the index of w is: "+index);
	}

}
