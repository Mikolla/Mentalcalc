package multythread;


@SuppressWarnings("UnusedDeclaration")
public class TrainTreads extends Thread {
    private static int currentMax = 0;
    private int mainId;
    private final static Object waitObject = new Object();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            Thread thread = new TrainTreads(i);
            //Thread thread = new SerialSequenceExample(i);
            System.out.println("Start: " + thread.getName());
            thread.start();
        }
    }

    public TrainTreads(int id) {
        this.mainId = id;
    }

    public void run() {
        try {
            System.out.println("Run: " + mainId);
            synchronized (waitObject)
            {
                while (mainId > currentMax)
                {
                    waitObject.wait();
                    System.out.println("Awakened: " + mainId);
                }

                currentMax++;
                System.out.println("Finished: " + mainId);
                waitObject.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


