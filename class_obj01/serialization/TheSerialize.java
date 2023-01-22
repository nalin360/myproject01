import java.io.*;

public class TheSerialize {
    public static void main(String[] args) throws Exception{
        Save obj = new Save();
        obj.i = 4;

        File  f =  new File("C:\\Users\\admin\\IdeaProjects\\myproject01\\class_obj01\\serialization\\SerialFile.txt");
        FileOutputStream fom = new FileOutputStream(f);
        ObjectOutputStream obs = new ObjectOutputStream(fom);
        obs.writeObject(obj);

        // Deserialiation

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream dis = new ObjectInputStream(fis);
        Save obj1 = (Save) dis.readObject();

        System.out.println("value of obj is " + obj1.i);

    }
}

class Save implements Serializable
{
    int i;
}
