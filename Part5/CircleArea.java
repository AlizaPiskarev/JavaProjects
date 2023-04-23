//This program reads an integer and calculates the area of a circle with that radius.
import java.util.Scanner;
public class CircleArea
{
    public static void main(String [] args)
    {
        final double PI = Math.PI;
        Scanner scan = new Scanner(System.in);
        int r;
        do{
            System.out.print("Enter the radius of circle (integer): ");
            r = scan.nextInt(); //circle area formula - PI*r^2
            if(r<=0){
                System.out.println("Radius must be positive.");
            }
        } while (r<=0);
        double area = PI * Math.pow(r, 2);
        System.out.print("The area of a circle with radius " + r + " is " + area);
    }
}
