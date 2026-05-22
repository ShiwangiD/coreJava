public class Operator {
    public static void main(String[] args){
        // Operators in java 
        // Airthmatic Operators ----> +,-,*,/,%

        int a = 5;
        int b = 10;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Airthmatic Operation : "+a+","+b+","+c+","+d+","+e+","+f+","+g);

        int h = a+2;
        System.out.println(h);
        int j = 8;
        ++j;
        System.out.println(j);
        j++;
        System.out.println(j);

        int k = ++j;
        System.out.println(k);
        j++;
        System.out.println(k);

        // Relational Operators ---> ==,!=, <, >,<=,>=

        int a1 = 5;
        int a3 = 10;

        boolean a4 =(a1 == a3);
        System.out.println(a4); //false

        boolean a5 = (a1 != a3);
        System.out.println(a5);

        boolean a6 = (a1>a3);
        System.out.println(a6);

        boolean a7 = (a1<a3);
        System.out.println(a7);

        boolean a8 = (a1>=a3);
        System.out.println(a8);

        boolean a9 = (a1<=a3);
        System.out.println(a9);

    }
    
}
