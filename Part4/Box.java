/**
 * The Box class represents a 3-dimentional box.
 * 
 * @author Aliza
 * @version 123.45
 */
public class Box
{
    //1. instance variables 
    private int _width;
    private int _length;
    private int _height;
    private final int DEFAULT_VALUE = 1;

    /**
     * Constructs a new Box with default width, length, height.
     */
    //2. constractors
    public Box()
    {
        _width = DEFAULT_VALUE;
        _length = DEFAULT_VALUE;
        _height = DEFAULT_VALUE;
    }

    /**
     * Constructs a new Box with given measurments.
     * @param width the box width
     * @param length the box lenght
     * @param height the box height
     */
    public Box(int width, int length, int height)
    {
        if(width > 0){
            _width = width;
        }
        else{
            _width = DEFAULT_VALUE;
        }
        if(length > 0){
            _length = length;
        }
        else{
            _length = DEFAULT_VALUE;
        }
        if(height > 0){
            _height = height;
        }
        else{
            _height = DEFAULT_VALUE;
        }
    }

    /**
     * Constructs a copy Box.
     * @param Box
     */
    public Box(Box other)
    {
        _width = other._width;
        _length = other._length;
        _height = other._height;
    }

    //3. getters/setters
    /**
     * Returns the width of the Box.
     * @return the width of the Box.
     */
    public int getWidth()
    {
        return _width;
    }

    /**
     * Returns the length of the Box.
     * @return the length of the Box.
     */
    public int getLength()
    {
        return _length;
    }

    /**
     * Returns the height of the Box.
     * @return the height of the Box.
     */
    public int getHeight()
    {
        return _height;
    }

    /**
     * Set the width of the Box to given value. If the value is not positive the width will not change.
     * @param width The given width.
     */
    public void setWidth(int w)
    {
        if(w > 0){
            _width = w;
        }
    }

    /**
     * Set the lenght of the Box to given value. If the value is not positive the lenght will not change.
     * @param lenght The given lenght.
     */
    public void setLenght(int l)
    {
        if(l > 0){
            _length = l;
        }
    }

    /**
     * Set the height of the Box to given value. If the value is not positive the height will not change.
     * @param height The given height.
     */
    public void setHeight(int h)
    {
        if(h > 0){
            _height = h;
        }
    }

    //4. other methods
    /**
     * return the volume of the Box.
     * @return the volume of the Box.
     */
    public int volume()
    {
        return _width * _length * _height;
    }

    /**
     * return the surface area of the Box.
     * @return the surface area of the Box.
     */
    public int surface()
    {
        return ((_length * _height) + (_length * _width) + (_width * _height))*2; 
    }

    /**
     * Adds given values to each measure of the box (the values may be negative
     * But if at least one of the measures becomes non- positive after addition- nothing will change).
     * @param addToWidth The value added to the width.
     * @param addToLength The value added to the length.
     * @param assToHeight The value added to the height.
     */
    public void add(int addToWidth, int addToLength, int addToHeight)
    {
        if(_width+addToWidth>0 && _length+addToLength>0 && _height+addToHeight>0){
            _width += addToWidth;
            _length += addToLength;
            _height += addToHeight;
        }
    }

    //overloaing - same name of the method but different params.
    /**
     * Adds a given value to each measures of the box (the values may be negative
     * But if at least one of the measures becomes non- positive after addition- nothing will change).
     * @param num The given value to add.
     */
    public void add(int num)
    {
        add(num, num, num);
    }
}
