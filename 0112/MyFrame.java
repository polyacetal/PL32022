import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
    private MyPanel mp;

    public MyFrame()
    {
        this.mp = new MyPanel();
        JPanel panel = new JPanel();
        panel.add(this.mp);
        super.getContentPane().add(panel);
    }

    public void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        frame.setSize(640,480);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }
}