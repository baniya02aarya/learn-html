
    import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        
        try (
            FileReader fr= new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt")
        ) {
            char[] buffer = new char[1024];
            int charsRead;

          
            while ((charsRead = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, charsRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
//unix time

