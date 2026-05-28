public class _02_AtomicRcCod {
    public static void main(String[] args) {
        SeatBooking sb = new SeatBooking();
        Thread t1 = new Thread(() -> sb.bookSeat("Adity"));
        Thread t2 = new Thread(() -> sb.bookSeat("Rohit"));

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
    String seat = new String("EMPTY");

    boolean bookSeat(String name) {
        if (seat.equals("EMPTY")) {
            seat = new String(name);
            return true;
        }
        return false;
    }
}
