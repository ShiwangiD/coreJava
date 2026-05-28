import java.util.function.Function;

public class _07_FunctionalComposition {
    public static void main(String[] args) {
        Function<Integer,Integer> add2 = x -> x+2;
        Function<Integer,Integer> mult3 = x -> x*2;
        Function<Integer, Integer> result = add2.andThen(mult3);
        Function<Integer,Integer> result2 = add2.compose(mult3);

        System.out.println(result.apply(5));
        System.out.println(result2.apply(5));



    }

}

/*
 * Functional Composition := a function break piece of piece
 * 1. andThen()
 * First function runs → then second function.
 * 2. compose()
 * Second function runs → then first function.
 */
