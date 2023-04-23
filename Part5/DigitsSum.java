//prints the sum of the digits of an integer
import java.util.Scanner;
public class DigitsSum
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = Math.abs(sc.nextInt());
        int sum = 0;

        while(num>0){
            sum = sum + num%10; //modolo 10- to receive the right integer.
            num = num/10; //update the num by dividing in 10.
        }
        System.out.print("The sum of the digits is: "+ sum);
    }
}