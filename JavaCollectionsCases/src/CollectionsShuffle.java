import java.util.*;

public class CollectionsShuffle {
//05
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(new Integer(i));
		}
		System.out.println("Before shuffle: "+list);
		for(Integer j:list) {
			System.out.println("The "+(j+1)+" times shuffle");
			Collections.shuffle(list);
			System.out.println(list);
		}
	}

}
