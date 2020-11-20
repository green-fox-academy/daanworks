import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please type in the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The bigger number is " + num1);
        } else if (num1 < num2) {
            System.out.println("The bigger number is " + num2);
        } else {
            System.out.println("The two numbers are even.");
        }
    }
}
