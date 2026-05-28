import java.util.ArrayList;
import java.util.List;
public class WildCard {
    public static void main(String[] args){
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);

    }

    static void fun(List<?>values){
        for(Object obj : values){
            System.out.println(obj.getClass().getName());
        }
    }
    
}


