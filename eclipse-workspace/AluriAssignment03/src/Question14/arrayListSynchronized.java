package Question14;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class arrayListSynchronized {
	public static void main(String[] args) {
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		List<String> namesList1 = Collections.synchronizedList(new ArrayList<>());
		List<String> namesList2 = new CopyOnWriteArrayList<>();
		namesList.add("Nagesh");
		namesList.add("Aluri");
		namesList1.add("Hemanth");
		namesList1.add("ling");
		namesList2.add("Cat");
		namesList2.add("Dog");
		synchronized(namesList)
		{
		  Iterator<String> iterator = namesList.iterator();
		  while (iterator.hasNext())
		  {
		    System.out.println(iterator.next());
		  }
		}
		  Iterator<String> iterator1 = namesList1.iterator();
		  while (iterator1.hasNext())
		  {
		    System.out.println(iterator1.next());
		  }
		  Iterator<String> iterator2 = namesList2.iterator();
		  while (iterator2.hasNext())
		  {
		    System.out.println(iterator2.next());
		  }		
}
}
