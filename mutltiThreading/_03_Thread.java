public class _03_Thread {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());


        // create Thread 

        // Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        Thread t1 = new Thread(() -> {
            System.out.println("Name of my Thread is : "+Thread.currentThread().getName());
            System.out.println("Id of my thread is : "+Thread.currentThread().getId());
        });

         Thread t2 = new Thread(() -> {
            System.out.println("Name of my second Thread is : "+Thread.currentThread().getName());
            System.out.println("Id of my second thread is : "+Thread.currentThread().getId());
        });


        t1.start();
        t2.start();
    }
    
}


// thread Id and thread Name
