package Question12;
public class finalFinallyFinalize {
	    private final int value;
	    public finalFinallyFinalize(int value) {
	        this.value = value;
	    }
	    public int getValue() {
	        return value;
	    }
	    public static void main(String[] args) {
	    	finalFinallyFinalize ex = null;
	        try {
	        	ex = new finalFinallyFinalize(42);
	            System.out.println("Value: " + ex.getValue());
	        } catch (Exception ep) {
	            System.out.println("Exception caught: " + ep.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	        ex = null;
	        System.gc();
	        System.out.println("End of program.");
	    }
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Finalize method called.");
	        super.finalize();
	    }
	}


