public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        String str = DividedByTen(0);
        System.out.println(str);
    }

    public static String DividedByTen(int inputNum) {

        try {
            int result = 10 / inputNum;
            return "The result is " + result;
        } catch(ArithmeticException e) {
            return "fail";
        }

    }
}
