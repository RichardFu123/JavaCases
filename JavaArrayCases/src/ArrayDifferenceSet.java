import java.util.ArrayList;

public class ArrayDifferenceSet {
//12
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1`s elements: " +objArray);
        System.out.println("array2`s elements: " +objArray2);
        objArray.removeAll(objArray2);
        System.out.println("array1`s defference set about array2: "+objArray);
	}

}
