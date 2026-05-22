public class Test {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        System.out.println(x == y); // primitive compares values

        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b); // compares refrences
        System.out.println(a.intValue() == b.intValue());
        System.out.println(a.equals(b));
    }
    
}
