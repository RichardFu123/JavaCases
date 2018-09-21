import java.util.HashSet;
import java.util.Set;

public class ArrayUnionSet {
//16
	public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "2", "3" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("Union set: ");
 
        for (String str : result_union) {
            System.out.println(str);
        }
    }
 
    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();
 
        for (String str : arr1) {
            set.add(str);
        }
 
        for (String str : arr2) {
            set.add(str);
        }
 
        String[] result = {  };
 
        return set.toArray(result);
    }
}
