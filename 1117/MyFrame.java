import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
    private MyPanel mp;
    private 

    public MyFrame()
    {
        this.mp = new MyPanel();
        JPanel panel = new JPanel();
        panel.add(this.mp);
        super.getContentPane().add(panel);
    }

    public static void main(String[] args)
    {
        MyFrame a = new MyFrame();
        a.setSize(640, 480);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}