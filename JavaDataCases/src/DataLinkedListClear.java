import java.util.LinkedList;

public class DataLinkedListClear {
//05
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<>();
		lList.add("0");
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		System.out.println(lList);
		lList.subList(0, 2).clear();
		System.out.println(lList);
		lList.clear();
		System.out.println(lList);
	}

}
