import java.sql.SQLOutput;
import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the number of girls: ");
        int numberOfGirls = scanner.nextInt();
        System.out.print("Please type the number of boys: ");
        int numberOfBoys = scanner.nextInt();

        if ((numberOfBoys == numberOfGirls) && (numberOfBoys + numberOfGirls >= 20)) {
            System.out.println("The party is excellent!");
        }

        if ((numberOfBoys != numberOfGirls) && (numberOfBoys + numberOfGirls >= 20)) {
            System.out.println("Quite cool party!");
        }

        if (numberOfBoys + numberOfGirls < 20) {
            System.out.println("Average party...");
        }

        if (numberOfGirls == 0) {
            System.out.println("Sausage party!");
        }
    }
}
