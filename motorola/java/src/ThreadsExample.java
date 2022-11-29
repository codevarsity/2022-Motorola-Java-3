
class SimpleThread extends Thread {

    int counter = 0;
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 1000; ++i) {
            int result = counter + i;
            System.out.println("Thread with name = " + Thread.currentThread().getName() + " running " + result);
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsExample {
    public static void main(String[] args)  {
        System.out.println("THread Execution ");
        System.out.println("Thread Name = " + Thread.currentThread().getName());
        System.out.println("Thread Priority = " + Thread.currentThread().getPriority());


        Thread thread = new Thread(()->{
            try {
                System.out.println("Thread Name = " + Thread.currentThread().getName());
                System.out.println("Thread Priority = " + Thread.currentThread().getPriority());
                for (int i = 0; i < 10; ++i) {
                    System.out.println("Thread with name = " +
                            Thread.currentThread().getName() +
                            " running " + i);

                    Thread.sleep(1000);
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();




//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 1000; ++i) {
//
//                    System.out.println("Thread with name = " +
//                            Thread.currentThread().getName() +
//                            " running " + i);
//                    try {
//                        Thread.sleep(100);
//                    } catch(InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//        SimpleThread thread = new SimpleThread();
//        thread.counter = 100;
//        thread.start();
//
//        SimpleThread thread1 = new SimpleThread();
//        thread1.counter = 500;
//        thread1.start();
        System.out.println("Main function done");

    }
}
