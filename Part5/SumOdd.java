//sum all odd numbers (from input)
import java.util.Scanner;
public class SumOdd
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter a list of integer (ends with 0): ");

        do{
            num = sc.nextInt();
            if(num%2!=0){
                sum+=num;
            }
        }while(num!=0);
        System.out.println("The sum of odd numbers: "+ sum);
    }
}