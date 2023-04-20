public class Event
{
    private String _title;
    private Date _date;
    private Time _time;

    public Event(String title, Date d, Time t)
    {
        _title = title;
        _date = new Date(d);
        _time = new Time(t);
    }

    public Event(Event e)
    {
        _title = e._title;
        _date = new Date(e._date);
        _time = new Time(e._time);
    }

    public String getTitle()
    {
        return _title;
    }

    public Time getTime()
    {
        return new Time(_time);
    }

    public Date getDate()
    {
        return new Date(_date);
    }

    public int getYear()
    {
        return _date.getYear();
    }

    public int getMonth()
    {
        return _date.getMonth();
    }

    public int getDay()
    {
        return _date.getDay();
    }

    /**
     * Checks if this event is before received event.
     * First we will check if this event date is before reveived event date. If the events are on the same dates we will check if this events time is before the received events time.
     * @param e The event to compare to.
     * return true If this event is before the received event.
     */
    public boolean before(Event e)
    {
        return _date.before(e._date) || _date.equals(e._date) && _time.before(e._time);
    }

    public boolean after(Event e)
    {
        return e.before(this);
    }

    public boolean sameDate(Event e)
    {
        return _date.equals(e._date);
    }

    public boolean sameDateAndTime(Event e)
    {
        return _date.equals(e._date) && _time.equals(e._time);
    }

    public boolean equals(Event e)
    {
        return _title.equals(e._title) &&
        _date.equals(e._date) &&
        _time.equals(e._time);
    }

    public String toString()
    {
        return _title + "\t" + _date + "\t" + _time; 
        //_date = _date.toString() and _time = _time.toString().
    }
}
