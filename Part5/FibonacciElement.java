//calculates Fibonacci element 1
import java.util.Scanner;
public class FibonacciElement
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index of the element: ");
        int index = sc.nextInt();

        int current = 1;
        int prev = 1;
        int prevPrev = 1;

        for(int i=3; i<=index; i++)
        {
            current = prev + prevPrev;
            prev = prevPrev;
            prev = current;
        }
        System.out.print(current);
    }
}