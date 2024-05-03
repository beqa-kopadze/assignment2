package organizations.events;

import java.time.LocalDate;

public class Event {
    private String name;
    private String description;
    private LocalDate date;
    private String location;

    /**
     * Constructor to initialize the fields of the Event class.
     *
     * @param name        The name of the event.
     * @param description A description of the event.
     * @param date        The date of the event.
     * @param location    The location of the event.
     */
    public Event(String name, String description, LocalDate date, String location) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
    }

    /**
     * Returns the name of the event.
     *
     * @return The name of the event.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the event.
     *
     * @param name The name of the event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description of the event.
     *
     * @return The description of the event.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the event.
     *
     * @param description The description of the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the date of the event.
     *
     * @return The date of the event.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the date of the event.
     *
     * @param date The date of the event.
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Returns the location of the event.
     *
     * @return The location of the event.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the event.
     *
     * @param location The location of the event.
     */
    public void setLocation(String location) {
        this.location = location;
    }
}