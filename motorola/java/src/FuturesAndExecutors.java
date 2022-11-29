import java.util.concurrent.*;

public class FuturesAndExecutors {
    public static void main(String[] args) {
        try {
            Callable<String> stringCallable = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("Task Started");
                    Thread.sleep(5000);
                    return "Hello from Future";
                }
            };

            ExecutorService service = Executors.newFixedThreadPool(5);
            Future<String> future = service.submit(stringCallable);
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
