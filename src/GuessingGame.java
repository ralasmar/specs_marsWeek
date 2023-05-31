import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //print greeting to player
        System.out.println("Hello! What is your name? ");
        //get player name
        System.out.println("enter your name here ");
        //save name to variable
        String name = scanner.nextLine();
        //create an instance of the random object
        Random random = new Random();
        //call method nextInt and pass in upper range bound
        int number = random.nextInt(100);
        int guesses = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");

        //while loop letting the user guess until getting the correct number
        while(true) {
            int guess;
            //try and catch statements to catch a bad input
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                //if something other than a number is entered
                String bad_input = input.next(); //so you can progress past bad input
                System.out.println("That is not an integer, try again");
                continue;
            }
            //if statement if the number entered is less than 1 or greater than 100
            if (guess < 1 || guess > 100){
                System.out.println(guess + " is not a valid guess, try again");
                continue;
            }


            guesses += 1;

            if(guess < number){
                System.out.println("Your guess is too low");
            } else if(guess > number){
                System.out.println("Your guess is too high");
            } else {
                System.out.println("You win " + name);
                System.out.println("you guessed correctly in " + guesses + " guesses!");
                break;
            }
        }

    }
}