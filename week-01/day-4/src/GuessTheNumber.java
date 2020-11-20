import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);

        int theNumberIs = 3;

        int guess;

        do {
            System.out.print("Please type your guess: ");
            guess = scanner.nextInt();

            if (guess > theNumberIs) {
                System.out.println("The stored number is lower");
            } else if (guess < theNumberIs) {
                System.out.println("The stored number is higher");
            }
        } while (guess != theNumberIs);
    }
}
