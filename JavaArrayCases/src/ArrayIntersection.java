import java.util.ArrayList;

public class ArrayIntersection {
//13
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		array1.add("common1");
		array2.add("common1");
		array1.add("common2");
		array2.add("common2");
		array1.add("notcommon3");
		array2.add("notcommon2");
		array1.add("notcommon1");
		System.out.println("Elements in array1: "+array1);
		System.out.println("Elements in array2: "+array2);
		array1.retainAll(array2);
		System.out.println("Intersection between array1 and array2: "+array1);
	}

}
