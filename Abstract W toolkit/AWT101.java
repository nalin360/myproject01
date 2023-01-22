import java.awt.*;
import java.awt.event.WindowAdapter;
// import java.awt.event.WindowEvent;

public class AWT101 extends Frame {

    AWT101()
    {
        //Frame f1 = new Frame("First Frame");

        Button but = new Button("Click me");
        but.setBounds(50,100,60,40);
        add(but);// add button to the frame

        TextField t1 = new TextField();
        t1.setBounds(50,50,200,20);
        add(t1);

        Label l1 = new Label("This is Label");
        l1.setBounds(50,150,100,40);
        add(l1);

        TextArea ta1 = new TextArea();
        ta1.setBounds(50,200,200,40);
        add(ta1);

        /*
        * The object of CheckboxGroup class is used to group together a set of Checkbox.
        *  At a time only one check box button is allowed to be in "on" state and remaining
        * check box button in "off" state.
         *
        Checkbox chb1 = new Checkbox("java",true);
        chb1.setBounds(50,250,10,10);
        add(chb1);
*/
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox chb1 = new Checkbox("java",true,cg);
        chb1.setBounds(50,250,10,10);
        add(chb1);

        Checkbox chb2 = new Checkbox("C++",false,cg);
        chb2.setBounds(50,300,10,10);
        add(chb2);

        // Choice

        List li1 =new List(5,true);
        li1.setBounds(50,350,60,30);
        li1.add("Item1");// add item  in the list
        li1.add("Item2");
        li1.add("Item3");
        li1.add("Item4");
        li1.add("Item5");
        add(li1);

        Scrollbar sb = new Scrollbar();
        sb.setBounds(50,400,60,100);
        add(sb);

        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("Menu");
        Menu sb1 =  new Menu("Sub Menu");

        MenuItem i1 = new MenuItem("item 1");
        MenuItem i2 = new MenuItem("item 2");
        MenuItem i3 = new MenuItem("item 3");
        MenuItem i4 = new MenuItem("item 4");

        mb.add(m1);
        m1.add(sb1);
        m1.add(i1);
        m1.add(i2);
        sb1.add(i3);
        sb1.add(i4);
        setMenuBar(mb);



        setSize(500,500);// set size of frame
        setLayout(null);// no layout manager
        setVisible(true);




/*
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                //super.windowClosed(e);
                f1.dispose();
            }
        });
*/




    }
    public static void main(String[] args) {
        AWT101 obj1 = new AWT101();
    }
}
