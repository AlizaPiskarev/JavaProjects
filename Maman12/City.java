/**
 * Represents a city. City is represented by its name, the date it was established, city center, central station, number of residents(non negative) and number of neighborhoods(positive).
 * @author Aliza Piskarev.
 * @version 16.04.2023.
 */
public class City
{
    //instance variables
    private String _cityName;
    private Date _dateEstablished;
    private Point _cityCenter;
    private Point _centralStation;
    private long _numOfResidents;
    private int _numOfNeighborhoods;
    private static final long DEFAULT_NUM_OF_RESIDENTS = 0;
    private static final int DEFAULT_NUM_OF_NEIGHBORHOODS = 1;

    /**
     * Constructs a city object. 
     * Constructs a new city object with the specified city name, date of establishment, city center, central station, number of residents and the number of neighborhoods in the city.
     * The number of the residents should be grater than or equal to 0, otherwise it will be equal to 0 (default number of residents).
     * The number of the neighborhoods should be grater than 0, otherwise it will be equal to 1 (default number of neighborhoods).
     * @param cityName The name of the city.
     * @param dateEstablished The date of establishment.
     * @param cityCenterX The x coordinate of the citys center.
     * @param cityCenterY The y coordiante of the citys center.
     * @param centralStationX The x coordinate of the central station.
     * @param centralStationY The y coordinate of the central station.
     * @param numOfResidents The number of the residents in the city.
     * @param numOfNeighborhoods The number of neighborhoods in the city.
     */
    public City(String cityName, int establishmentDay, int establishmentMonth, int establishmentYear, int cityCenterX, int cityCenterY, int centralStationX, int centralStationY, long numOfResidents, int numOfNeighborhood)
    {
        _cityName = cityName;
        _dateEstablished = new Date(establishmentDay, establishmentMonth, establishmentYear);//new object to avoid Alias 
        _cityCenter = new Point(cityCenterX, cityCenterY);
        _centralStation = new Point(centralStationX, centralStationY);
        if(numOfResidents>=DEFAULT_NUM_OF_RESIDENTS){
            _numOfResidents = numOfResidents;
        }
        else{
            _numOfResidents = DEFAULT_NUM_OF_RESIDENTS;
        }
        if(numOfNeighborhood>=DEFAULT_NUM_OF_NEIGHBORHOODS){
            _numOfNeighborhoods = numOfNeighborhood;
        }
        else{
            _numOfNeighborhoods = DEFAULT_NUM_OF_NEIGHBORHOODS;
        }
    }

    /**
     * Copy constructor for City.
     * construct a city with the same instance variables as another city.
     * @param other The city object from which to construct the new city.
     */
    public City(City other)
    {
        _cityName = other._cityName;
        _dateEstablished = new Date(other._dateEstablished);
        _cityCenter = new Point(other._cityCenter);
        _centralStation = new Point(other._centralStation);
        _numOfResidents = other._numOfResidents;
        _numOfNeighborhoods = other._numOfNeighborhoods;
    }

    /**
     * Returns city name.
     * @return cityName The name of the city.
     */
    public String getCityName()
    {
        return _cityName;
    }

    /**
     * Returns the date of establishment of the city.
     * @return city established The date of establshment.
     */
    public Date getDateEstablished()
    {
        return new Date(_dateEstablished);
    }

    /**
     * Returns the city center point.
     * @return city center The city center point.
     */
    public Point getCityCenter()
    {
        return new Point(_cityCenter);
    }

    /**
     * Returns the central station point.
     * @return central station The central station point.
     */
    public Point getCentralStation()
    {
        return new Point(_centralStation);
    }

    /**
     * Returns the number of the residents in the city.
     * @return number of residents The number of the residents in the city.
     */
    public long getNumOfResidents()
    {
        return _numOfResidents;
    }

    /**
     * Returns the number of the neighborhoods in the city.
     * @return number of neighborhoods The number of the neighborhoods in the city.
     */
    public int getNumOfNeighborhoods()
    {
        return _numOfNeighborhoods;
    }

    /**
     * Changes the name of the city.
     * @param new name The new name of the city.
     */
    public void setCityName(String cityName)
    {
        _cityName = cityName;
    }

    /**
     * Changes the date of the city establishment.
     * @param new date establishment The new date of establishment.
     */
    public void setDateEstablished(Date dateEst)
    {
        _dateEstablished = new Date(dateEst);
    }

    /**
     * Changes the city center point.
     * @param new city center The new city center point.
     */
    public void setCityCenter(Point cityCenter)
    {
        _cityCenter = new Point(cityCenter);
    }

    /**
     * Changes the central station point.
     * @param new central station The new central station point.
     */
    public void setCentralStation(Point centralStation)
    {
        _centralStation = new Point(centralStation);
    }

