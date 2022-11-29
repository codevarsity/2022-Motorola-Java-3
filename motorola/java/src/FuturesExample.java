import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FuturesExample {
    public static void main(String[] args) {

        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Task Started");
                Thread.sleep(5000);
                return "Hello from Future";
            }
        };
        try {
            FutureTask<String> task = new FutureTask<String>(stringCallable);
            Thread thread = new Thread(task);
            thread.start();
            String result = task.get();
            System.out.println("Result = " + result);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}