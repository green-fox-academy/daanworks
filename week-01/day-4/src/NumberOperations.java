public class NumberOperations {
    public static void main(String[] args) {
        System.out.println(1 + 1);
        System.out.println(5 - 2);
        System.out.println(3 * 4);
        System.out.println(6 / 2);
        System.out.println(5 / 2); // Itt int marad az eredmény, mert mindkét érték int.
        System.out.println(5. / 2); // Így float/double az egyik, és amit kiír is float/double lesz.
        System.out.println(5. / 2.); // Így is float/double lesz, mert mindkettő float/double.
        System.out.println(5 % 2); // Ez csak a maradékot adja vissza, ugyanúgy int-ben ha int-ek és floatban ha float-ok.
    }
}
