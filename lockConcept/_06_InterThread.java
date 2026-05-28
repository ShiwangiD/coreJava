public class _06_InterThread {
    public static void main(String[] args) {
        Box1 box = new Box1();

        Thread t1 = new Thread(()-> {
            for(int i=1; i<=20; i++){
                try{
                    Thread.sleep(100);
                     box.producer(i);
                }
                catch(Exception e){}
               
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i=1; i<=20; i++){
                try{
                    Thread.sleep(70);
                     box.consumer();
                }
                catch(Exception e){}
               
            }
        });

        t1.start();
        t2.start();

        
    }
    
}

class Box1{
   volatile Integer item;
   volatile Boolean flag = false;

    synchronized void producer(int value) throws InterruptedException{

        while(flag == true){
            wait();
        }
        item = value;
        flag = true;
        System.out.println("Producer Products : " + item);
        notify();
    }

    synchronized void consumer() throws InterruptedException{

        while(flag == false){
          wait();
        }
        System.out.println("Consumer Consumes : " +item);
        item = null;
        flag = false;
        notify();
    }
}

