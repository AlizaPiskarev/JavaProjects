public class ParkingTicket
{
    private String _id;
    private Time _entry;
    private Time _exit;
    private int _serialNum;
    private static final int TIME_UNIT = 15;
    private static final int PRICE_PER_TIME_UNIT = 5;
    private static int _counter = 0; //counting the parking tickets.

    //static value- this value will not change so it makes since to keep it just once in the memory.

    public ParkingTicket(String id, Time entry)
    {
        _id = id;
        _entry = new Time(entry);//new object to avoid Alias
        _exit = null;
        _counter++;
        _serialNum = _counter;
    }

    public ParkingTicket(String id, int h, int m)
    {
        _id = id;
        _entry = new Time(h,m);
        _exit = null;
        _counter++;
        _serialNum = _counter;
    }

    public ParkingTicket(ParkingTicket other)
    {
        _id = other._id;
        _entry = new Time(other._entry);
        if(other._exit == null){
            _exit = null;
        }
        else{
            _exit = new Time(other._exit);
        }
        _serialNum = other._serialNum;
    }

    public int getSerialNum()
    {
        return _serialNum;
    }

    public String getId()
    {
        return _id;
    }

    public Time getEntry()
    {
        return new Time(_entry);
    }

    public Time getExit()
    {
        if(_exit == null){
            return null;
        }
        else{
            return new Time(_exit);
        }
    }

    public void setId(String id)
    {
        _id = id;
    }

    public void setEntry(Time entry)
    {
        _entry = new Time(entry);
    }

    public void setExit(Time exit)
    {
        _exit = new Time(exit);
    }

    public int duration()
    {
        if(_exit == null){
            return 0;
        }
        return _exit.difference(_entry);
    }

    public int price()
    {
        int time = duration();
        int units = time%TIME_UNIT == 0 ? time/TIME_UNIT : time/TIME_UNIT + 1;
        return units*PRICE_PER_TIME_UNIT;
    }

    public String toString()
    {
        return "Car Id " + _id + "\nEntry Time: " + _entry.toString() + "\nExit Time: " + _exit;
    }

    //this method does not depend on any object. This method is relating to the class and therefor it will be "static".
    public static int howManyCars()
    {
        return _counter;
    }

    //all the variables in a static method must be static also. If a static method is using another method- the method must be static as well.
    public static int pricePerHour()
    {
        return 60/TIME_UNIT*PRICE_PER_TIME_UNIT;
    }

    //how do we call a static method? 1.nameOfVariable.nameOfMethod(). 2. nameOfClass.nameOfMethod() (like we do with the class Math).
}