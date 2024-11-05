package model;

public class EventFactory {
    public static Event createEvent(EventType type, String title, String description) {
        switch (type) {
            case CONCERT:
                return new Concert(title, description);
            case CONFERENCE:
                return new Conference(title, description);
            default:
                throw new IllegalArgumentException("Unknown event type.");
        }
    }
}
