public class Main {

    public static void main(String[] args) {

        CountLetters countLetters = new CountLetters();

        for (Character name: CountLetters.createMap("HolLymolly").keySet()){
            String key = name.toString();
            String value = CountLetters.createMap("HolLymolly").get(name).toString();
            System.out.println(key + ": " + value);
        }

    }
}
