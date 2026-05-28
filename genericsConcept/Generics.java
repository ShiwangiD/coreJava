public class Generics{
    public static void main(String[] args){
        // Box b1 = new Box(10);
        // Box b2 = new Box("lovely");
        // Box b3 = new Box(1000000);

        // Integer x = (Integer)b1.getValue();
        // String s = (String)b2.getValue();
        // Double d = (Double)b3.getValue();

        Box2<Integer> b = new Box2<Integer>(10);
        Box2<String> b2 = new Box2<>("lovely");
         Box2<Boolean> b3 = new Box2<>(true); 
        System.out.println(b2.getValue());
         System.out.println(b3.getValue());
         System.out.println(b.getValue() + 5);

    }
}

// class Box{
//     private Object value;
//     Box(Object value){
//         this.value= value;

//     }
//     public Object getValue(){
//         return this.value;
//     }
//     public void setValue(Object value){
//         this.value = value;
//     }
// }


// Generics

class Box2<T>{ // Type parameter
    private T value;
    Box2(T value){
        this.value= value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value=value;
    }
}



// object class stored multiple data type values.---> Object class is parent class in java 
//generics allow different data types value input