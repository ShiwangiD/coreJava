import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _04_CoreInterfaces {

    public static void main(String[] args) {

        // Function → takes input and returns output T---> method apply()
        Function<Integer, Integer> sequare = x -> x * x;
        System.out.println(sequare.apply(5));

        // Consumer → takes input but returns nothing ---> method accept()
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(7);

        // Supplier → returns a value without taking input ---> method get()
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // Predicate → tests a condition (returns true/false) ---> test()
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(8));

    }

}
