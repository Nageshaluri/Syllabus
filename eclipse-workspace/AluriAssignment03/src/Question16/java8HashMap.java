package Question16;

import java.util.HashMap;
import java.util.Map;

public class java8HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Aluri", 1);
		map.put("Nagesh", 2);
		map.put("Hi", 3);
		int value = map.get("Hi");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    String key = entry.getKey();
		    int val = entry.getValue();
		    System.out.println(key + " => " + val);
		}
	}

}
