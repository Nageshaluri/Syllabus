package singletonSynchronised;

public class singletonSynchronised {
	    private static singletonSynchronised INSTANCE;

	    private singletonSynchronised() {}

	    public static synchronized singletonSynchronised getInstance() {
	        if (INSTANCE == null) {
	            INSTANCE = new singletonSynchronised();
	        }
	        return INSTANCE;
	    }
	}

