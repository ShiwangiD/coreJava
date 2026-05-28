public class _06_ThreadLifeCycle {
    public static void main(String[] args){

        Thread mainThread = Thread.currentThread();

        // Thread new Thread (creation of thread)

        Thread t1 = new Thread(()-> {
            System.out.println("Name of current thread : " + Thread.currentThread().getName());
            System.out.println("Main thread state :" +mainThread.getState());
        });
        System.out.println(t1.getState());

        //runnable stage
        t1.start();
        System.out.println(t1.getState()); //RUNNABLE, TERMINATE
        System.out.println(t1.getState());
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){

        }
        System.out.println(t1.getState());// TERMINATE

    }
    
}




/*
  Thread Life Cycle := 
  Execution of Thread :=
  
  stop()       stop()    stop()       stop() 
  |            |          |            |
  start()      run()       run()      run()finish
  |            |           |              |
    NEW --> RUNNABLE --> RUNNING --> TERNIMATED

*/
