import java.util.Random;
import java.util.Scanner;


public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        int guess = 0;
        String trash = "";
        boolean done = false;

        System.out.println(" Lets play a guessing game! You guess a number 1-10 and I will let you know if it is correct or not ");
        do{
            int val = generator.nextInt(10)+1;
            System.out.println(" Guess the number [1-10] ");
            if (input.hasNextInt()){
                guess = input.nextInt();
                if (guess == val)
                    System.out.println(" You guessed correctly  ");
                done = true;
                if (guess != val)
                    System.out.println(" You guessed incorrectly, try again! the number was " + val);
                else
                    trash = input.nextLine();
                done = true;


            }
        }while(!done);
    }
}
