import java.util.Arrays;

public class ArrayInsert {
//02
	public static void main(String[] args) {
		int[] array = {2,5,-2,6,-3,8,0,-7,-9,4};
		Arrays.sort(array);
		printArray("Sorted array:",array);
		int index = Arrays.binarySearch(array, 1);
		System.out.println("Element 1`s index(minus means not exists): "+index);
		int newIndex = - index - 1;
		array = insertElement(array,1,newIndex);
		printArray("add a new element 1: ", array);
	}
	
	private static void printArray(String message, int[] array) {
		System.out.println(
				message
				+ ": [length: "+ array.length + "]");
		for (int i = 0; i < array.length;i++) {
			if(i!=0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
	private static int[] insertElement(int[] original, int element, int index) {
		int length = original.length;
		int[] destination = new int[length+1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index+1, length-index);
		return destination;
	}

}
