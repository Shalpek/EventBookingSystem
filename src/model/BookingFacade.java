package model;

import notification.NotificationAdapter;
import view.BookingView;

public class BookingFacade {
    private BookingManager bookingManager;
    private NotificationAdapter notificationAdapter;
    private BookingView bookingView;

    public BookingFacade(BookingManager bookingManager, NotificationAdapter notificationAdapter, BookingView bookingView) {
        this.bookingManager = bookingManager;
        this.notificationAdapter = notificationAdapter;
        this.bookingView = bookingView;
    }

    public void bookEvent(Event event, User user) {
        Booking booking = new Booking(event, user);
        bookingManager.addBooking(booking);
        bookingView.displayBooking(booking);
        notificationAdapter.notifyUser("Your booking for " + event.getTitle() + " is confirmed, " + user.getName() + ".");
    }
}
