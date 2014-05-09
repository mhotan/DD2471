package se.kth.csc.moderndb.cbexplorer.core.domain;

/**
 * Trip POJO class for REST Service.
 *
 * Created by mhotan on 5/7/14.
 */
public class Trip {

    /**
     * Trip time
     */
    private long startTime, endTime;

    /**
     * User information
     */
    private String userType;
    private short userBirthYear, userGender;

    /**
     * Trip start and end
     */
    private Station startedFrom, endedAt;

    /**
     * Bike used for the Trip
     */
    private Bike bike;

    /**
     * Empty Constructor for POJO reasons
     */
    public Trip() {
    }

    /**
     *
     * Creates a POJO Trip entity     *
     *
     * @param startTime says when the trip starts
     * @param endTime says when the trip ends
     * @param userType type of user that makes the trip
     * @param userBirthYear birth date of user that makes the trip
     * @param userGender gender of user that makes the trip
     * @param startedFrom station where the trip starts from
     * @param endedAt station where the trip is ending
     * @param bike bike that is used for the trip
     */
    public Trip(long startTime, long endTime, String userType, short userBirthYear, short userGender,
                Station startedFrom, Station endedAt, Bike bike) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.userType = userType;
        this.userBirthYear = userBirthYear;
        this.userGender = userGender;
        this.startedFrom = startedFrom;
        this.endedAt = endedAt;
        this.bike = bike;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public String getUserType() {
        return userType;
    }

    public short getUserBirthYear() {
        return userBirthYear;
    }

    public short getUserGender() {
        return userGender;
    }

    public Station getStartedFrom() {
        return startedFrom;
    }

    public Station getEndedAt() {
        return endedAt;
    }

    public Bike getBike() {
        return bike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if (startTime != trip.startTime) return false;
        if (bike != null ? !bike.equals(trip.bike) : trip.bike != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (startTime ^ (startTime >>> 32));
        result = 31 * result + (bike != null ? bike.hashCode() : 0);
        return result;
    }
}