
public class ArrayFindRepetitions {
//10
	public static void main(String[] args) {
		int[] array = {1,2,2,3,3,4,4,4,5,6,7,7,1,7,7};
		for (int i = 0;i<array.length;i++) {
			for(int j =i+1;j<array.length;j++) {
				if((array[i]==array[j])&&(i != j)){
					System.out.println("find repetation: "+array[i]);
					break;
				}
			}
		}
	}

}
