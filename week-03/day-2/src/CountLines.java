import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

        NumberOfLines("file.txt");

    }

    public static int NumberOfLines(String fileName) {

        int lines = 0;

        try {
            Path path = Paths.get(fileName);
            List<String> list = Files.readAllLines(path);
            lines = list.size();
            System.out.println(lines);
            return lines;
        } catch (IOException e) {
            System.out.println(lines);
            return lines;
        }
    }
}
