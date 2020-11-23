public class Greet {

    public static void greet(String input) {
        String greeting = "Greetings dear, " + input;
        System.out.println(greeting);
    }

    public static void main(String[] args) {

        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`

        String al = "Green Fox";
        greet(al);
    }
}
