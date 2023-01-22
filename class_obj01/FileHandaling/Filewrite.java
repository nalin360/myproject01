import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {

        try
        {
            FileWriter myf = new FileWriter("C:\\Users\\admin\\IdeaProjects\\myproject01\\thefiless\\file11.txt");
            myf.write("hi this is fill11 file writer");
            myf.close();
            System.out.println("Successfull ");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
