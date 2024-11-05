package view;

import model.Event;
import java.util.List;

/**
 * View for displaying event information.
 */
public class EventView {
    public void displayEvent(Event event) {
        System.out.println("Event created: " + event.getTitle() + " - " + event.getDescription());
    }

    public void displayEvents(List<Event> events) {
        System.out.println("All events:");
        for (Event event : events) {
            System.out.println(" - " + event.getTitle() + ": " + event.getDescription());
        }
    }
}
