import java.awt.*;
import javax.swing.*;

public class ImagesFrame extends JFrame
{
    private ImagesPanel ip;

    public ImagesFrame()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image[] chara_array = new Image[3];
        for (int i = 0; i < 3; i++)
        {
            chara_array[i] = tk.getImage("chara" + i + ".jpg");
        }
        this.ip = new ImagesPanel(chara_array);
        JPanel panel = new JPanel();
        panel.add(this.ip);
        super.getContentPane().add(panel);
    }

    public static void main(String[] args)
    {
        ImagesFrame a = new ImagesFrame();
        a.setSize(640, 480);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}