import java.util.Optional;

public class _01_OptionalClass {
    public static void main(String[] args) {

        // Optional.of() := Used when value is definitely NOT null.
        Optional<String> opt1 = Optional.of("hello");
        System.out.println(opt1);

        // Optional.ofNullable() := Used when value may be null.
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println(opt2);

        // Optional.empty() := Creates an empty Optional.
        Optional<String> opt3 = Optional.empty();
        System.out.println(opt3);

        // Accessing Values := check value is present or not
        if (opt1.isPresent()) {
            System.out.println(opt1.get());
        }
        opt1.ifPresent(value -> System.out.println(value));// java 8

        // Dangerous if empty:
        // Optional.empty().get();

        // isPresent() := check value is exit .
        Optional<String> name = Optional.of("Java");

        // if (name.isPresent()) {
        // System.out.println("Value exists");
        // }

        if (name.isEmpty()) {
            System.out.println("No value");
        }

        // orElse() := Returns default if empty.

        Optional<String> name1 = Optional.empty();

        // String result = name1.orElse("Default Value");

        // System.out.println(result);

        //orElseGet() := Uses lambda expression for default value.

        String result = name.orElseGet(() -> "Generated Value");

        //orElseThrow() := Throws exception if empty.

           String result1 = name.orElseThrow(
    () -> new RuntimeException("Value missing")
);



    }

}

