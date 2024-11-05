package model;

public class Conference extends Event {
    public Conference(String title, String description) {
        super(title, description);
    }

    @Override
    public void displayInfo() {
        System.out.println("Conference: " + title + " - " + description);
    }
}
