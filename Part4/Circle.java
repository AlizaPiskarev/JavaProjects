public class Circle
{
    private Point _center;
    private double _radius;
    private static final int DEFAULT_RADIUS = 1;
    private static final int DEFAULT_VAL = 0;
    
    //constructors
    public Circle(int x, int y, double radius)
    {
        _center = new Point(x,y);
        if(radius<=DEFAULT_VAL){
            _radius = DEFAULT_RADIUS;
        }
        else{
            _radius = radius;
        }
    }
    
    public Circle(Point center, double radius)
    {
        _center = new Point(center);
        if(radius<=DEFAULT_VAL){
            _radius = DEFAULT_RADIUS;
        }
        else{
            _radius = radius;
        }
    }
    
    public Circle(Circle other)
    {
        _center = new Point(other._center);
        _radius = other._radius;
    }
    
    public Point getCenter()
    {
        return new Point(_center);
    }
    
    public double getRadius()
    {
        return _radius;
    }
    
    public void setCenter(Point center)
    {
        _center = new Point(center);
    }
    
    public void setRadius(double radius)
    {
        if(radius>=DEFAULT_VAL){
            _radius = radius;
        }
    }
}