package controller;

import model.BookingFacade;
import model.Event;
import model.User;

/**
 * Controller for handling booking-related logic.
 */
public class BookingController {
    private BookingFacade bookingFacade;

    public BookingController(BookingFacade bookingFacade) {
        this.bookingFacade = bookingFacade;
    }

    public void createBooking(Event event, User user) {
        bookingFacade.bookEvent(event, user);
    }
}
