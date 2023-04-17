package Question6;
	public class StringClassStringBuffer {
	    public static void main(String[] args) {
	        String str = "Hello";
	        StringBuffer s = new StringBuffer("Hello");
	        str.concat(" World");
	        System.out.println(str);
	        s.append(" World");
	        System.out.println(s.toString());
	    }
	}

