package Question22;

public final class immutableClass {
	    private final int value;
	    private final String name;

	    public immutableClass(int value, String name) {
	        this.value = value;
	        this.name = name;
	    }

	    public int getValue() {
	        return value;
	    }

	    public String getName() {
	        return name;
	    }
	}

