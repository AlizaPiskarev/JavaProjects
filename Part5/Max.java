//print the largest (six numbers)
import java.util.Scanner;
public class Max
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int max = Interger.MIN_VALUE;
        int num;
        //for(variables; condition for repiting; what happens in the end of the iteration)
        for(int i=0; i<6; i++){
            System.out.print("Enter integer: ");
            num = sc.nextInt();
            if(num>max){
                max = num;
            }
        }
        System.out.print(max + " is the largest");

        //second way:
        int i = 0;
        while(i<6){
            System.out.print("Enter integer: ");
            num = sc.nextInt();
            if(num>max){
                max = num;
            } 
            i++;
        }
        System.out.print(max + " is the largest");
    }
}