import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _04_Collectors {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(List.of(10,20,47,89));
        // Set<Integer> list2 = list.stream()
        // .map(x-> x+1)
        // .collect(Collectors.toSet());
        // System.out.println(list);

        // List<String> list = new ArrayList<>(List.of("AA","BBBBB","CCC"));
        // Map<Integer,String> mp= list.stream()
        // .collect(Collectors.toMap(
        // x -> x.length(),
        // x -> x ));
        // System.out.println(mp);

        // List<String> list = new ArrayList<>(List.of("AA","BBBB","CCC","DD","EEEEE"));
        // Map<Integer, List <String>> mp2 = list.stream()
        // .collect(Collectors.groupingBy( x -> x.length()));
        // System.out.println(mp2);

        // List<Integer> list = new ArrayList<>();

        // Map<Boolean, List<Integer>> mp3 = list.stream()
        // .collect(Collectors.partitioningBy(x-> x % 2 == 0));

        // System.out.println(mp3);

        List<String> list = new ArrayList<>(
                List.of("AA", "BBBB", "CCC", "DD", "EEEEE"));

        Map<Boolean, List<String>> mp3 = list.stream()
                .collect(Collectors.partitioningBy(
                        x -> x.length() > 3
                ));
                System.out.println(mp3);

                String result = list.stream()
                  .collect(Collectors.joining("_"));
                  System.out.println(result);

    }

}

// toList(), toSet(), toMap()
// groupingBy()
// partioningBy()
// joining()
