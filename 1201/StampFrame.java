import java.awt.*;
import javax.swing.*;

public class StampFrame extends JFrame
{
    private StampPanel mp;

    public StampFrame()
    {
        this.mp = new StampPanel();
        JPanel panel = new JPanel();
        panel.add(this.mp);
        super.getContentPane().add(panel);
    }

    public static void main(String[] args)
    {
        StampFrame a = new StampFrame();
        a.setSize(640, 480);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}