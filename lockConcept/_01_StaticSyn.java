public class _01_StaticSyn {
    public static void main(String[] args){

        Thread t1 = new Thread(()-> Counter1.increament());
        Thread t2 = new Thread(()-> Counter1.increament());

        t1.start();
        t2.start();

    }  
}

class Counter1{
    static int count = 0;
    static void increament(){
        synchronized(Counter1.class){
            try{
        Thread.sleep(2000);
    }
    catch(Exception e){};
        count++;
        System.out.println(count);
        }
    
    }
}
