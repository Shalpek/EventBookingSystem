package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages bookings in memory.
 */
public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();
    private static BookingManager instance;

    private BookingManager() {}

    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added for user: " + booking.getUser().getName());
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
