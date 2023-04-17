package Question10;
import java.io.FileNotFoundException;
import java.io.IOException;
public class throwsClause {
	    public void my() throws IOException {
	    	
	    }
	}
	class Subclass extends throwsClause {
	    public void my() throws IOException {	        
	    }	    
	    public void my() throws FileNotFoundException {
	    
	     }
	}
