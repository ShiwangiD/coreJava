public class Smethods {
    public static void main(String[] args) {

     String s = " ";
    for(int i=0; i<5; i++){
        s+=i; // s = s+i;
        System.out.println(s);
    }

        String s1 = "hello"; // Literal 
        String s2 = "hello";
        System.out.println(s1 == s2);// true
        s1.concat("world"); // immutable ---> cant change value
        System.out.println(s1);

        String s3 = new String("lovely"); // using new
        String s4 = new String("lovely");
        System.out.println(s3 == s4); // refrences ---> false


        String s5 = "ja"+"va"; // compile time declaration
        String s6 = "java";
        System.out.println(s5 == s6);// true

        String s7 = "ja";
        String s8 = s1 + "va"; // runtime declaration
        String s9 = "java";
        System.out.println(s8 == s9);// false because compare refrences
        System.out.println(s7 == s8); // false

        String s10 = "java";
        String s11 = s10;
        System.out.println(s10 == s11); // true because assignment operator reslove compile time

        String s12 = "hello";
         s12 = "world";
         System.out.println(s12);// world 

         // string pool --->s12--> hello--->s12 ---> world if not use hello then go to garbage collector.

         String s13 = new String("hello");
         String s14 = "hello";

         System.out.println(s13 == s14);// false

         // Heap ---> hello
         // String pool ---> hello
    }
    
}

// Notes := 1.only compile time constant go to string pool automatically.
// 2. runtime created string go to heap.

// Problem of immutability :=

