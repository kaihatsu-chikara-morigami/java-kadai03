import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Kadai02 {

    public static void main(String[] args) {
        try (var reader = Files.newBufferedReader(Paths.get(".", "java-kadai02", "scores.csv"))) {
            var line = " ";
            String[] list = new String[3];
            while ((line = reader.readLine()) != null) {
                list = line.split(",",4);
                System.out.println(list[2] + "," +list[0] + "," + list[1] + "," + list[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}