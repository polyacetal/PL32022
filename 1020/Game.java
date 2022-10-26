import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame implements ActionListener
{
    private JRadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    private JLabel label1;
    private Jpanel panel1, panel2, panel3, panel4;
    private JButton kettei1, kettei2;

    public Game()
    {
        super();
        this.panel1 = new JPanel();
        this.label1 = new JLabel("行き先を選んでください");
        this.rb1 = new JRadioButton("武器屋");
        this.rb2 = new JRadioButton("雑貨屋");
        this.rb3 = new JRadioButton("宿屋", true);
    
        ButtonGroup group1 = new ButtonGroup();
        group1.add(this.rb1);
        group1.add(this.rb2);
        group1.add(this.rb3);

        this.kettei1 = new JButton("決定");
        this.kettei1.addActionListener(this);

        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.Y_AXIS);
        this.panel1.setLayout(box1);
        this.panel1.add(this.rb1);
        this.panel1.add(this.rb2);
        this.panel1.add(this.rb3);
        this.panel1.add(this.kettei);


        this.panel2 = new JPanel();
        this.label2 = new JLabel("武器屋 : 購入する武器を選んでください");
        this.rb4 = new JRadioButton("片手剣", true);
        this.rb5 = new JRadioButton("両手剣");
        this.rb6 = new JRadioButton("モーニングスター");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(this.rb4);
        group2.add(this.rb5);
        group2.add(this.rb6);

        this.kettei2 = new JButton("決定");
        this.kettei2.addActionListener(this);
        
        Jpanel panel = new Jpanel();
        BoxLayout box = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(box);
        panel.add(this.panel1);
        panel.add(this.panel2);
        panel.add(this.panel3);
        panel.add(this.panel4);

        super.getContentPane().add(panel);
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
        Game a = new Game();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}