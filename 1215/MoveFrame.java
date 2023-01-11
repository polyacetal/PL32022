import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MoveFrame extends JFrame implements ActionListener
{
    private MovePanel mp;
    private Timer timer;

    public MoveFrame()
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image[] chara_array = new Image[3];
        for (int i = 0; i < 3; i++)
        {
            chara_array[i] = tk.getImage("chara_move" + i + ".jpg");
        }
        this.mp = new MovePanel(chara_array);
        JPanel panel = new JPanel();
        panel.add(this.mp);
        super.getContentPane().add(panel);
        this.timer = new Timer(17, this);
        this.timer.start();
    }

    public void actionPerformed(ActionEvent e)
    {
        this.mp.repaint();
        Toolkit.getDefaultToolkit().sync();
    }

    public static void main(String[] args)
    {
        MoveFrame a = new MoveFrame();
        a.setSize(640, 500);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}