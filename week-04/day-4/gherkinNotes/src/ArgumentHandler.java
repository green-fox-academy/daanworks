import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArgumentHandler {

    public void handleArgument(String[] arguments) {
        if(arguments.length == 0) {
            System.out.println(getInstructions());
        } else {
            switch (arguments[0]) {
                case "-U":
                case "--uppercase":
                    {
                    System.out.println(arguments[1].toUpperCase());
                    break;
                }
                case "-L" : {
                    System.out.println(arguments[1].toLowerCase());
                    break;
                }
                default: {
                    System.out.println("Invalid arguments");
                    break;
                }
            }
        }
    }

    private String getInstructions() {
        Path path = Paths.get("/Users/daanworks/Google Drive/CODING/greenfox/daanworks/week-04/day-4/gherkinNotes/instructions");
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Instruction file not available.");
        }

        StringBuilder contentAsString = new StringBuilder();
        for (String line : content) {
            contentAsString.append(line);
            contentAsString.append("\n");
        }

        return contentAsString.toString();
    }

}
