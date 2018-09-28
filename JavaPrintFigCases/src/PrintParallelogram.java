
public class PrintParallelogram {
//05
	public static void main(String[] args) {
		Parallelogram(10,10);
	}
	
	private static void Parallelogram(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0;j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < width; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
