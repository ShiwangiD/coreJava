// Final keyword := final used to paramanent constants value don't change

public class Final {
    public static void main(String[] args){
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x = 4;
        System.out.println(x);
    }  
}

class Random{
    final double PI;

    Random(){
      this.PI = 3.14;

    }
}
