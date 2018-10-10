import java.util.LinkedList;

public class DataLinkedListModify {
//13
	public static void main(String[] args) {
		 LinkedList<String> officers = new LinkedList<>();
		 officers.add("S");
		 officers.add("S");
		 officers.add("a");
		 officers.add("w");
		 officers.add("n");
		 System.out.println(officers);
		 officers.set(1, "h");
		 System.out.println(officers);
	}

}
