import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Kadai01 {

    public static void main(String[] args) {
        try (var reader = Files.newBufferedReader(Paths.get(".", "java-kadai01", "scores.csv"))) {
            var line = " ";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}