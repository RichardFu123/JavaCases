import java.util.LinkedList;

public class DataLinkedListAdd {
//03
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		System.out.println(lList);
		lList.addFirst("0");
		System.out.println(lList);
		lList.addLast("4");
		System.out.println(lList);
	}

}
