import java.util.LinkedList;

public class DataLinkedListIndex {
//09
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");
		System.out.println("The first index of element '2': " + lList.indexOf("2"));
		System.out.println("The last index of element '2': "+ lList.lastIndexOf("2"));
	}

}
