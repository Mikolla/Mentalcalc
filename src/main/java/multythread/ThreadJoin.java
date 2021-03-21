package multythread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadJoin extends Thread {
    private Thread thread;

    public ThreadJoin(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished = " + currentThread().getName() + " joined = " + thread.getName());
    }

    public static void main(String[] args) {
        Thread main = currentThread();
        List<Thread> threads = new ArrayList<>();
        int i = 0;
        Thread t = main;
        while (i < 9)
        {
            t = new ThreadJoin(t);
            i++;
            t.setName("t" + i);
            threads.add(t);
        }
        Collections.shuffle(threads);
        threads.forEach(x -> System.out.print(x.getName() + " "));
        System.out.println();
        threads.stream().forEach(tr -> {
            tr.start();
        });
    }
}
