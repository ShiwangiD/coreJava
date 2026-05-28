public class _02_Threads {
    public static void main(String[] args){
        // MyRunnable r1 = new MyRunnable();
        // Thread t1 = new Thread(r1);


        Thread t1 = new Thread(() -> System.out.println("Thread is running"));
        t1.start();

    }
    
}



//Thread using Runnable interface

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running ");
    }
}
