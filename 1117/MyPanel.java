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

        g.setColor(new Color(90, 255, 35));
        g.setColor(new Color(255, 255, 100));
        g.fillOval(220, 50, 200, 250);
    }
}