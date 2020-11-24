public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String[] newQuote;

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String stringBuilder = "always takes longer than";
        String quoteBlock1;
        String quoteBlock2;

        int indexYou = quote.indexOf("you");
        quoteBlock1 = quote.substring(0, indexYou - 1);
        quoteBlock2 = quote.substring(indexYou);

        quote = quoteBlock1 + " " + stringBuilder + " " + quoteBlock2;

        System.out.println(quote);
    }
}