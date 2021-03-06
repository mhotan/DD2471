package se.kth.csc.moderndb.cbexplorer.parser.data;

import se.kth.csc.moderndb.cbexplorer.exception.RepresentationException;

import java.util.Date;

/**
 * Created by mhotan on 4/13/14.
 */
public class TripData {

    // Internal Bike data
    private BikeData bikeData;

    // Internal Station data.
    private StationData startStationData, endStationData;

    private final Date startTime, endTime;

    private final String userType;

    private final Short userBirthYear, userGender;

    private final int duration;

    /**
     * Creates a wrapper for Trip data.
     *
     * @param bikeData The data about the bike for this trip
     * @param startStationData Start Station Data
     * @param endStationData End Station Data
     * @param duration
     * @param startTime
     * @param endTime
     * @param userType
     * @param userBirthYear
     * @param userGender
     */
    public TripData(BikeData bikeData,
                    StationData startStationData,
                    StationData endStationData,
                    int duration,
                    Date startTime,
                    Date endTime,
                    String userType,
                    Short userBirthYear,
                    Short userGender) {
        this.bikeData = bikeData;
        this.startStationData = startStationData;
        this.endStationData = endStationData;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userType = userType;
        this.userBirthYear = userBirthYear;
        this.userGender = userGender;

        checkRep();
    }

    /**
     * @return The duration of the trip.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return The Bike data for this trip
     */
    public BikeData getBikeData() {
        return bikeData;
    }

    /**
     * @return The start station data
     */
    public StationData getStartStationData() {
        return startStationData;
    }

    /**
     * @return The end station data
     */
    public StationData getEndStationData() {
        return endStationData;
    }

    /**
     * @return The time the trip started
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @return The time the trip ended
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @return Type of user.
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @return The Birth year of the user if it exists
     */
    public Short getUserBirthYear() {
        return userBirthYear;
    }

    /**
     * @return Gender identifier of the user if it available.
     */
    public Short getUserGender() {
        return userGender;
    }

    /**
     * @return String representation of user gender ("M", "F", or "").
     */
    public String getUserGenderAsString() {
        return userGender == 1 ? "M" : userGender == 2 ? "F" : "";
    }


    private void checkRep() {
        if (bikeData == null) {
            throw new RepresentationException("Bike Data cannot be nul");
        }
        if (startStationData == null) {
            throw new RepresentationException("Start station data cannot be nul");
        }
        if (endStationData == null) {
            throw new RepresentationException("End Station data cannot be nul");
        }
        if (startTime == null) {
            throw new RepresentationException("Start time cannot be nul");
        }
        if (endTime == null) {
            throw new RepresentationException("End time cannot be nul");
        }
        if (userType == null) {
            throw new RepresentationException("End time cannot be nul");
        }
    }

    @Override
    public String toString() {
        return "TripData{" +
                "bikeData=" + bikeData +
                ", startStationData=" + startStationData +
                ", endStationData=" + endStationData +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", userType='" + userType + '\'' +
                ", userBirthYear=" + userBirthYear +
                ", userGender=" + userGender +
                '}';
    }
}
