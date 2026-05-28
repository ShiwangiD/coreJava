import java.util.concurrent.atomic.AtomicReference;

public class _04_AtomicRefCas {
    public static void main(String[] args) {
        LikeCounter like = new LikeCounter();

        Thread t1 = new Thread(() ->{
            for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t2 = new Thread(() ->{
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t3 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t4 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t5 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t6 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t7 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t8 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t9 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });
        Thread t10 = new Thread(() -> {
             for(int i=1; i<=10; i++){
              like.like();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        try{
            Thread.sleep(3000);
        }catch(Exception e){}

        System.out.println("Total likes : " +  like.getTotalLike());


    }

}

class LikeCounter {
    AtomicReference<Integer> totalCount = new AtomicReference<>(0);

    public void like() {

        Integer currentCount;
        Integer finalCount;
        while (true) {
            // 1. we be capture the latest value of totatCount;

            currentCount = totalCount.get();

            // 2. Increament like counter by 1
            finalCount = currentCount + 1;

            // 3. check again if the count is still what i saw
            if (totalCount.compareAndSet(currentCount, finalCount)) {
                return;
            }

            // 4. If a thread reaches here, someone else must have updated counter value
            // re-try.

            System.out.println("Conflit detected. Re- trying....");
        }

    }
    public int getTotalLike(){
       return totalCount.get();
    }
}
