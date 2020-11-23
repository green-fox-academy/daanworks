public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array

        int matrixWidth = 4;
        int matrixHeight = 4;

        int[][] matrix = new int[matrixWidth][matrixHeight];

        for (int i = 0; i < matrixHeight; i++) {
            matrix[i][i] = 1;
        }

        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixHeight; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
