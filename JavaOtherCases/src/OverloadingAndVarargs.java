
public class OverloadingAndVarargs {
//15
	static void vaTest(int ... no) {
        System.out.print("vaTest(int ...): " 
        + "length: " + no.length +" elements: ");
        for(int n : no)
        System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(boolean ... bl) {
        System.out.print("vaTest(boolean ...) " +
        "length: " + bl.length + " elements: ");
        for(boolean b : bl)
        System.out.print(b + " ");
        System.out.println();
    }
    static void vaTest(String msg, int ... no) {
        System.out.print("vaTest(String, int ...): " +
        msg +"length: "+ no.length +" elements: ");
        for(int  n : no)
        System.out.print(n + " ");
        System.out.println();
    }
    public static void main(String args[]){
        vaTest(1, 2, 3);
        vaTest("test: ", 10, 20);
        vaTest(true, false, false);
    }
}

