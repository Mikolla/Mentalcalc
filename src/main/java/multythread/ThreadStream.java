package multythread;

public class ThreadStream extends Thread {
    private static int current = 0;
    private final static Object waiter = new Object();
    private int streamNumber;

    public ThreadStream(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    @Override
    public void run() {
        try {
            synchronized (waiter) {
                while (current < streamNumber) {
                    waiter.wait();
                }
                current++;
                System.out.println(streamNumber);
                waiter.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadStream thread = new ThreadStream(i);
            thread.start();
        }
    }
}
