public class ChessTabel {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("% ");
                }

            } else {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" %");
                }
            }

            System.out.println();
        }
    }
}
