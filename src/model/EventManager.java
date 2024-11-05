package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages events in memory.
 */
public class EventManager {
    private List<Event> events = new ArrayList<>();
    private static EventManager instance;

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added: " + event.getTitle());
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEventByTitle(String title) {
        for (Event event : events) {
            if (event.getTitle().equalsIgnoreCase(title)) {
                return event;
            }
        }
        return null;
    }
}
