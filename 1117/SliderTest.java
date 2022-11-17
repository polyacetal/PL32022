import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderTest extends JFrame implements ChangeListener
{
    private JSlider slider1;
    private JTextField tf1;

    public SliderTest()
    {
        this.slider1 = new JSlider();
        this.slider1.addChangeListener(this);
        this.tf1 = new JTextField(3);
        this.tf1.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(this.slider1);
        panel.add(this.tf1);

        super.getContentPane().add(panel);
    }

    public void stateChanged(ChangeEvent e)
    {
        int value = this.slider1.getValue();
        this.tf1.setText("" + value);
    }

    public static void main(String[] args)
    {
        SliderTest a = new SliderTest();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}