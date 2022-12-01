import java.awt.*;
import javax.swing.*;

public class DrawPanel extends JPanel
{

    private int verticalSize;
    private int besideSize;
    private int color;

    public DrawPanel()
    {
        this.verticalSize = 50;
        this.besideSize = 220;
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(new Color(255, 255, 100));
        g.fillOval(this.besideSize, this.verticalSize, 200, 250);
        g.setColor(new Color(color, color, color));
        g.drawString("egg",this.besideSize + 95, this.verticalSize + 120);
    }

    public void setVerticalSize(int y)
    {
        this.verticalSize = y;
    }
    
    public void setBesideSize(int x)
    {
        this.besideSize = 170 + x;
    }

    public void setTextColor(int color)
    {
        this.color = color;
    }
}