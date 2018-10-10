import java.util.LinkedList;

public class DataLinkedListGet {
//04
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<>();
		lList.add("0");
		lList.add("1");
		lList.add("2");
		System.out.println("The first element of the list is: "+ lList.getFirst());
		System.out.println("The last element of the list is: "+ lList.getLast());
	}

}
