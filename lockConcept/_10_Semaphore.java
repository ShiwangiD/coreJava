import java.util.concurrent.Semaphore;

public class _10_Semaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for(int i=1; i<=5; i++) {
            new Worker(semaphore).start();
        }
        
    }
    
}

class Worker extends Thread {

    Semaphore semaphore;

    Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {

        try {
            semaphore.acquire(); // ===> take permit

            System.out.println(Thread.currentThread().getName()
                    + " acquired permit");

            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
 } finally {

            System.out.println(Thread.currentThread().getName()
                    + " released permit");

            semaphore.release(); // ====> return permit
        }
    }
}


/*
 SemaPhore :- A Semaphore in Java is a synchronization mechanism used to 
 control access to a shared resource using a fixed number of permits.

 multiple thread allowed 
*/
