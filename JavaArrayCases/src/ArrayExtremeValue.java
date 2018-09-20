import java.util.Arrays;
import java.util.Collections;

public class ArrayExtremeValue {
//06
	public static void main(String[] args) {
		Integer[] numbers = {8,5,34,1,9,0,-1,3,5,7};
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("maxmium: "+ max);
		System.out.println("minimum: "+ min);
	}

}
