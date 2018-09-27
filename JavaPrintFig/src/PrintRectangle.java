
public class PrintRectangle {
//06
	public static void main(String[] args) {
		rectangle(3,4);
	}
	private static void rectangle(int length, int width) {
		for (int i = 0; i < length;i ++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
