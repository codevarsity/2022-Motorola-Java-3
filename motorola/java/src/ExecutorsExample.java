import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; ++i) {
            service.execute(() -> {
                try {
                    System.out.println("Downloading using Thread " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("File download completed");
                    System.out.println("Ending Thread " + Thread.currentThread().getName() );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        service.shutdown();
        System.out.println("Executors Service is shutdown");
        System.out.println("Exiting Main");
    }
}
