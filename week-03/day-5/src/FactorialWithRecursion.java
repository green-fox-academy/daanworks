public class FactorialWithRecursion {

    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorialWithRecursion(4));

    }

}
