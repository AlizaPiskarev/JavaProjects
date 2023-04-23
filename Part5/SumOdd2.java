//sum all odd numbers (from 0 to a given integer) with while or for.
import java.util.Scanner;
public class SumOdd2
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; 1<=num; i+=2){
            sum+=i;
        }
        System.out.println("The sum of odd numbers: "+sum);
    }
}