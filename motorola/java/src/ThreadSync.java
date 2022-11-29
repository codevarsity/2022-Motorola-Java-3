public class ThreadSync {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "Thread1");
        Thread thread2 = new Thread(counter, "Thread2");
        thread1.start();
        thread2.start();

    }
}

class Counter implements Runnable {
    private int currentValue = 0;


    @Override
    public void run() {                         // (1) Thread entry point

         // (2)
        synchronized (this) {
            while (this.currentValue < 20) {
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s: old:%s new:%s%n",
                        threadName,           // (3) Print thread name,
                        this.currentValue,    //     old value,
                        ++this.currentValue);   //     new incremented value.x

                try {
                    Thread.sleep(1000);                    // (4) Current thread sleeps.

                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                }
                Thread.yield();
            }
        }
        System.out.println("Exiting " + Thread.currentThread().getName());
    }

}

