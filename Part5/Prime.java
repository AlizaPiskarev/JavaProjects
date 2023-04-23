//checks if an integer is a prime number.
import java.util.Scanner;
public class Prime
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int num = Math.abs(sc.nextInt());
        if(isPrime(num)){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not prime");
        }

    }
    
    private static boolean isPrime(int num)
    {
        if(num==1){
            return false;
        }
        int div = 2;
        while(div<num){
            if(num%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}