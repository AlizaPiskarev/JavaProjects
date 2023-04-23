//prints the digits of a number- right to left.
import java.util.Scanner;
public class PrintDigits1
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = Math.abs(sc.nextInt());

        while(num>0){
            System.out.print(num%10);
            if(num>=10){
                System.out.print(", ");
            }
            num = num/10;
        }
    }
}