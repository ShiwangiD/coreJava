public class _07_ThreadMethod {
    public static void main(String[] args)throws InterruptedException {
        
        // System.out.println("Main Thread starts");
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        // }
        // System.out.println("Main Thread ends");



        //join() :=
        // System.out.println("Main thread is starts");
        // Thread t1 = new Thread(()->{
        //     try{
        //         Thread.sleep(2000);
        //     }
        //     catch(InterruptedException e){}
        //     System.out.println("Thread-0 starts");
        // });
        // t1.start();
        // //t1.join();
        // t1.join(1000); //let the t1 thread first complete its execution
        // System.out.println("Main thread ends");



        // Thread.Yield() :=
        // Thread t1 = new Thread(()->{
        //     for(int i=1; i<10; i++){
        //         System.out.println("T1 : " + i);
        //         Thread.yield();
        //     }
        // });

        // Thread t2 = new Thread(()->{
        //     for(int i=1; i<10; i++){
        //         System.out.println("T2 : " + i);
        //     }
        // });

        // t1.start();
        // t2.start();

        //interrupted() :=
        // Thread t1 = new  Thread(()-> {
        //     while(!Thread.currentThread().isInterrupted()){
        //         System.out.println("Running");
        //     }
        // });
        // t1.start();
        // Thread.sleep(2000);
        // t1.interrupt();


        // isAlive() :=
        // Thread t1 = new Thread(()-> {
        //     try{
        //         Thread.sleep(2000);
        //     }
        //     catch(Exception e){}
           
        // });
        // System.out.println(t1.isAlive()); //false
        // t1.start();
        // System.out.println(t1.isAlive()); //true
        // try{
        //     Thread.sleep(3000);
        // }
        // catch(Exception e){}
        // System.out.println(t1.isAlive()); // false

        //currentThread() --> refrence of current running thread.

        // Thread t1 = new Thread(()->{
        //     System.out.println(Thread.currentThread().getName());
        // });

        // t1.setName("worker-1");
        // t1.start();

        // Thread Priority
        Thread t1 = new Thread(()->{
            System.out.println("custom thread running");
        });
         Thread t2 = new Thread(()->{
            System.out.println("custom-2 thread running");
        });
        t1.start();
        t2.start();
        t1.setPriority(8);
       System.out.println( t1.getPriority());


    }

}

// Important threads methods

/*
 * Thread.sleep(miliseconds) --->TIMED_WAITING
 * RUNNABLE ---> TIMED_WAITING ---> RUNNABLE
 * 
 * join():=
 * MAIN THREAD --> WAITING
 * t1.THREAD ---->RUNNABLE ----> TERMINATED
 * MAIN THREAD ----> WAITING ----> RUNNABLE ----> TERMINATED
 * 
 * Thread,yield() ---> I am willing to give my cpu time to someone else with same priority and that wants to run.
 *1. os reject this.
 *2. current thread does not go to waiting , Timed_waiting, blocked.
 *3. It does go to only runnable state.
 *4.It is like a suggestion to the os.


 1.Thread --> interrupt flag (default false)
 2.t1.interrupt() --> send a signal to t1 thread that it  should stop doing what its  doing.
 3.We can gracefully handle
 4. you can make  a thread run until a  condition.
 5. cancelling a long  running task.

 isInterrupted() --> return interrupt flag value (T/F)
 interrupted() --> return interrupt flag value (T/F) but also set it back to false

 sleep(), join(), wait() : TIMED_WAITING, WAITING ---> interrupt()

 isAlive() --> start- terminate

 Thread Priority :=
 MAX_PRIORITY = 10
 MIN_PRIORITY = 1
 NORM_PRIORITY = 5

 depend on os 
 --> may respect priority
 --> may partially respect
 --> may not at all
 */
