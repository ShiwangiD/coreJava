
// Exception : An exception is an event that occurs during program execution that disrupts the normal flow of the program.
public class _01_Exception {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        System.out.println("step 1");

        System.out.println(a/b); // exception

        System.out.println("step 2");

    }

}

/*
 * Exceptions are used to handle errors such as:
 * 
 * dividing by zero
 * accessing an invalid array index
 * file not found
 * invalid user input
 * 
 * Why We Use Exception Handling
   If an error occurs, the program can continue running instead of stopping immediately.
 * 
 */
