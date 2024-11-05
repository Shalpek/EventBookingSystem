package model;

/**
 * Represents a user in the system.
 */
public class User implements BookingObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }

    public String getName() {
        return name;
    }
}
