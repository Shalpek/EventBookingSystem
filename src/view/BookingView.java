package view;

import model.Booking;

/**
 * View for displaying booking information.
 */
public class BookingView {
    public void displayBooking(Booking booking) {
        System.out.println("Booking confirmed for event: " + booking.getEvent().getTitle() +
                " by user: " + booking.getUser().getName());
    }
}
