//checks if an integer is a prime number. and returns all the prime numbers from 0 to the received number. 
import java.util.Scanner;
public class Prime2
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int num = Math.abs(sc.nextInt());
        for(int i=1; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
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