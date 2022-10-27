import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio extends JFrame implements ActionListener
{
    private JRadioButton rb1, rb2, rb3;
    private JButton kettei;

    public Radio()
    {
        super();
        this.rb1 = new JRadioButton("就職");
        this.rb2 = new JRadioButton("専攻科進学");
        this.rb3 = new JRadioButton("大学編入", true);
        
        ButtonGroup group = new ButtonGroup();
        group.add(this.rb1);
        group.add(this.rb2);
        group.add(this.rb3);

        this.kettei = new JButton("進路決定");
        this.kettei.addActionListener(this);

        JPanel panel1 = new JPanel();
        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.Y_AXIS);
        panel1.setLayout(box1);
        panel1.add(this.rb1);
        panel1.add(this.rb2);
        panel1.add(this.rb3);
        panel1.add(this.kettei);
        super.getContentPane().add(panel1);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.kettei)
        {
            if(this.rb1.isSelected())
            {
                System.out.println("実習系科目には特にしっかり取り組みましょう！");
            }
        }
    }

    public static void main(String[] args)
    {
        Radio a = new Radio();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}