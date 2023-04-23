//are two strings equal?
import java.util.Scanner;
public class EqualStrings
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two tokens: ");
        String s1 = sc.next();
        String s2 = sc.next();
        if(equal(s1, s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }

    private static boolean equal(String s1, String s2)
    {
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}