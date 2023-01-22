
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Applets1 extends Applet{

    public void paint(Graphics g)
    {
        //g.drawRect(100,300,100,100);
        g.drawLine(100,100, 200, 250);
        g.drawLine(500,100, 100, 100);
        g.setColor(Color.red);
        g.drawLine(400,250, 500, 100);
        g.setColor(Color.BLUE);
        g.drawLine(200,250, 400, 250);

        g.drawLine(250,10, 450, 100);
        g.drawLine(250,10, 250, 100);
    }

}
