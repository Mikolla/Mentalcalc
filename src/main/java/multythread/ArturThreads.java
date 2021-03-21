package multythread;

class muThreads{
    public static void main(String[] args){
        Thread t1 = new MyThread();
        Thread t2 = new MyThread(t1);
        Thread t3 = new MyThread(t2);
        t3.setName("t3");
        t2.setName("t2");
        t1.setName("t1");
        t3.start();
    }
}

class MyThread extends Thread {
    private Thread thread;

    public MyThread() {
    }

    public MyThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run(){
        System.out.println("Работает: " + Thread.currentThread().getName());
        if (thread != null){
            thread.start();
            try {
                System.out.println(Thread.currentThread().getName() + " ожидает выполнение работы потока: " + thread.getName());
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Заканчивает работу: " + Thread.currentThread().getName());
    }
}
