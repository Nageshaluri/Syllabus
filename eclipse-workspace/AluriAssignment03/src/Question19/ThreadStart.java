package Question19;

class ThreadStart extends Thread {
	
    public void run() {
	        System.out.println("MyThread running");
	    }
	
}

class Main{
	public static void main(String[] args) {
		ThreadStart t1 = new ThreadStart();
		
		t1.start();

	}
}

