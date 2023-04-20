public class Date
{
    //instance variables
    private int _day;
    private int _month;
    private int _year;
    private final int DEFAULT_DAY = 1;
    private final int DEFAULT_MONTH = 1;
    private final int DEFAULT_YEAR = 2000;
    private final int MAX_YEAR = 9999;
    private final int MIN_YEAR = 1000;
    private final int MIN_DAY = 1;
    private final int LONG_MONTH_DAYS = 31;
    private final int SHORT_MONTH_DAYS = 30;
    private final int FEB_DAYS = 28;
    private final int JAN = 1;
    private final int FEB = 2;
    private final int MAR = 3;
    private final int APR = 4;
    private final int MAY = 5;
    private final int JUN = 6;
    private final int JUL = 7;
    private final int AUG = 8;
    private final int SEP = 9;
    private final int OCT = 10;
    private final int NOV = 11;
    private final int DEC = 12;

    /**
     * Creates a new Date object if the date is valid, otherwise creates the date 1/1/2000.
     * @param day The day in the month (1-31).
     * @param month The month in the month (1-12).
     * @param year The year (4 digits).
     */
    public Date(int day, int month, int year)
    {
        if(this.isValid(day, month, year) == true) {
            _day = day;
            _month = month;
            _year = year;
        }
        else {
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }

    /**
     * Copy constructor.
     * @param other The date to be copied.
     */
    public Date(Date other)
    {
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    /**
     * Gets the year.
     * @return the year.
     */
    public int getYear()
    {
        return _year;
    }

    /**
     * Gets the month.
     * @return the month.
     */
    public int getMonth()
    {
        return _month;
    }

    /**
     * Gets the day.
     * @return the day.
     */
    public int getDay()
    {
        return _day;
    }

    /**
     * Sets the year (only if the date remains valid)
     * @param yearToSet The year value to be set.
     */
    public void setYear(int year)
    {
        if(isValid(_day, _month, year))
        {
            _year = year;
        }
    }

    /**
     * Sets the year (only if the date remainds valid).
     * @param month to set The monthe value to be set.
     */
    public void setMonth(int month)
    {
        if(isValid(_day, month, _year))
        {
            _month = month;
        }
    }

    /**
     * Sets the day (only if the day remains valid)
     * @param day to set The day value to be set.
     */
    public void setDay(int day)
    {
        if(isValid(day, _month, _year)){
            _day = day;
        }
    }

    /**
     * Checks if two dates are the same.
     * @param other The date to compare this date to
     * @return true If the dates are the same.
     */
    public boolean equals(Date other)
    {
        return _day==other._day && _month==other._month && _year==other._year;
    }

    /**
     * Checks if the date is before other date.
     * @param other The date to compare this date to.
     * @return true if this date is before the other date.
     */
    public boolean before(Date other)
    {
        if(_year<other._year){
            return true;
        }
        if(_year>other._year){
            return false;
        }
        if(_month<other._month){
            return true;
        }
        if(_month>other._month){
            return false;
        }
        return _day<other._day;

        //return _year<other._year || (_year==other._year && _month<other._month) || (_year==other._year && _month=other._month && _day<other._day);
    }

    /**
     * Checks if this date is after other date.
     * @param other The date to compare this date to.
     * @return true if this date is after the other date.
     */
    public boolean after(Date other)
    {
        return other.before(this);
    }

    /**
     * Returns a String that represents this date. 
     * @return String that represents this date in the following format: day/month/year for example: 02/10/1993.
     */
    public String toString()
    {
        String s = "";
        if(_day<10){
            s = "0";
        }
        s = s + _day + "/";
        if(_month<10){
            s = s + "0";
        }
        s = s + _month + "/" + _year;
        return s;
    }

    /**
     * Calculates the date of tomorrow.
     * @return the date of tomorrow.
     */
    public Date tomorrow()
    {
        if(isValid(_day+1, _month, _year)){
            return new Date(_day+1, _month, _year);
        }
        if(isValid(1, _month+1, _year)){
            return new Date(1, _month+1, _year);
        }
        return new Date(1, 1, _year+1);
    }

    //**************** Private Methods ****************
    private boolean isValid(int d, int m, int y)
    {
        if(y<MIN_YEAR || y>MAX_YEAR)
            return false;
        if(d<MIN_DAY)
            return false;
        switch(m){
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC: if(d>LONG_MONTH_DAYS)
                    return false;
                break;
            case FEB: if(d>FEB_DAYS)
                    return false;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV: if(d>SHORT_MONTH_DAYS)
                    return false;
                break;
            default: return false;
        }
        return true;
    }
}
