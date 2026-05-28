import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class _05_PrimitiveFunInterface {
    public static void main(String[] args) {

        IntPredicate isEven = x -> x % 2 == 0; // IntPredicate
        System.out.println(isEven.test(10));

        IntConsumer print = x -> System.out.println(x); // IntConsumer
        print.accept(100);

        IntSupplier number = () -> 50; // IntSupplier
        System.out.println(number.getAsInt());

        IntUnaryOperator square = x -> x * x; // IntUnaryOperator
        System.out.println(square.applyAsInt(5));

    }

}

/*
 * Primitive Functional Interfaces :-directly use with primitive data types like
 * int, double, and long.
 * maily uses :-
 * Streams API
 * Lambda expressions
 */
