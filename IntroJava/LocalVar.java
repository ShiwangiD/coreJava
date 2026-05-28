public class LocalVar {

     void show(){
            int x=10; //====> local variable
            System.out.println("local varible value is :"+x);
     }
    public static void main(String[] args){
        LocalVar var = new LocalVar();
        var.show();
       
    }
    
}


/*
  Local Varible := A variable declared inside a method, constructor, or block is called a local variable.
  Features :=
    1.Created when method starts
    2.Destroyed when method ends
    3.Must be initialized before use
    4.Accessible only inside that method/block

*/
