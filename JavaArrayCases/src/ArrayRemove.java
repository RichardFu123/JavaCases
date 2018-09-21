import java.util.ArrayList;

public class ArrayRemove {
//11
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.clear();
		array.add(0,"No.0");
		array.add(1,"No.1");
		array.add(2,"No.2");
		System.out.println("Before remove(): "+array);
		array.remove(1);
		array.remove("No.0");
		System.out.println("After remove(): "+array);
	}

}
