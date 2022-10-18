import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Training2 extends JFrame implements ActionListener
{
    private JButton button1;
    private JButton button2;
    private JLabel label1;

    public Training2()
    {
        super();
        JPanel panel1 = new JPanel();
        FlowLayout flow1 = new FlowLayout();
        this.label1 = new JLabel("Hello");
        this.button1 = new JButton("押してね");
        this.button1.addActionListener(this);
        this.button2 = new JButton("押さないでね");
        panel1.add(this.label1);
        panel1.add(this.button1);
        panel1.add(this.button2);
        super.getContentPane().add(panel1);
        panel1.setLayout(flow1);
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
        Training2 a = new Training2();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}