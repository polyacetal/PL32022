import java.awt.*;
import javax.swing.*;

public class MoveFrame extends JFrame
{
    private MovePanel mp;

    public MoveFrame()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image[] chara_array = new Image[3];
        for (int i = 0; i < 3; i++)
        {
            chara_array[i] = tk.getImage("chara" + i + ".jpg");
        }
        this.mp = new MovePanel(chara_array);
        JPanel panel = new JPanel();
        panel.add(this.mp);
        super.getContentPane().add(panel);
    }

    public static void main(String[] args)
    {
        MoveFrame a = new MoveFrame();
        a.setSize(640, 480);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}