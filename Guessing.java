import java.util.*;
public class Guessing{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int crand =  rand.nextInt(100) + 1;
        System.out.printf("--------NUMBER GUESSING GAME--------\n");
        System.out.printf("The computer is thinking between the numbers 1 to 100.\n");
        System.out.printf("You have maximum of 10 attempts to guess the correct number failing which the Computer wins and the game terminates.\n");
        System.out.printf("If you win the round the game resets & exits out and the victory message is Displayed.\n");
        for(int attempts = 1; attempts <= 10; attempts++){
            System.out.printf("Attempt number:" + attempts + "\nEnter your guess:");
            int guess = s.nextInt();
            if(crand == guess){
                System.out.println("Correct guess!");
                System.out.println("Congratulations, YOU WON!");
                break;
            }
            else if(crand < guess){
                System.out.println("Your guess is higher than expected number, please try again!");
            }
            else{
                System.out.println("Your guess is lower than expected number, please try again!");
            }
            if (attempts == 10) {
                System.out.println("You were not able to guess the correct number, you lost the game. The correct number is" + crand);
        }
    }
    
}
}
