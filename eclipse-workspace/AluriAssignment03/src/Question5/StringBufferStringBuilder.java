package Question5;
	public class StringBufferStringBuilder {
	    public static void main(String[] args) {
	        StringBuffer Buffer = new StringBuffer();
	        StringBuilder Builder = new StringBuilder();
	        synchronized (Buffer) {
	        	Buffer.append("Hello");
	        	Buffer.append(" ");
	        	Buffer.append("Buffer");
	            System.out.println(Buffer.toString());
	        }
	        Builder.append("Hello");
	        Builder.append(" ");
	        Builder.append("Builder");
	        System.out.println(Builder.toString());
	    }
	}

