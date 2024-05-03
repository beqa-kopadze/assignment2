package organizations.party;

public class Election {
    private int votersNumber;
    private boolean fair;
    private String description;

    /**
     * Constructor to initialize the fields of the Election class.
     *
     * @param votersNumber The number of voters participating in the election.
     * @param fair         A boolean value indicating whether the election was fair or not.
     * @param description  A description of the election.
     */
    public Election(int votersNumber, boolean fair, String description) {
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    /**
     * Returns the number of voters participating in the election.
     *
     * @return The number of voters.
     */
    public int getVotersNumber() {
        return votersNumber;
    }

    /**
     * Sets the number of voters participating in the election.
     *
     * @param votersNumber The number of voters.
     */
    public void setVotersNumber(int votersNumber) {
        this.votersNumber = votersNumber;
    }

    /**
     * Returns a boolean value indicating whether the election was fair or not.
     *
     * @return true if the election was fair, false otherwise.
     */
    public boolean isFair() {
        return fair;
    }

    /**
     * Sets whether the election was fair or not.
     *
     * @param fair A boolean value indicating whether the election was fair or not.
     */
    public void setFair(boolean fair) {
        this.fair = fair;
    }

    /**
     * Returns the description of the election.
     *
     * @return The description of the election.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the election.
     *
     * @param description The description of the election.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
