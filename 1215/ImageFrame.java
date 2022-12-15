import java.awt.*;
import javax.swing.*;

public class ImageFrame extends JFrame
{
    private ImagePanel ip;

    public ImageFrame()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image chara = tk.getImage("chara1.jpg");
        this.ip = new ImagePanel(chara);
        JPanel panel = new JPanel();
        panel.add(this.ip);
        super.getContentPane().add(panel);
    }

    public static void main(String[] args)
    {
        ImageFrame a = new ImageFrame();
        a.setSize(640, 480);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}