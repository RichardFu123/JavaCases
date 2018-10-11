import java.util.Arrays;
import java.util.List;

public class CollectionsArrayToList {
//01
	public static void main(String[] args) {
		String[] array = new String[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = String.valueOf(i);
		}
		List<String> list = Arrays.asList(array);
		for(String s : list) {
			System.out.println(s);
		}
	}

}
