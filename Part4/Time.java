/**
 * Represents time- hours:minutes.
 * @author Aliza
 */
public class Time
{
    private int _minFromMidnight;
    private final int MIN_HOUR = 0;
    private final int MAX_HOUR = 23;
    private final int MIN_MINUTE = 0;
    private final int MAX_MINUTE = 59;
    private final int DEFAULT = 0;
    private final int MINS_PER_HOUR = 60;
    private final int MINS_PER_DAY = 1440;

    /**
     * Constructs a Time object.
     * Construct a new time instance with the specified hout and minute.
     * the hour should be between 0-23,otherwise it will be set to 0.
     * the minute should be between 0-59, otherwise it will be set to 0.
     * @param h the hour of the time.
     * @param m the minute of the time.
     */
    public Time(int h, int m)
    {
        if(h >= MIN_HOUR && h <= MAX_HOUR){
            _minFromMidnight = h*MINS_PER_HOUR;
        }
        else{
            _minFromMidnight = DEFAULT;
        }
        if(m >= MIN_MINUTE && m <= MAX_MINUTE){
            _minFromMidnight += m;
        }
    }

    public Time()
    {
        this(0,0);
        //using the previous constructor. "this" must be the first order+ cannot use DEFAULT because we did not create the "place" in the memory yet.
    }

    /**
     * Copy constructor for Time.
     * construct a time with the same instance variables as another time.
     * @param other The time object from which to construct the new time.
     */
    public Time(Time other)
    {
        _minFromMidnight = other._minFromMidnight;
    }

    /**
     * Return the hour of the time.
     * @return the hour of the time.
     */
    public int getHour()
    {
        return _minFromMidnight/MINS_PER_HOUR;
    }

    /**
     * Return the minutes of the time.
     * @return the minutes of the time.
     */ ;
    public int getMinutes()
    {
        return _minFromMidnight%MINS_PER_HOUR;
    }

    /**
     * Changes the hour of the time.
     * If an illegal number received the hour will not change.
     * @param num The new hour.
     */
    public void setHour(int h)
    { 
        if(h >= MIN_HOUR && h <= MAX_HOUR){
            _minFromMidnight = h*MINS_PER_HOUR+_minFromMidnight%MINS_PER_HOUR;
        }
    }

    /**
     * Changes the minutes of the time.
     * If an illegal number received the minutes will not change.
     * @param num The new minutes.
     */
    public void setMinutes(int m)
    {
        if(m >= MIN_MINUTE && m <= MAX_MINUTE){
            _minFromMidnight = (_minFromMidnight/MINS_PER_HOUR)*MINS_PER_HOUR+m;
        }
    }

    /**
     * Checks if the received time is equal to this time.
     * @param other The time to be compared with this time.
     * @return true if the received time is equal to this time.
     */
    public boolean equals(Time other)
    {
        return _minFromMidnight == other._minFromMidnight;
    }

    /**
     * Return the amount of minutes passed from midnight.
     * @return amount of minutes since midnight
     */
    public int minFromMidnight()
    {
        return _minFromMidnight;
    }

    /**
     * Calculates the difference in minutes between two times. Assumption: this time is after other time.
     * @param other The time to check the diference to
     * @return int difference in minutes.
     */
    public int difference(Time other)
    {
        return _minFromMidnight - other._minFromMidnight;
    }

    /**
     * Checks if this time is before a recieved time.
     * @param other The time to check if this time is before.
     * @return true if this time is before other time.
     */
    public boolean before(Time other)
    {
        return _minFromMidnight < other._minFromMidnight;
    }

    /**
     * Checks if this time is after a recieved time.
     * @param other The time to check if this time is after.
     * @return true if this time is after other time.
     */
    public boolean after(Time other)
    {
        return other.before(this);
    }

    /**
     * Return a string representation of this time ("hh:mm").
     * @return String representation of this time ("hh:mm").
     */
    public String toString()
    {
        String s;
        int h = getHour();
        int m = getMinutes();

        if(h >= 10){
            s = ""; 
        }
        else{
            s = "0";
        }
        s = s + h + ":";
        if(m < 10){
            s = s + "0";
        }
        s = s + m;
        return s;
    }
}