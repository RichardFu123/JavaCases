import java.util.*;

public class CollectionsReadOnly {
//09
	public static void main(String[] args) {
		List<String> stuff = Arrays.asList(new String[] {"a","b"});
		List<String> list = new ArrayList<>(stuff);
		list = Collections.unmodifiableList(list);
		try
		{
			list.set(0, "c");
		}
		catch(Exception e) 
		{
		e.printStackTrace();	
		}
		Set<String> set = new HashSet<>(stuff);
		set = Collections.unmodifiableSet(set);
		Map<String,String> map = new HashMap<>();
		map = Collections.unmodifiableMap(map);
		System.out.println("Finish");
	}

}
