package model;

public abstract class Event {
    protected String title;
    protected String description;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title + ": " + description;
    }
}
