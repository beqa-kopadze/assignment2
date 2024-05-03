package organizations.party;

import commons.Contactable;
import commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
    private String mission;
    private String email;
    private String address;
    private String phoneNumber;
    private List<Election> elections = new ArrayList<>();

    /**
     * Constructor to initialize the name and mission of the party.
     *
     * @param name    The name of the party.
     * @param mission The mission statement of the party.
     */
    public Party(String name, String mission) {
        // Initialize the name of the party
        super.setName(name);
        this.mission = mission;
    }

    /**
     * Adds an election to the list of elections held by the party.
     *
     * @param e The election to be added.
     */
    public void addElection(Election e) {
        elections.add(e);
    }

    /**
     * Removes an election from the list of elections held by the party.
     *
     * @param e The election to be removed.
     * @return true if the election was removed, false otherwise.
     */
    public boolean removeElection(Election e) {
        return elections.remove(e);
    }

    /**
     * Returns a list of fair elections held by the party.
     *
     * @return A list of fair elections.
     */
    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        for (Election election : elections) {
            if (election.isFair()) {
                fairElections.add(election);
            }
        }
        return fairElections;
    }

    /**
     * Returns the mission statement of the party.
     *
     * @return The mission statement.
     */
    public String getMission() {
        return mission;
    }

    /**
     * Sets the mission statement of the party.
     *
     * @param mission The mission statement.
     */
    public void setMission(String mission) {
        this.mission = mission;
    }

    /**
     * Returns the email address of the party.
     *
     * @return The email address.
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the party.
     *
     * @param email The email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the physical address of the party.
     *
     * @return The physical address.
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets the physical address of the party.
     *
     * @param address The physical address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the party.
     *
     * @return The phone number.
     */
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the party.
     *
     * @param phoneNumber The phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
