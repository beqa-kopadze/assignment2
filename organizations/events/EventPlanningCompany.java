package organizations.events;

import commons.Contactable;
import commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class EventPlanningCompany extends Organization implements Contactable {
    private String email;
    private String phoneNumber;
    private String address;
    private List<Event> events = new ArrayList<>();

    /**
     * Constructor to initialize the name and description of the event planning company.
     *
     * @param name        The name of the event planning company.
     * @param description The description of the event planning company.
     */
    public EventPlanningCompany(String name, String description) {
        super.setName(name);
        super.setDescription(description);
    }

    /**
     * Adds an event to the list of events managed by the event planning company.
     *
     * @param event The event to be added.
     */
    public void addEvent(Event event) {
        events.add(event);
    }

    /**
     * Removes an event from the list of events managed by the event planning company.
     *
     * @param event The event to be removed.
     * @return true if the event was removed, false otherwise.
     */
    public boolean removeEvent(Event event) {
        return events.remove(event);
    }

    /**
     * Returns the list of events managed by the event planning company.
     *
     * @return The list of events.
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Returns the email address of the event planning company.
     *
     * @return The email address.
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the event planning company.
     *
     * @param email The email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the phone number of the event planning company.
     *
     * @return The phone number.
     */
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the event planning company.
     *
     * @param phoneNumber The phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the physical address of the event planning company.
     *
     * @return The physical address.
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets the physical address of the event planning company.
     *
     * @param address The physical address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}