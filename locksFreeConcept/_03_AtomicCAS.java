import java.util.concurrent.atomic.AtomicReference;

public class _03_AtomicCAS {
    public static void main(String[] args) {
        SeatBooking sb = new SeatBooking();
        Thread t1 = new Thread(() -> {
            boolean value = sb.bookSeat("Adity");
            System.out.println("T1 say : " + value);
        });
        Thread t2 = new Thread(() -> {
            boolean value = sb.bookSeat("Rohit");
            System.out.println("T2 say : " + value);
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(sb.seat);
    }

}

class SeatBooking {

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if (currentValue.equals("EMPTY") == false) {
            return false;
        }
        return seat.compareAndSet("EMPTY", name);
    }

}
