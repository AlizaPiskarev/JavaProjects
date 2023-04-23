//Does a String s1 contains a String 2
import java.util.Scanner;
public class Contain
{
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr two tokens: ");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("s1 contains s2: + contain(s1, s2)");
    }

    public static boolean contain(String s1, String s2) //asumming s2 is not empty.
    {
        for(int i=0; i<=s1.length()-s2.length(); i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int j=0;
                while(j<s2.length() && s1.charAt(i+j)==s2.charAt(j)){
                    j++;
                }
                if(j==s2.length()){
                    return true;
                }
            }
        }
        return false;
    }
}

//this example is important and relavant. we use it to find. Ctrl+f.