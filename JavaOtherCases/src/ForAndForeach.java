
public class ForAndForeach {
//13
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7};
		forDisplay(intArray);
		foreachDisplay(intArray);
	}
	
	private static void forDisplay(int[] a) {
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]+" ");
		}
	}
	private static void foreachDisplay(int[] a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
