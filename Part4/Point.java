public class Point
{
    private int _x;

    private int _y;

    private final int DEFAULT_VAL = 0;

    public Point(int x, int y)
    {
        if(x >= DEFAULT_VAL){
            _x = x;
        }
        else{
            _x = DEFAULT_VAL;
        }

        if(y >= DEFAULT_VAL){
            _y = y;
        }
        else{
            _y = DEFAULT_VAL;
        }
    }
    
    public Point(Point other)
    {
        _x = other._x;
        _y = other._y;
    }

    public Point()
    {

    }

    public void move(int deltaX, int deltaY)
    {
        if((_x + deltaX >= DEFAULT_VAL) && (_y + deltaY >= DEFAULT_VAL)){
            _x += deltaX;
            _y += deltaY;
        }
    }

    public void printStatus()
    {
        System.out.print( "(" + _x + "," + _y + ")");
    }
}
