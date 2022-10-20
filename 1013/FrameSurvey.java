import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameSurvey extends JFrame implements ActionListener
{
    private JButton button1;
    private JButton button2;
    private JLabel label1;

    public FrameSurvey()
    {
        super();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.Y_AXIS);
        GridLayout grid1 = new GridLayout(1, 2);
        this.label1 = new JLabel("Hello");
        panel1.setLayout(box1);
        panel1.add(this.label1);
        panel1.add(panel2);
        panel2.setLayout(grid1);
        this.button1 = new JButton("押してね");
        this.button1.addActionListener(this);
        this.button2 = new JButton("押さないでね");
        panel2.add(this.button1);
        panel2.add(this.button2);
        super.getContentPane().add(panel1);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.button1)
        {
            System.out.println("success");
            this.button1.setText("world!");
        }
    }

    public static void main(String[] args)
    {
        FrameSurvey a = new FrameSurvey();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}