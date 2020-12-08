import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recursion {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src");
        recursiveFolderStructureMapper(path);

    }

    private static void recursiveFolderStructureMapper(Path startingPath) throws IOException {

        List<Path> files = new ArrayList<>();

        if(Files.isDirectory(startingPath)) {
            List<Path> folderContent = Files.list(startingPath).collect(Collectors.toList());
            for (Path path : folderContent) {
                if(Files.isDirectory(path)) {
                   recursiveFolderStructureMapper(path);
                }
                else {
                    files.add(path);
                }
            }
        }

        for (Path file : files) {
            System.out.println(files.toString());

        }
    }
}
