/**
 * This class represents 2 dimensional point. Coordinates cannot be negative.
 * @author Aliza Piskarev.
 * @version 16.04.2023
 */
public class Point
{
    //instance variables 
    private int _x;
    private int _y;
    private static final int DEFAULT_MIN = 0;

    /**
     * Constructs a point. Construct a new point with the specified x y coordinates. If either coordinate is negative the coordinate will be 0.
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public Point(int x, int y)
    {
        if(x>=DEFAULT_MIN){
            _x = x;
        }
        else{
            _x = DEFAULT_MIN;
        }
        if(y>=DEFAULT_MIN){
            _y = y;
        }
        else{
            _y = DEFAULT_MIN;
        }
    }

    /**
     * Copy constructor for Points. Construct a point with the same coordinates as another point.
     * @param other The point object from which to construct the new point.
     */
    public Point(Point other)
    {
        _x = other._x;
        _y = other._y;
    }

    /**
     * Returns the x coordinate of the Point.
     * @return the x coordinate of the Point.
     */
    public int getX()
    {
        return _x;
    }

    /**
     * Returns the y of the Point.
     * @return the y of the Point.
     */
    public int getY()
    {
        return _y;
    }

    /**
     * Sets the x coordinate of the Point.
     * If an illegal number received the x coordinate will not be changed.
     * @param num The new x coordinate.
     */
    public void setX(int num)
    {
        if(num>=DEFAULT_MIN){
            _x = num;
        }
    }

    /**
     * Sets the y coordinate of the Point.
     * If an illegal number received the y coordinate will not be changed.
     * @param num The new y coordinate.
     */
    public void setY(int num)
    {
        if(num>=DEFAULT_MIN){
            _y = num;
        }
    }

    /**
     * Returns a string representation of this Point ("(x,y)").
     * @return String representation of this Point ("(x,y)").
     */
    public String toString()
    {
        return "(" + _x + "," + _y + ")";
    }

    /**
     * Checks if the values of this Point is equal to the values of a received point (Point other).
     * @param other The point to be compared with this point.
     * @return true if the values of the points are equals. 
     */
    public boolean equals(Point other)
    {
        return (_x==other._x) && (_y==other._y);
    }

    /**
     * Checks if this point is above a received point (Point other).
     * @param other The point to be compared with this point.
     * @return true if this point is above the other point.
     */
    public boolean isAbove(Point other)
    {
        return other._y < _y;
    }

    /**
     * Checks if this point is unter a received point (Point other).
     * @param other The point to check if this point is under.
     * @return true if this point is under the other point.
     */
    public boolean isUnder(Point other)
    {
        return other.isAbove(this);
    }

    /**
     * Checks if this point is on the left side of the received point (Point other).
     * @param other The point to check if this point is left of.
     * @return true If this point is on the left side of the other point.
     */
    public boolean isLeft(Point other)
    {
        return _x < other._x;
    }

    /**
     * Checks if this point is on the right side of the received point (Point other).
     * @param other The point we compare this point to.
     * @return true if this Point is on the right side of the other point.
     */
    public boolean isRight(Point other)
    {
        return other.isLeft(this);
    }

    /**
     * Move the x coordinate deltaX and the y coordinate deltaY. If the new coordinates are not in the first quadrant the point should not be moved.
     * @param deltaX The amount to move x.
     * @param deltaY The amount to move y.
     */
    public void move(int deltaX, int deltaY)
    {
        if((_x + deltaX)>=DEFAULT_MIN && (_y + deltaY)>=DEFAULT_MIN){
            _x += deltaX;
            _y += deltaY;
        }
    }

    /**
     * Return a new point in between this point and the received point.
     * @param p - the received point
     * @return new Point in between this point and the received pointץ
     */
    public Point middle(Point p)
    {
        int x = (_x + p._x)/2;
        int y = (_y + p._y)/2;
        return new Point(x,y);
    }

    /**
     * Calculates the distance between this point to other point.
     * @param p The point to calculate the distance from.
     * @return d The distance between this point to point p.
     */
    public double distance(Point p)
    {
        double d;
        double finalX;
        double finalY;
        finalX = Math.pow((_x - p._x),2);
        finalY = Math.pow((_y - p._y),2);
        d = Math.sqrt(finalX + finalY);
        return d;
    }
}//end of class Point.