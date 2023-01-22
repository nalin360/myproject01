import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    // reading the file
    public static void main(String[] args)  {
        try {


        File myobj = new File("C:\\\\Users\\\\admin\\\\IdeaProjects\\\\myproject01\\\\thefiless\\\\file11.txt");
        Scanner sc = new Scanner(myobj);
        while (sc.hasNextLine())
        {
            String data = sc.nextLine();
            System.out.println(data);
        }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
