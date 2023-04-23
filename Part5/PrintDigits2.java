//prints the digits of a number - left to right
import java.util.Scanner;
public class PrintDigits2
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = Math.abs(sc.nextInt());
        int counter = 0;
        int temp = num;

        /*while(temp>0){
        counter++;
        temp = temp/10;
        }
        counter--;*/
        counter = (int)Math.log10(num);//log is asking in what power we need to
        while(num>0){
            System.out.print(num/(int)Math.pow(10,counter)+" ");  
            num = num%(int)Math.pow(10,counter);
            counter--;
        }
    }
}