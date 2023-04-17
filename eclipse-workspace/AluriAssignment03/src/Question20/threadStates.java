package Question20;

public class threadStates implements Runnable {

		   public void run() {
		      System.out.println("Thread running");
		   }

		   public static void main(String[] args) throws InterruptedException {
		      Thread thread = new Thread(new threadStates());
		      System.out.println("Thread state: " + thread.getState());
		      thread.start();
		      System.out.println("Thread state: " + thread.getState());
		      Thread.sleep(999);
		      System.out.println("Thread state: " + thread.getState());
		      thread.join();
		      System.out.println("Thread state: " + thread.getState());
		   }
		}
