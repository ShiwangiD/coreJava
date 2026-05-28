import java.util.function.Predicate;

public class _08_PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isGreaterThan10 = x -> x > 10;

        // and()
        Predicate<Integer> combine = isEven.and(isGreaterThan10);
        System.out.println(combine.test(12));
        System.out.println(combine.test(8));

        // or
        Predicate<Integer> combine2 = isEven.or(isGreaterThan10);
        System.out.println(combine2.test(12));
        System.out.println(combine2.test(13));

        // negate()
        Predicate<Integer> notEven = isEven.negate();
        System.out.println(notEven.test(4));
        System.out.println(notEven.test(5));
    }

}

/*
 * Predivate Chaining := combining multiple Predicate conditions using logical
 * operations like:
 * and() ---> both condition s must be true.
 * or() ----> at least one condition must be true.
 * negate() ---> reverses the condition.
 */
