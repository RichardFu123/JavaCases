
public class TowerOfHanoi {
//03
	public static void main(String[] args) {
		doTowers(5,'A','B','C');
	}
	private static void doTowers(int topN,char from,char inter, char to) {
		if(topN==1) {
			System.out.println("Disk1 from "+ from+ " to "+ to);
		}
		else
		{
			doTowers(topN-1, from,to,inter);
			System.out.println("Disk"+topN+" from "+from+" to "+to);
			doTowers(topN-1, inter,from,to);
		}
	}

}
