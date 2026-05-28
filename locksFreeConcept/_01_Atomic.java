import java.util.concurrent.atomic.AtomicInteger;

public class _01_Atomic {
    public static void main(String[] args){
        Counter counter = new Counter();

        Thread t1 = new  Thread(()->{
            for(int i=1; i<=1000; i++){
                counter.increament();
            }
        });

         Thread t2 = new  Thread(()->{
            for(int i=1; i<=1000; i++){
                counter.increament();
            }
        });

        t1.start();
        t2.start();
        try{
           Thread.sleep(2000);
        }catch(InterruptedException e){}

        System.out.println(counter.count);

    }
    
}

class Counter{
   AtomicInteger count = new AtomicInteger(0);

    void increament(){
        count.incrementAndGet();
    }
}

// t1 & t2 ---> concurrently
// t1 & t2 ---> parallel
//Cas := Compare And set Operation
/*

Atomic :=the atomic concept means an operation happens as a single 
indivisible step — no other thread can observe it halfway through


  methods := get(),set(), increamentAndGet(),getAndImplement(),
  decreamentAndGet(),getAndDecrement(), addAndGet(value),
  getAndAdd(value).
*/
