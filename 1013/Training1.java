import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppTest5 extends JFrame implements ActionListener
{
    private JButton button1;
    private JButton button2;

    public AppTest5()
    {
        super();
        super.getContentPane().setLayout(null);
        this.button1 = new JButton("押してね");
        this.button1.setBounds(100, 100, 200, 200);
        super.getContentPane().add(this.button1);
        this.button2 = new JButton("押さないでね");
        this.button2.setBounds(400, 100, 200, 200);
        super.getContentPane().add(this.button2);
        this.button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.button1)
        {
            System.out.println("world!");
            this.button1.setText("success");
        }
    }

    public static void main(String[] args)
    {
        AppTest5 a = new AppTest5();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}