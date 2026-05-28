public class _08_DaemonThread {
    public static void main(String[] args){
        Thread t1 = new Thread(()-> {
           while(true){
            System.out.println("running");
           }
        });

        t1.setDaemon(true);
        t1.start();

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}

        return;
    }
    
}



/*
 Daemon Thread ---> Background running threads
 ----> stop immediately once main thread is completed

 Threads ---> . User thread , 2. Daemon Thread

 Garbage collection --->  daemon thread
*/
