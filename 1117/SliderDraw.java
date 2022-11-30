import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDraw extends JFrame implements ChangeListener
{
    private DrawPanel dp;
    private JSlider slider1,slider2;
    private JTextField tf1,tf2,tf3,tf4;

    public SliderDraw()
    {
        this.dp = new DrawPanel();
        this.slider1 = new JSlider();
        this.slider1.addChangeListener(this);
        this.tf1 = new JTextField(2);
        this.tf1.setEditable(false);
        this.tf1.setText("縦");
        this.tf2 = new JTextField(3);
        this.tf2.setEditable(false);

        this.slider2 = new JSlider();
        this.slider2.addChangeListener(this);
        this.tf3 = new JTextField(2);
        this.tf3.setEditable(false);
        this.tf3.setText("横");
        this.tf4 = new JTextField(3);
        this.tf4.setEditable(false);

        JPanel panel1 = new JPanel();
        panel1.add(this.tf1);
        panel1.add(this.slider1);
        panel1.add(this.tf2);

        JPanel panel2 = new JPanel();
        panel2.add(this.tf3);
        panel2.add(this.slider2);
        panel2.add(this.tf4);

        JPanel panel = new JPanel();
        BoxLayout box1 = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(box1);
        panel.add(this.dp);
        panel.add(panel1);
        panel.add(panel2);

        super.getContentPane().add(panel);
    }

    public void stateChanged(ChangeEvent e)
    {
        if(e.getSource() == this.slider1)
        {
            int value = this.slider1.getValue();
            this.tf2.setText("" + value);
            this.dp.setVerticalSize(value);
            this.dp.repaint();
        }
        if(e.getSource() == this.slider2)
        {
            int value = this.slider2.getValue();
            this.tf4.setText("" + value);
            this.dp.setBesideSize(value);
            this.dp.repaint();
        }
    }

    public static void main(String[] args)
    {
        SliderDraw a = new SliderDraw();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}