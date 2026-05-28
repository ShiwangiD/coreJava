public class _04_ObjClassLock {
    public static void main(String[] args) {

        Test3 test = new Test3();
        Thread t1 = new Thread(() -> Test3.m1());
        Thread t2 = new Thread(() -> test.m2());

        t1.start();
        t2.start();

    }

}

class Test3 {
    static void m1() {
        synchronized (Test3.class) {
            System.out.println("m1 entered");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            ;

            System.out.println("m1 exiting");
        }

    }

    void m2() {
        synchronized (this) {
            System.out.println("m2 entered");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            ;
            System.out.println("m2 exiting");
        }

    }
}
