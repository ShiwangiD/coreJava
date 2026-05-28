public class _03_CustomLock {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread t1 = new Thread(() -> bank.deposit());
        Thread t2 = new Thread(() -> bank.withdrow());

        Thread t3 = new Thread(()-> bank.m1());
        Thread t4 = new Thread(()-> bank.m1());

        t1.start();
        t2.start();

        t3.start();
        t4.start();

    }

}

class Bank {

    Object lock1 = new Object();
    Object lock2 = new Object();

    void m1(){
        synchronized(this){
        System.out.println(Thread.currentThread().getName() + " : Entered m1");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){};

        System.out.println(Thread.currentThread().getName() + " : Exiting m1");
    }
    }

   void deposit(){
     synchronized(lock1){
        System.out.println("deposite logic");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){};
    }
    }

    void withdrow(){
         synchronized(lock2){
        System.out.println("withdraw logic");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}
    }
}
}
