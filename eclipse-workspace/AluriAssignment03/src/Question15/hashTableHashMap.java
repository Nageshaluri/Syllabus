package Question15;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class hashTableHashMap {
	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("HI", 1);
		table.put("hello", 2);
		table.put("bye", 3);
		int value = table.get("bye");
		for (Map.Entry<String, Integer> entry : table.entrySet()) {
		    System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("good", 1);
		map.put("morning", 2);
		map.put("happy", 3);
		int value1 = map.get("good");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}

}
