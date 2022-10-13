import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppTest4 extends JFrame implements ActionListener
{
    private JButton button;

    public AppTest4()
    {
        super();
        this.button = new JButton("hello");
        super.getContentPane().add(this.button);
        this.button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.button)
        {
            System.out.println("world!");
            this.button.setText("success");
        }
    }

    public static void main(String[] args)
    {
        AppTest4 a = new AppTest4();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}