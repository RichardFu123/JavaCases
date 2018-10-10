import java.util.LinkedList;

public class DataLinkedListPop {
//06
	private LinkedList<Object> lList = new LinkedList<>();
	public void push(Object v) {
		lList.addFirst(v);
	}
	public Object top() {
		return lList.getFirst();
	}
	public Object pop() {
		return lList.removeFirst();
	}
	public static void main(String[] args) {
		DataLinkedListPop stack = new DataLinkedListPop();
		for(int i = 0; i < 10; i++) {
			stack.push(new Integer(i));
		}
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.top());
	}

}
