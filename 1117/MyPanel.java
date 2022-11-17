import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    public MyPanel()
    {
        super.setBackground(Color.black);
        super.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.blue);
        g.drawLine(50, 50, 100, 100);
        g.drawOval(32, 16, 256, 128);
        g.drawString("hello", 48, 48);
    }
}