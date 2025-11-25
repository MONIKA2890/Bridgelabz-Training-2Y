import java.util.*;

class InvalidSeatException extends Exception { InvalidSeatException(String msg){ super(msg); } }
class SeatAlreadyBookedException extends Exception { SeatAlreadyBookedException(String msg){ super(msg); } }

public class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for(int i=1;i<=5;i++) seats.put(i, true);
    }

    public void bookSeat(int seatNo) throws Exception {
        if(!seats.containsKey(seatNo)) throw new InvalidSeatException("Seat does not exist!");
        if(!seats.get(seatNo)) throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(seatNo,false);
        System.out.println("Seat "+seatNo+" booked successfully!");
    }

    public static void main(String[] args) {
        MovieBooking mb = new MovieBooking();
        try {
            mb.bookSeat(3);
            mb.bookSeat(3);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

