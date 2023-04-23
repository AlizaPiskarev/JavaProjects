//compares two strings
import java.util.Scanner;
public class CompareStrings
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two tokens: ");
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(s1+compare(s1, s2)+s2);
    }

    private static char compare(String s1, String s2)
    {
        for(int i=0; i<s1.length()&&i<s2.length(); i++){
            if(s1.charAt(i)>s2.charAt(i)){
                return '>';
            }
            if(s1.charAt(i)<s2.charAt(i)){
                return '<';
            }
        }
        if(s1.length()==s2.length()){
            return '=';
        }
        if(s1.length()>s2.length()){
            return '>';
        }
        return '<';
    }
}