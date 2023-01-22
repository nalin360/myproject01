import java.awt.*;

public class AWtList extends Frame{

    AWtList()
    {
        List li1 =new List(5,false);
        //setBounds(50,350,30,10);
        li1.add("Item1");// add item  in the list
        li1.add("Item2");
        li1.add("Item3");
        li1.add("Item4");
        li1.add("Item5");
        add(li1);

        setSize(500,500);// set size of frame
        setLayout(null);// no layout manager
        setVisible(true);
    }

    public static void main(String[] args) {

        new AWtList();
    }
}
