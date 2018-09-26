
public class PrintArray {
//02
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] floatArray = {1.2,2.2,3.,4.5};
		Character[] charArray = {'a','s','s','a','s','s','i','n'};
		printArray(intArray);
		printArray(floatArray);
		printArray(charArray);
		
	}
	
	private static void printArray(Integer[] inputArray) {
		for (Integer i : inputArray) {
			System.out.printf("%s", i);
			System.out.println();
		}
	}
	private static void printArray(Double[] inputArray) {
		for(Double i : inputArray) {
			System.out.printf("%s", i);
			System.out.println();
		}
	}
	private static void printArray(Character[] inputArray) {
		for(Character i : inputArray) {
			System.out.printf("%s", i);
			System.out.println();
		}
	}

}
