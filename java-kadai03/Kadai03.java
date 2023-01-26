import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Kadai03 {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        try (var reader = Files.newBufferedReader(Paths.get(".", "java-kadai03", "scores.csv"))) {
            var line = " ";
            String[] list = new String[3];
            while ((line = reader.readLine()) != null) {
                list = line.split(",",4);
                ls.add(list[2] + "," +list[0] + "," + list[1] + "," + list[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<String> ls2 = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        String []ls3 = new String[3];

        for(int i = 0; i < 6; i++){
        ls3 = (ls2.get(i)).split(",",4);        
        System.out.println(ls3[1] + "," + ls3[2] + "," + ls3[0] + "," +ls3[3]);
        }
    }
}