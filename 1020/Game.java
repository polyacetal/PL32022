import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame implements ActionListener
{
    private JRadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    private JCheckBox cb1, cb2, cb3;
    private JLabel label1, label2, label3, label4;
    private JPanel panel1, panel2, panel3, panel4;
    private JButton kettei1, kettei2, kettei3, sleep;

    public Game()
    {
        super();

        //------------1つ目の画面---------------
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
        this.panel1.add(this.kettei1);
        //------------------------------------

        //------------2つ目の画面---------------
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
        BoxLayout box2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
        this.panel2.setLayout(box2);
        this.panel2.add(this.rb4);
        this.panel2.add(this.rb5);
        this.panel2.add(this.rb6);
        this.panel2.add(this.kettei2);
        panel2.setEnabled(false);
        panel2.setVisible(false);
        //------------------------------------
        
        //------------3つ目の画面---------------
        this.panel3 = new JPanel();
        this.label3 = new JLabel("雑貨屋 : 購入するアイテムを選んでください");
        this.cb1 = new JCheckBox("薬草", true);
        this.cb2 = new JCheckBox("魔法の小瓶");
        this.cb3 = new JCheckBox("キメラの翼");

        this.kettei3 = new JButton("決定");
        this.kettei3.addActionListener(this);
        BoxLayout box3 = new BoxLayout(panel3,BoxLayout.Y_AXIS);
        this.panel3.setLayout(box3);
        this.panel3.add(this.cb1);
        this.panel3.add(this.cb2);
        this.panel3.add(this.cb3);
        this.panel3.add(this.kettei3);
        panel3.setEnabled(false);
        panel3.setVisible(false);
        //------------------------------------

        //------------4つ目の画面---------------
        this.panel4 = new JPanel();
        this.label3 = new JLabel("宿屋 : 宿に泊まり1日が終了します");

        this.sleep = new JButton("宿に泊まる");
        this.sleep.addActionListener(this);
        BoxLayout box4 = new BoxLayout(panel4,BoxLayout.Y_AXIS);
        this.panel4.setLayout(box4);
        this.panel4.add(this.sleep);
        panel4.setEnabled(false);
        panel4.setVisible(false);
        //------------------------------------

        JPanel panel = new JPanel();
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
        if(e.getSource() == this.kettei1)
        {
            if(this.rb1.isSelected())
            {
                System.out.println("武器屋に移動");
                panel1.setEnabled(false);
                panel1.setVisible(false);
                panel2.setEnabled(true);
                panel2.setVisible(true);
            }
            else if(this.rb2.isSelected())
            {
                System.out.println("雑貨屋に移動");
                panel1.setEnabled(false);
                panel1.setVisible(false);
                panel3.setEnabled(true);
                panel3.setVisible(true);
            }
            else if(this.rb3.isSelected())
            {
                System.out.println("宿屋に移動");
                panel1.setEnabled(false);
                panel1.setVisible(false);
                panel4.setEnabled(true);
                panel4.setVisible(true);
            }
        }
        else if(e.getSource() == this.kettei2)
        {
            if(this.rb4.isSelected())
            {
                System.out.println("片手剣を購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel2.setEnabled(false);
                panel2.setVisible(false);
            }
            else if(this.rb5.isSelected())
            {
                System.out.println("両手剣を購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel2.setEnabled(false);
                panel2.setVisible(false);
            }
            else if(this.rb6.isSelected())
            {
                System.out.println("モーニングスターを購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel2.setEnabled(false);
                panel2.setVisible(false);
            }
        }
        else if(e.getSource() == this.kettei3)
        {
            if(this.cb1.isSelected())
            {
                System.out.println("薬草を購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel3.setEnabled(false);
                panel3.setVisible(false);
            }
            if(this.cb2.isSelected())
            {
                System.out.println("魔法の小瓶を購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel3.setEnabled(false);
                panel3.setVisible(false);
            }
            if(this.cb3.isSelected())
            {
                System.out.println("キメラの翼を購入");
                panel1.setEnabled(true);
                panel1.setVisible(true);
                panel3.setEnabled(false);
                panel3.setVisible(false);
            }
        }
        else if(e.getSource() == this.sleep)
        {
            System.out.println("ぐっすりと寝て夜が明けた");
            panel1.setEnabled(true);
            panel1.setVisible(true);
            panel4.setEnabled(false);
            panel4.setVisible(false);
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