/*
 * This is a guessing game.
 * For every wrong guess (after the first) the user is informed whether the current guess is closer, farther or same as the previous guess.
 * 
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        final int LIMIT = 20; //range of possible numbers 1-LIMIT
        System.out.println("******* GUESS MY NUMBER *******");

        int guess; //current guess
        int target; //random target number, adding 1 to correct range.
        int counter = 0; //counting guesses
        boolean win = false; //a flag, true if the user found out the target.
        int diff; //difference between current guess and target.
        int oldDiff = 0; //difference between previous guess and target.
        char answer;
        
        do{
            target = r.nextInt(LIMIT) + 1;
            System.out.println("target: " + target); //for QA only, delete later.
            counter = 0;
            win = false;

            System.out.println("Enter your guess: ");
            guess = sc.nextInt(); //guess #1
            counter++;

            if(guess==target){
                win = true;
            }
            else{
                oldDiff = Math.abs(guess-target); //calculate difference (for the next round)
                System.out.println("No...");
            }
            while(!win){
                System.out.println("Enter your guess: ");
                guess = sc.nextInt(); //guess #2
                counter++;
                if(guess==target){
                    win = true;
                }
                else{
                    diff = Math.abs(guess-target); //calculate current difference
                    if(diff>oldDiff) //current difference is bigger
                        System.out.println("Colder...");
                    else if(diff<oldDiff) //current difference is smaller
                        System.out.println("Warmer...");
                    else
                        System.out.println("Same Difference...");
                    oldDiff = diff; //update for the next round
                }
            }

            System.out.println("Yes! You won!! (" +counter+" guesses)");
            System.out.println("Play again? (y/n)");
            answer = sc.next().charAt(0);
            
        } while(answer=='y' || answer=='Y');
    }
}