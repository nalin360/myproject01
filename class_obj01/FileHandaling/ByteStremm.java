import java.io.*;

public class ByteStremm {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        /*
        * A FileInputStream obtains input bytes from a file in a file system.
         * */
        try{

            in = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\myproject01\\thefiless\\xanadu.txt");
            out = new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\myproject01\\thefiless\\outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
         finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
