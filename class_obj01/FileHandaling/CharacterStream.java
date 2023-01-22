import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\admin\\IdeaProjects\\myproject01\\thefiless\\xanadu.txt");
            outputStream = new FileWriter("C:\\Users\\admin\\IdeaProjects\\myproject01\\thefiless\\characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}


