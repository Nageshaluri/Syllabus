package Question19;

public class Runnable1 {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable running");
    }
}

