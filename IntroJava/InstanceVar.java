public class InstanceVar {
    String name = "shivesh"; //====> instance variable
    public static void main(String[] args){
        InstanceVar var = new InstanceVar();
        System.out.println(var.name);

    }
    
}

/*
 Instance Variable : A variable declared inside a class but outside methods is called an instance variable.
    Features
     1.Belongs to an object
     2.Each object gets its own copy
     3.Created when object is created
     4.Stored in heap memory
*/
