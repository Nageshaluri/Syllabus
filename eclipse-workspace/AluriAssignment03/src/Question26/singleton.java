package Question26;

public class singleton {
	    private static final singleton INSTANCE = new singleton();

	    private singleton() {}

	    public static singleton getInstance() {
	        return INSTANCE;
	    }
	}

