package model;

public class Concert extends Event {
    public Concert(String title, String description) {
        super(title, description);
    }

    @Override
    public void displayInfo() {
        System.out.println("Concert: " + title + " - " + description);
    }
}
