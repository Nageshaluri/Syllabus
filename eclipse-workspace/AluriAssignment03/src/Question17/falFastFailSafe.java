package Question17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class falFastFailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("hello");
		list.add("everyone");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		    String e = iterator.next();
		    list.remove(0);
		}
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Good", 1);
		map.put("Morning", 2);
		map.put("World", 3);
		Iterator<Integer> iterator1 = map.values().iterator();
		while (iterator1.hasNext()) {
		    Integer ele = iterator1.next();
		    map.put("HIII", 4);
		}


	}

}