public class Downcasting {
    public static void main(String[] args){
        Animal a = new Dog(); // child class stored in parent class refrence
        Dog d = (Dog) a;  // DownCasting
        d.bark();
        
        Object obj = "hello";
        String s =(String) obj;
        System.out.println(s); // downcasting

    //    Object obj1 = new Integer(10); 
    //    String s1 = (String)obj1;
    //     System.out.println(s1);
    }
    
}

class Animal{

}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}


//Downcasting = converting parent reference back to child reference.
