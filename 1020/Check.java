import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Check extends JFrame implements ActionListener
{
    private JCheckBox cb1, cb2;
    private JButton judge;

    public Check()
    {
        super();
        this.cb1 = new JCheckBox("数学が得意");
        this.cb2 = new JCheckBox("英語が得意", true);
        this.judge = new JButton("判定");

        JPanel panel1 = new JPanel();
        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.Y_AXIS);

        this.judge.addActionListener(this);

        panel1.setLayout(box1);
        panel1.add(this.cb1);
        panel1.add(this.cb2);
        panel1.add(this.judge);
        super.getContentPane().add(panel1);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.judge)
        {
            if(this.cb1.isSelected() && !(this.cb2.isSelected()))
            {
                System.out.println("いいですね！でも英語も重要ですよ！");
            }
        }
    }

    public static void main(String[] args)
    {
        Check a = new Check();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}