import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    public MyPanel()
    {
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(new Color(255, 255, 100));
        g.fillOval(220, 50, 200, 250);
        g.setColor(new Color(0, 0, 0));
        g.drawString("egg",315,170);
    }
}