public class _01_Generics {
    public static void main(String[] args){
        
        // Pair<Integer,String> p1 = new Pair<>(01,"muskan");
        //System.out.println(p1.first +"............"+p1.second);

        // String y = (String) getResult("Hello");
        // System.out.println(y);

        // Integer y = getResult(23);
        // System.out.println(y);

        printPair(11, "hello");//--> Type inference

    }  
    // public static Object getResult(Object x){
    //     return x ;
    // }


    public static <T> T getResult(T x){ // <T> Type parameter
        return x;
    }

    public static <T,U> void printPair(T first, U second){
        System.out.println(first + " , "+ second);
    }
    
}
//generic
// class Pair<T,U>{
//     T first;
//     U second;
//     Pair(T first, U second){
//         this.first= first;
//         this.second=second;
//     } 
// }

// Generic method
// <T> returnType methodName(T parameter){}


