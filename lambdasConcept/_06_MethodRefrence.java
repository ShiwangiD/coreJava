import java.util.ArrayList;
import java.util.List;

public class _06_MethodRefrence {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        // list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println); // Method refrence  ::

    }
    
}

/*
  Method Refrence :- shorthanded for lambda expression only exit method(inbuilt).
  Types :-
    1. Reference to a static method := ClassName::staticMethod
    2. Instance Method refrence :=  object::instanceMethod
    3.Reference to a constructor := ClassName::new

*/
