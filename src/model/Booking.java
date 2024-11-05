package model;

public class Booking {
    private Event event;
    private User user;

    public Booking(Event event, User user) {
        this.event = event;
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public User getUser() {
        return user;
    }
}
