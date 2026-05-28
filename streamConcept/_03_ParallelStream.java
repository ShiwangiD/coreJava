import java.util.ArrayList;
import java.util.List;

public class _03_ParallelStream {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
       
        // Sequencial stream
        // list.stream()
        // .map(x -> x*2) // stateless opertion
        // .sorted() // statefull operation
        // .forEach(System.out:: println);


        // parallel Stream :- use to multithreading

        list.parallelStream()
        .map(x -> x*2)
        .forEach(System.out::println);
    }
    
}
