public class BoxTester
{
    public static void main(String [] args)
    {
        //Test constructor and 'get' methods.
        Box b1;
        System.out.println("\nCreating Box b1 with the following measures 2,4,6:");
        b1 = new Box(2,4,6);
        System.out.println("The measures of Box b1 are: " + b1.getWidth() + b1.getHeight() + b1.getLength());

        //Test copy constructor.
        System.out.println("\nCreating Box b2 as a copy of b1: ");
        Box b2 = new Box(b1);
        System.out.println("The measures of Box b2 are: " + b2.getWidth() + b2.getHeight() + b2.getLength());

        //Test constructor with invalid value.
        System.out.println("\nCreating Box b3 with the following measures -2,4,6:");
        Box b3 = new Box(-2,4,6);
        System.out.println("The measures of Box b3 are: " + b3.getWidth() + b3.getHeight() + b3.getLength());

        //Test 'set' methods.
        System.out.println("\nSetting b1 to 10, 20, 30:");
        b1.setWidth(10);
        b1.setLenght(20);
        b1.setHeight(30);
        System.out.println("The new measures of Box b1 are: " + b1.getWidth() + b1.getHeight() + b1.getLength());

        //Test volume and surfaceArea.
        System.out.println("Box b1 volume is " + b1.volume() + ", surface area is " +b1.surface());
    }
}