import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class DoubleDrawFrame extends JFrame implements ActionListener, ChangeListener
{
    private DoubleDrawPanel dp;
    private JSlider slider1, slider2, slider3;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    private JRadioButton rb1, rb2;
    private JButton bt1;


    public DoubleDrawFrame()
    {
        this.dp = new DoubleDrawPanel();

        this.rb1 = new JRadioButton("ペン", true);
        this.rb2 = new JRadioButton("スタンプ");
        ButtonGroup group = new ButtonGroup();
        group.add(this.rb1);
        group.add(this.rb2);
        this.rb1.addActionListener(this);
        this.rb2.addActionListener(this);
        this.bt1 = new JButton("決定");
        this.bt1.addActionListener(this);
        this.bt1 = new JButton("初期化");
        this.bt1.addActionListener(this);

        this.tf1 = new JTextField(2);
        this.tf1.setEditable(false);
        this.tf1.setText("赤");
        this.slider1 = new JSlider(0, 255, 0);
        this.slider1.addChangeListener(this);
        this.tf2 = new JTextField(3);
        this.tf2.setEditable(false);
        this.tf2.setText("0");

        this.tf3 = new JTextField(2);
        this.tf3.setEditable(false);
        this.tf3.setText("緑");
        this.slider2 = new JSlider(0, 255, 0);
        this.slider2.addChangeListener(this);
        this.tf4 = new JTextField(3);
        this.tf4.setEditable(false);
        this.tf4.setText("0");

        this.tf5 = new JTextField(2);
        this.tf5.setEditable(false);
        this.tf5.setText("青");
        this.slider3 = new JSlider(0, 255, 0);
        this.slider3.addChangeListener(this);
        this.tf6 = new JTextField(3);
        this.tf6.setEditable(false);
        this.tf6.setText("0");

        JPanel panel1 = new JPanel();
        panel1.add(this.rb1);
        panel1.add(this.rb2);
        panel1.add(this.bt1);
        JPanel panel2 = new JPanel();
        panel2.add(this.tf1);
        panel2.add(this.slider1);
        panel2.add(this.tf2);
        JPanel panel3 = new JPanel();
        panel3.add(this.tf3);
        panel3.add(this.slider2);
        panel3.add(this.tf4);
        JPanel panel4 = new JPanel();
        panel4.add(this.tf5);
        panel4.add(this.slider3);
        panel4.add(this.tf6);
        JPanel proPanel = new JPanel();
        BoxLayout box = new BoxLayout(proPanel, BoxLayout.Y_AXIS);
        proPanel.setLayout(box);
        proPanel.add(panel1);
        proPanel.add(panel2);
        proPanel.add(panel3);
        proPanel.add(panel4);
        JPanel panel = new JPanel();
        panel.add(this.dp);
        panel.add(proPanel);

        super.getContentPane().add(panel);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.rb1)
        {
            this.dp.setPen();
        }
        if(e.getSource() == this.rb2)
        {
            this.dp.setStamp();
        }
        if(e.getSource() == this.bt1)
        {
            this.dp.setReset();
        }
    }

    public void stateChanged(ChangeEvent e)
    {
        if(e.getSource() == this.slider1)
        {
            int value = this.slider1.getValue();
            this.tf2.setText("" + value);
            this.dp.setRed(value);
        }
        if(e.getSource() == this.slider2)
        {
            int value = this.slider2.getValue();
            this.tf4.setText("" + value);
            this.dp.setGreen(value);
        }
        if(e.getSource() == this.slider3)
        {
            int value = this.slider3.getValue();
            this.tf6.setText("" + value);
            this.dp.setBlue(value);
        }

    }

    public static void main(String[] args)
    {
        DoubleDrawFrame a = new DoubleDrawFrame();
        a.setSize(640, 680);
        a.setLocation(100,100);
        a.setVisible(true);
    }

}