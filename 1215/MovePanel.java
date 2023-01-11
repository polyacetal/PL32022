import java.awt.*;
import javax.swing.*;

public class MovePanel extends JPanel
{
    private Image[] chara_array;
    private int chara_i, chara_x, chara_y, delay;

    public MovePanel(Image[] chara_array)
    {
        this.chara_array = chara_array;
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
        this.chara_i = 0;
        this.chara_x = 0;
        this.chara_y = 0;
        this.delay = 0;
    }

    public void paintComponent(Graphics g)
    {
        System.out.println("in paintComponent:");
        super.paintComponent(g);
        this.delay++;
        if(this.delay > 5)
        {
        this.delay = 0;
        this.chara_i++;
        this.chara_i = this.chara_i % this.chara_array.length;
        }
        this.chara_x +=2;
        this.chara_x = this.chara_x % 220;
        g.drawImage(this.chara_array[this.chara_i], this.chara_x, this.chara_y,this);
    }
}