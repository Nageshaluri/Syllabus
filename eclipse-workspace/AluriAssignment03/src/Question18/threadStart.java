package Question18;

public class threadStart {
	public static void main(String[] args) {
	Thread myTh = new Thread(() -> {
	    System.out.println("Thread started.");
	});
	myTh.start();
	try {
	    myTh.start();
	} catch (IllegalThreadStateException e) {
	    System.out.println("start thread twice");
	}

	}
}
