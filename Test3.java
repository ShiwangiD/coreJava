public class Test3 {
    public static void main(String[] args){
        Pair p = new Pair(10, 20);
        System.out.println(p.first + " ,"+ p.second);

    }
    
}

class Pair{
    int first;
    int second;

    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
