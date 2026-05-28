import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class _03_StreamTermination {
        public static void main(String[] args) {
                // Terminal Operation

                List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));
                list.stream()
                                .map(x -> x + 1)
                                .forEach(System.out::println);

                list.stream()
                                .map(x -> x + 1)
                                .forEachOrdered(System.out::println);

                // List<Integer> list2 = new ArrayList<>(List.of(12, 13, 11, 91));
                // List<Integer> list3 = list2.stream()
                //                 .map(x -> x + 1)
                //                 .toList();

                List<Integer> list2 = new ArrayList<>(List.of(12, 13, 11, 91));
                Set<Integer> list3 = list2.stream()
                               .map(x -> x + 1)
                               .collect(Collectors.toSet());
                               System.out.println(list2);
                                                
        }

}

// forEach(), forEachOrder()
// toList()
// collect() ---> Collector
//reduce() ---------> combine stream element into single value
//count()
//findFirst() ----> sort circuiting 
//findAny()
//anyMath(),allMatch() , noneMatch()
// sum(),average(),max(),min() -----> primitive stream