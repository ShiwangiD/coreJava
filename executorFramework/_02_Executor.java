import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _02_Executor {
    public static void main(String[] args) {
        // Future and Callable

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            return 10;
        });

        try {
            System.out.println(f1.get());
        } catch (Exception e) {
        }

        executor.shutdown();

    }

}

/*
 * The Executor Framework in Java is part of the java.util.
 * concurrent package and provides a high-level replacement for manually
 * managing threads.
 * Instead of creating and controlling threads yourself,
 * you delegate task execution to an executor.
 * 
 * Method :=
 * submit() → returns a Future
 * shutdown() → stop accepting new tasks
 * shutdownNow() → attempts immediate stop
 * executor() ->no return type
 */
