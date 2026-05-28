public class _04_Thread {
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
            System.out.println("Current thread is : " + Thread.currentThread().getName());
        });

        //  t1.start();
         t1.start();
        // t1.run();
    }
    
}

//can we start() the same thread twice ? || no
