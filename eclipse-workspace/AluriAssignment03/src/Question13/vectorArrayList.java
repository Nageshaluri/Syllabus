package Question13;
import java.util.*;
public class vectorArrayList {
	    public static void main(String[] args) {
	        Vector<Integer> v = new Vector<>();
	        v.add(11);
	        v.add(22);
	        v.add(33);
	        ArrayList<Integer> arrList = new ArrayList<>();
	        arrList.add(71);
	        arrList.add(72);
	        arrList.add(73);
	        System.out.println("Vector: " + v);
	        System.out.println("ArrayList: " + arrList);
	        System.out.println("Vector size: " + v.size());
	        System.out.println("ArrayList size: " + arrList.size());
	        System.out.println("Vector capacity: " + v.capacity());
	        System.out.println("ArrayList capacity: " + arrList.size());
	        v.addElement(64);
	        arrList.add(74);
	        System.out.println("Vector: " + v);
	        System.out.println("ArrayList: " + arrList);
	    }
	}


