import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel
{
    private Image chara;

    public ImagePanel(Image chara)
    {
        this.chara = chara;
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g)
    {
        System.out.println("in paintComponent:");
        super.paintComponent(g);
        g.drawImage(this.chara, 170, 50, this);
    }
}