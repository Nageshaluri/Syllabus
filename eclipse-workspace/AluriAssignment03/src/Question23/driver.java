package Question23;

public class driver {
	public static void main(String[] args) {
    immutableThreadSafe immutableObj = new immutableThreadSafe(20);

    Runnable task = () -> {
        System.out.println(immutableObj.getValue());
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

}

}
