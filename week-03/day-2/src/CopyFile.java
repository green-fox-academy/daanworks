import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        FileCopy("1.txt", "2.txt");

    }

    public static boolean FileCopy(String fileName1, String fileName2) {
        try {
            List<String> tempList = Files.readAllLines(Paths.get(fileName1));
            Files.write(Paths.get(fileName2), tempList, StandardOpenOption.APPEND);
            return true;
        } catch(IOException e) {
            return false;
        }
    }
}
