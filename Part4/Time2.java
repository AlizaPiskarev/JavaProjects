/**
 * Represents time- hours:minutes.
 * @author Aliza
 */
public class Time2
{
    private int _hours;
    private int _minutes;
    private final int MIN_HOUR = 0;
    private final int MAX_HOUR = 23;
    private final int MIN_MINUTE = 0;
    private final int MAX_MINUTE = 59;
    private final int DEFAULT = 0;
    private final int MINS_PER_HOUR = 60;
    private final int MINS_PER_DAY = 1440;

    /**
     * Constructs a Time2 object.
     * Construct a new time instance with the specified hout and minute.
     * the hour should be between 0-23,otherwise it will be set to 0.
     * the minute should be between 0-59, otherwise it will be set to 0.
     * @param h the hour of the time.
     * @param m the minute of the time.
     */
    public Time2(int h, int m)
    {
        if(h >= MIN_HOUR && h <= MAX_HOUR){
            _hours = h;
        }
        else{
            _hours = DEFAULT;
        }
        if(m >= MIN_MINUTE && m <= MAX_MINUTE){
            _minutes = m;
        }
        else{
            _minutes = DEFAULT;
        }
    }

    public Time2()
    {
        this(0,0);
        //using the previous constructor. "this" must be the first order+ cannot use DEFAULT because we did not create the "place" in the memory yet.
    }

    /**
     * Copy constructor for Time2.
     * construct a time with the same instance variables as another time.
     * @param other The time object from which to construct the new time.
     */
    public Time2(Time2 other)
    {
        _hours = other._hours;
        _minutes = other._minutes;
    }

    /**
     * Return the hour of the time.
     * @return the hour of the time.
     */
    public int getHour()
    {
        return _hours;
    }

    /**
     * Return the minutes of the time.
     * @return the minutes of the time.
     */ 
    public int getMinutes()
    {
        return _minutes;
    }

    /**
     * Changes the hour of the time.
     * If an illegal number received the hour will not change.
     * @param num The new hour.
     */
    public void setHour(int h)
    {
        if(h >= MIN_HOUR && h <= MAX_HOUR){
            _hours = h;
        }
    }

    /**
     * Changes the minutes of the time.
     * If an illegal number received the minutes will not change.
     * @param num The new minutes.
     */
    public void setMinutes(int m)
    {
        if(m >= MIN_HOUR && m <= MAX_HOUR){
            _minutes = m;
        }
    }

    /**
     * Checks if the received time is equal to this time.
     * @param other The time to be compared with this time.
     * @return true if the received time is equal to this time.
     */
    public boolean equals(Time2 other)
    {
        if(_hours == other._hours && _minutes == other._minutes){
            return true;
        }
        else{
            return false;
        }
        //you can also just write:" return _hours == other._hours && _minutes == other._minutes"
    }

    /**
     * Return the amount of minutes passed from midnight.
     * @return amount of minutes since midnight
     */
    public int minFromMidnight()
    {
        return _hours * MINS_PER_HOUR + _minutes;
    }

    /**
     * Calculates the difference in minutes between two times. Assumption: this time is after other time.
     * @param other The time to check the diference to
     * @return int difference in minutes.
     */
    public int difference(Time2 other)
    {
        return minFromMidnight() - other.minFromMidnight();
    }

    /**
     * Checks if this time is before a recieved time.
     * @param other The time to check if this time is before.
     * @return true if this time is before other time.
     */
    public boolean before(Time2 other)
    {
        return minFromMidnight() < other.minFromMidnight();
    }

    /**
     * Checks if this time is after a recieved time.
     * @param other The time to check if this time is after.
     * @return true if this time is after other time.
     */
    public boolean after(Time2 other)
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
        if(_hours >= 10){
            s = ""; 
        }
        else{
            s = "0";
        }
        s = s + _hours + ":";
        if(_minutes < 10){
            s = s + "0";
        }
        s = s + _minutes;
        return s;
    }
}
