import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of chicken(s): ");
        int numberOfChickens = scanner.nextInt();
        System.out.print("Please enter the number of pig(s): ");
        int numberOfPigs = scanner.nextInt();

        System.out.println("All the animals have " + ((2 * numberOfChickens) + (4 * numberOfPigs)) + " legs.");
    }
}
