package Examples;



public class Demon {
    class Mainthhread extends Thread{
        @Override
        public void run() {
            Thread T = Thread.currentThread();
           // T.setDaemon(true);
            System.out.println(Thread.currentThread().getName());
        }
    }

    public Mainthhread fabric(String nameThread) {
        Mainthhread mainthhread = new Mainthhread();
        mainthhread.setName(nameThread);
        mainthhread.setDaemon(true);
        return mainthhread;
    }

    public static void main(String[] args) {
        Thread curThread = Thread.currentThread();
        curThread.setName("Текущий поток");
        curThread.interrupt();
       Demon demon = new Demon();
       Thread T = demon.fabric("Главный поток");


       T.start();
        System.out.println("demon = " + T.isDaemon());
     //   T.interrupt();

        System.out.println("живой = " + T.isAlive());
        System.out.println("прерван = " + T.isInterrupted());
        System.out.println("текущий поток = " + Thread.currentThread().getName());
        System.out.println("FINE");
    }
}
