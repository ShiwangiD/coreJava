public class _01_Thread {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();

    }
    
}


// class Thread extends

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is runing");
    }
}





/*
   t1.start() ---> jvm asks os to create a new thread ---> thread gets stack/pc space
   Thread execute run() method 
*/