    /**
     * Changes the number of residents in the city.
     * @param new number of resitents The new number of residents in the city.
     */
    public void setNumOfResidents(long numOfResidents)
    {
        if(numOfResidents>=DEFAULT_NUM_OF_RESIDENTS){
            _numOfResidents = numOfResidents;
        }
    }

    /**
     * Changes the number of neighborhoods in the city.
     * @param new number of neighborhoods The new number of neighborhoods in the city.
     */
    public void setNumOfNeighborhoods(int numOfNeighborhoods)
    {
        if(numOfNeighborhoods>=DEFAULT_NUM_OF_NEIGHBORHOODS){
            _numOfNeighborhoods = numOfNeighborhoods;
        }
    }

    /**
     * Return a string representation of this city variables (city name, date established, city center, central station, number of residentsand number of neighborhoods).
     * @return String representation of this city.
     */
    public String toString()
    {
        String cityName = "City name: " + _cityName;
        String dateEstablished = "\nDate established: " + _dateEstablished;
        String cityCenter = "\nCity center: " + _cityCenter;
        String centralStation = "\nCentral station: " + _centralStation;
        String numOfResidents = "\nNumber of residents: " + _numOfResidents;
        String numOfNeighborhoods = "\nNumber of neighborhoods: " + _numOfNeighborhoods;
        String s = cityName+dateEstablished+cityCenter+centralStation+numOfResidents+numOfNeighborhoods;
        return s;
    }

    /**
     * Checks if the received city (other city) is equal to this city.
     * param other city The city to be compared with this city.
     * @return true if the reaceived city (other city) is equal to this city.
     */
    public boolean equals(City other)
    {
        return _cityName.equals(other._cityName) && 
        _dateEstablished.equals(other._dateEstablished) &&
        _cityCenter.equals(other._cityCenter) &&
        _centralStation.equals(other._centralStation) &&
        _numOfResidents == other._numOfResidents &&
        _numOfNeighborhoods == other._numOfNeighborhoods;
    }

    /**
     * Receives number of new residents or number of leaving residents, sets the number of residents and returning ture if the number of residents is positive.
     * If the number of residents is negative after the uppdate- the number of residents will be equal 0 and it will return false. 
     * @param num The number of new residents or the number of the leaving residents (the number can be possitive or negative).
     * @return ture If the number of residents is possitive after the num of residents has changed.
     */
    public boolean addResidents(long residentsUpdate)
    {
        if(residentsUpdate+_numOfResidents>=DEFAULT_NUM_OF_RESIDENTS){
            _numOfResidents += residentsUpdate;
            return true;
        }
        else{
            _numOfResidents = DEFAULT_NUM_OF_RESIDENTS;
            return false;
        }
    }

    /**
     * Receives two int and moves the central station point to x+deltaX and y+deltaY.
     * If the final point is not on the first quadrant the central station point will not change. 
     * @param deltaX The movement of x in the centralStation point.
     * @param deltaY The movement of y in the centralStation point.
     */ 
    public void moveCentralStation(int deltaX, int deltaY)
    {
        _centralStation.move(deltaX, deltaY);
    }

    /**
     * Returns the distance between the city center and the central station.
     * @return distance The distance between the city center and the central station.
     */
    public double distanceBetweenCenterAndStation()
    {
        return _cityCenter.distance(_centralStation);
    }

    /**
     * The method receives a String and two integers and returns a new city. 
     * The String is the name of the new city, the day of establishment is a day after this city,
     * the city center is 
     * there is no residents in the city and just 1 neighborhood.
     * @return new city The new city.
     */ 
    public City newCity(String newCityName, int dX, int dY)
    {
        Date newDate = new Date(_dateEstablished.tomorrow());
        Point newCityCenter = new Point(_cityCenter);
        newCityCenter.move(dX, dY);

        Point newCentralStation = new Point(_centralStation);
        newCentralStation.move(dX, dY);

        City newCity = new City(newCityName, newDate.getDay(), newDate.getMonth(), newDate.getYear(), 
                newCityCenter.getX(), newCityCenter.getY(),
                newCentralStation.getX(), newCentralStation.getY(),
                DEFAULT_NUM_OF_RESIDENTS, DEFAULT_NUM_OF_NEIGHBORHOODS);        

        return newCity;
    }

    /**
     * The method receives 2 dates and returns true if this city was established between those dates.
     * @return true If the city was established between the dates.
     */
    public boolean cityEstablishedBetweenDates(Date date1, Date date2)
    {   
        if((date1.after(_dateEstablished) && date2.before(_dateEstablished)) || 
        (date2.after(_dateEstablished) && date1.before(_dateEstablished)) ||
        (date2.equals(_dateEstablished)) || 
        (date1.equals(_dateEstablished))){
            return true;
        }
        return false;
    }

    /**
     * Returns the differece in days between this city's establishment date and the other city's establishment date.
     *@return difference The difference in days between the dates. 
     */
    public int establishmentDateDiff(City other)
    {
        return _dateEstablished.difference(other._dateEstablished); 
    }
}
