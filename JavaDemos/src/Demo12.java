import java.util.Arrays;
import java.util.Random;

public class Demo12 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		for (int i = 0; i<10;i++) {
			arr[i] = random.nextInt(100);
		}
		
		System.out.println("The random array is: "+ Arrays.toString(arr));
		
		int min = arr[0];
		for (int i: arr) {
			min = (i<min)?i:min;
		}
		System.out.println("The minimum of this array is: "+min);
		int[] newArr = Arrays.copyOf(arr, 11);
		
		for (int k = newArr.length-1;k>=1;k--) {
			newArr[k] = newArr[k-1];
		}
		newArr[0] = min;
		
		System.out.println("The array be enlarged is: "+Arrays.toString(newArr));
	}
}
