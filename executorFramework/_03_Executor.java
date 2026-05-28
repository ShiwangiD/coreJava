
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class _03_Executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(()->{
            int x = 10/0;
        });

        Future<Integer> f1 = executor.submit(()->{
            return(10/0);
        });

        try{
            System.out.println(f1.get());
        }catch(Exception e){}


       
    }
    
}
