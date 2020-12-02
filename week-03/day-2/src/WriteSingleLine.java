import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        PutMyName();

    }

    public static void PutMyName() {
        try {
            String myName = "Babinszky Daniel";
            Path path = Paths.get("my-file.txt");
            Files.write(path, myName.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}