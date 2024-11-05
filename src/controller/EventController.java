package controller;

import model.Event;
import model.EventManager;
import view.EventView;

/**
 * Controller for handling event-related logic.
 */
public class EventController {
    private EventManager eventManager;
    private EventView eventView;

    public EventController(EventManager eventManager, EventView eventView) {
        this.eventManager = eventManager;
        this.eventView = eventView;
    }

    public void addEvent(Event event) {
        eventManager.addEvent(event);
        eventView.displayEvent(event);
    }

    public void showAllEvents() {
        eventView.displayEvents(eventManager.getEvents());
    }
}
