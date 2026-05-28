public class ConstChaining {
    ConstChaining(){

        //this() is used to call current class object.
        this(20);
        System.out.println("Default constructor");
    }
    ConstChaining(int rollNo){
        System.out.println("parameterise constructor :"+rollNo);
    }
    public static void main(String[] args){
        ConstChaining cc = new ConstChaining();

    }
    
}



/*

 Constructor Chaning := Constructor chaining is the process of calling
                        one constructor from another constructor.
                        avoid duplication.

   Types := 
     1.within same class ---> using this ()
     2.between parent and child class ---> using super()
*/
