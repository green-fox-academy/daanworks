public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        System.out.println(a);
        System.out.println(b);

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped:");
        System.out.println(a);
        System.out.println(b);
    }
}
