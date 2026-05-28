import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_StreamIntermediate {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(15,41,11,13,34));

        // Intermediate functions
        //filter()

        list.stream()
        .filter(x -> x >10)
        .filter(x-> x%2 == 0)
        .forEach(System.out::println);

        //map()
        list.stream()
        .filter(x -> x > 10)
        .map( x -> x*3)
        .forEach(System.out::println);

        //flatMap()
        List<List<Integer>> list2 = List.of(
        List.of(1,2),
        List.of(3,4)
        );

        list2.stream()
        .flatMap(x -> x.stream().map(y -> y*2))
        .forEach(System.out::println);

        // sorted() :- statefull function
        list.stream()
        .filter(x-> x>10)
        .map(x -> x*2)
        .sorted()
        .forEach(System.out::println);

        // distinct() :- unique value , statefull
        list.stream()
        .filter(x-> x>10)
        .map(x -> x*2)
        .sorted((a,b)->b-a)
        .distinct()
        .forEach(System.out::println);

        // limit()
        Stream.iterate(1,x->x+1)
        .limit(10)
        .forEach(System.out::println);

        //skip()
        Stream.iterate(1,x->x+1)
        .limit(10)
        .skip(5)
        .forEach(System.out::println);

        //peak()
        list.stream()
        .filter(x-> x>10)
        .map(x -> x*2)
        .peek(System.out::println)
        .sorted()
        .distinct()
        .forEach(System.out::println);
        

    }
    
}
