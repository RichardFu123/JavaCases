
public class PrintInvertedTriangle {
//04
	public static void main(String[] args) {
		for(int m = 1; m <= 4; m++) {
			for (int n = 0; n <= m; n++) {
				System.out.print(" ");
			}
			for (int x = 1; x<= 7-2 *(m-1);x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
