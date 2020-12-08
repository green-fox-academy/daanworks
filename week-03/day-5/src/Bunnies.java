public class Bunnies {

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).

    public static int countEars(int bunnies) {
        if(bunnies == 1) {
            return 2;
        } else {
            return countEars(bunnies-1) + 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(countEars(164));
    }
}
