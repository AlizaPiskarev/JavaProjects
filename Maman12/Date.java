/**
 * This class represents a Date object (day/month/year).
 * @author Aliza Piskarev.
 * @version 16.4.2023
 */
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
    private final int VERY_SHORT_MONTH_DAYS = 28;
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

    //Private method to check if a date is correct.
    //If the received date is valid the method will return true.
    private boolean isCorrect(int day, int month, int year)
    {
        if(year<MIN_YEAR || year>MAX_YEAR){
            return false;
        }
        if(day<MIN_DAY){
            return false;
        }
        if(month>DEC || month<JAN){
            return false;
        }
        if(month==JAN || month==MAR || month==MAY || month==JUL || month==AUG || month==OCT || month==DEC){
            if(day>LONG_MONTH_DAYS){
                return false;
            }
        }
        else if(month==FEB){
            if(day>VERY_SHORT_MONTH_DAYS){
                return false;
            }
        }
        else if(month==APR || month==JUN || month==SEP || month==NOV){
            if(day>SHORT_MONTH_DAYS){
                return false;
            }
        }
        return true;
    }

    /**
     * If the given date is valid- creates a new Date object, otherwise creates the date 01/01/2000.
     * Uses the private method isValid to check the validity of the date. 
     * @param day The day of the Date.
     * @param month The month of the Date.
     * @param year The year of the Date.
     */
    public Date(int day, int month, int year)
    {
        if(isCorrect(day, month, year)){
            _day = day;
            _month = month;
            _year = year;
        }
        else{
            _day = DEFAULT_DAY;
            _month = DEFAULT_MONTH;
            _year = DEFAULT_YEAR;
        }
    }

    /**
     * Copy constructor for Date.
     * Constructs a date with the same instance variables as this Date.
     * @param other The Date object from which to construct the new Date.
     */
    public Date(Date other)
    {
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    /**
     * Return the day of the date.
     * @return the day of the date.
     */
    public int getDay()
    {
        return _day;
    }

    /**
     * Return the month of the date.
     * @return the month of the date
     */
    public int getMonth()
    {
        return _month;
    }

    /**
     * Return the year of the date.
     * @return the year of the date.
     */
    public int getYear()
    {
        return _year;
    }

    /**
     * Sets the day of the date.
     * If an illegal day received the day will not change.
     * @param new day The new day. 
     */
    public void setDay(int DayToSet)
    {
        if(isCorrect(DayToSet, _month, _year)){
            _day = DayToSet;
        }
    }

    /**
     * Sets the month of the date.
     * If an illegal month received the month will not change.
     * @param new month The new month.
     */
    public void setMonth(int monthToSet)
    {
        if(isCorrect(_day, monthToSet, _year)){
            _month = monthToSet;
        }
    }

    /**
     * Sets the year of the date.
     * If an illegal year recevied the year will not change.
     * @param new year The new year.
     */
    public void setYear(int yearToSet)
    {
        if(isCorrect(_day, _month, yearToSet)){
            _year = yearToSet;
        }
    }

    /**
     * Checks if the received date (Date other) is equal to this Date.
     * @param other The other date we compare to this date.
     * @return true if the received date is equal to this date.
     */
    public boolean equals(Date other)
    {
        return _day==other._day && _month==other._month && _year==other._year;
    }

    /**
     * Checks if this date is before the received date (date other).
     * @param other The other date to check if this date is before.
     * @return true If this date is before the received date (date other).
     */
    public boolean before(Date other)
    {
        return (_year<other._year) || 
        (_year==other._year && _month<other._month) || 
        (_year==other._year && _month==other._month && _day<other._day);
    }

    /**
     * Checks if this date is after the received date (date other).
     * @param other The other date to check if this date is after.
     * @return true If this date is after the received date (date other).
     */
    public boolean after(Date other)
    {
        return other.before(this);
    }

    //private method. Calculates the day number since the beginning of the Christian counting of years.
    private int calculateDate(int day, int month, int year)
    {
        if (month < 3) {
            year--;
            month = month + 12;
        }
        return 365 * year + year/4 - year/100 + year/400 + ((month+1) * 306)/10 + (day - 62);
    } 

    /**
     * Calculates the days between this date to the received date (Date other).
     * It does not matter if this date is before or after the received date (Date other).
     * @param other The date to check the difference to.
     * @return int difference in days.
     */
    public int difference(Date other)
    {
        int numOfDays1 = calculateDate(_day, _month, _year);
        int numOfDays2 = calculateDate(other._day, other._month, other._year);

        return Math.abs(numOfDays1 - numOfDays2);
    }

    /**
     * Return a string representation of this date ("dd/mm/yyyy").
     * @return String representation of this date ("dd/mm/yyyy").
     */
    public String toString()
    {
        String s;
        if(_day>=OCT){
            s = "";
        }
        else{
            s = "0";
        }
        s = s + _day + "/";
        if(_month<10){
            s = s + "0";
        }
        s = s + _month;
        return s + "/" + _year;
    }

    /**
     * Return the date of tomorrow.
     * @return date The date of tomorrow.
     */
    public Date tomorrow()
    {
        if(isCorrect(_day+1, _month, _year)){
            Date newDate = new Date(_day+1, _month, _year);
            return newDate;
        }

        if(isCorrect(MIN_DAY, _month+1, _year)){
            Date newDate =new Date(MIN_DAY, _month+1, _year);
            return newDate;
        }

        Date newDate = new Date(MIN_DAY, JAN, _year+1);
        return newDate;
    }
}