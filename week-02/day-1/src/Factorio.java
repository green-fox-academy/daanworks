public class Factorio {
    public static int factorio(int input) {
        int fact = 1;
        for (int i = input; i > 0 ; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial

        System.out.println(factorio(3));
    }
}
