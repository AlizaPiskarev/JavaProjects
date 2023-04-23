//longest sequence of same character
import java.util.Scanner;
public class Duplicates
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a token: ");
        String s = sc.next();

        System.out.println(longestSequence(s));
    }

    private static int longestSequence(String s)
    {
        int max = 1;
        int counter = 0;
        char cur = s.charAt(0);
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==cur){
                counter++;
            }
            else{
                if(counter>max){
                    max = counter;
                }
                counter = 1;
                cur = s.charAt(i);
            }
            i++;
        }
        if(counter>max){
            return counter;
        }
        return max;
    }
}