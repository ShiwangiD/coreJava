public class DataType {
    public static void main(String[] args){
        // Integer ---> byte,short,int,long
        // Binary(2) , Octal(8) , Hexadecimal number system(16)

        byte b = 5;
        byte b1 = 0b1010;
        byte b2 = 06;
        byte b3 = 0xf;
        short s = 10;
        int i = 4000;
        long l = 10000;
        System.out.println("Integer vlaues ---->"+b+" ," +s+", "+i+", "+l);
        System.out.println("Binary to decimal --->"+b1);
        System.out.println("octal to decimal --->"+b2);
        System.out.println("hexadecimal to decimal --->"+b3);

        // Real Number :=
        float f = 10.54f; // single precision
        double d = 23.6879; // double precision
        System.out.println("real number --->"+f+","+d);

        // characters
        char c = 'a'; // a ---> integer ---> binary ----> store
        System.out.println("character is --->"+c);

        //boolean 

        boolean bool = true;
        System.out.println("boolean is --->"+bool);

        // stroing floating point value

        float f1 = 8.12334f;
        System.out.printf("%.20f%n", f1);
        float f2 = 0.7f;
        System.out.printf("%.20f%n", f2);

        char j = 'a';
        int h = j;
        System.out.println(h);
        short u = 897;
        int t = u;
        System.out.println(t);

        // explicit conversion 

        int p = 345;
        byte g =(byte) p;
        System.out.println(g);

        // turncating conversion

        float r = 45.987f;
        int a =(int) r;
        System.out.println(a);

        // boolean conversion 
        // these conversion are not possible 
       
        // automatic type conversion promotion
        // byte ---> int 

        byte n = 50;
        byte o = 40;
        byte y = 100;
        int q = (n*o)/y;

        n =(byte)( n*2);
        System.out.println(n);

        // Type promotion rules :
        // byte , short and char values are promoted to int

        byte b5 = 42;
        char c1 = 'a';
        short s1 = 1020;
        int i1 =50000;
        float f4 = 5.876f;
        double d1 = .12345;

        double result = (f4*b5)+(i1/c1)-(d1*s1);
        System.out.println(result+" : result");
    }
    
}

/*
 Data Type := A data type is a classification of data that specifies the type,
 and size of values a variable can store.

 Types :=
  1. Primitive Data Types := These store simple values directly in memory.
         (byte, short,int,long,float,double,char,boolean).
  2.Non-Primitive Data Types (Reference Types) := These store addresses of objects, not actual values.
         (String,array,Classes,interfaces)       
*/
