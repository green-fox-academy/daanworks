import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the number of rows: ");
        int prmd = scanner.nextInt();

        for (int i = 1; i < prmd + 1; i++) {

            for (int j = 0; j < prmd - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 1 + (2 * (i - 1)); k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();

        System.out.print("Please type the number of rows2: ");
        int prmd2 = scanner.nextInt();



    }
}
