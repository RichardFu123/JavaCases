
public class PrintTriangle {
//03
	public static void main(String[] args) {
		print(10);
	}
	
	private static void print(int size) {
		if (size%2==0){
			size ++;
		}
		for (int i = 0; i< size/2+1; i++) {
			for (int j = size /2 +1;j>i+1;j--) {
				System.out.print(" ");
			}
			for (int j = 0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}

}
