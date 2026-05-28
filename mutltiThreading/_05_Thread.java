public class _05_Thread {
    public static void main(String[] args) {

        // 1 to 100 (even number)
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("T1 Even Number is : " + i);
                }
            }
        });

        // 1 to 100 (odd number)
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println("T2 Odd Number is : " + i);
                }
            }
        });
        t1.start();
        t2.start();

    }

}

// Execution Order --> Non determinism
