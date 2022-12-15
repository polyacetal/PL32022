import java.awt.*;
import javax.swing.*;

public class ImagesPanel extends JPanel
{
    private Image[] chara_array;

    public ImagesPanel(Image[] chara_array)
    {
        this.chara_array = chara_array;
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g)
    {
        System.out.println("in paintComponent:");
        super.paintComponent(g);
        for (int i = 0; i < this.chara_array.length; i++)
        {
            g.drawImage(this.chara_array[i], i * 150 + 120, 150, this);
        }
    }
}