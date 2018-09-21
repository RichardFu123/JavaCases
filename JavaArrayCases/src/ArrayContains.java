import java.util.ArrayList;

public class ArrayContains {
//14
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("apple");
		Object obj = new Object();
		Object obj2 = new Object();
		array.add(obj);
		System.out.println("Elements in array: "+array);
		System.out.println("Does apple in array?: "+ array.contains("apple"));
		System.out.println("Does Apple in array?: "+ array.contains("Apple"));
		System.out.println("Does obj in array?: "+ array.contains(obj));
		System.out.println("Does obj2 in array?: "+ array.contains(obj2));

	}

}
