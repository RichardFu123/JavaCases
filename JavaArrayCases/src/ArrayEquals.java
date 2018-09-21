import java.util.Arrays;

public class ArrayEquals {
//15
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("Does ary equal to ary1?: "
        +Arrays.equals(ary, ary1));
        System.out.println("Does ary equal to ary2?: "
        +Arrays.equals(ary, ary2));
	}

}
