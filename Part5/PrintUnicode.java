//prints the unicode values of a string
import java.util.Scanner;
public class PrintUnicode
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of tokens (end with \"...\" ");
        String s = sc.next();

        while(s.equals("...")){
            for(int i=0; i<s.length(); i++){
                System.out.print((int)s.charAt(i)+" ");
                System.out.println();
                System.out.println("Enter next token: ");
                s = sc.next();
            }
        }
        System.out.println("Goodbye");
    }
}