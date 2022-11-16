import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyEditorRead extends JFrame implements ActionListener
{
    private JButton load;
    private JTextField tf1;
    private JTextArea ta1;

    public MyEditorRead()
    {
        super();
        this.tf1 = new JTextField(26);
        this.load = new JButton("開く");
        this.load.addActionListener(this);
        this.ta1 =new JTextArea(26,52);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.X_AXIS);
        BoxLayout box2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
        panel1.setLayout(box1);
        panel2.setLayout(box2);
        panel1.add(this.tf1);
        panel1.add(this.load);

        panel2.add(panel1);
        panel2.add(ta1);
        super.getContentPane().add(panel2);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.load)
        {
            String file = this.tf1.getText();
            this.loadFile(file);
        }
    }

    public void loadFile(String file)
    {
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String buf;
            String all = "";
            while((buf = br.readLine()) != null)
            {
                all += buf;
                all += System.getProperty("line.separator");
            }
            this.ta1.setText(all);
            br.close();
            fr.close();
        }
        catch(IOException exception)
        {
            this.tf1.setText("file read error");
        }
    }

    public static void main(String[] args)
    {
        MyEditorRead a = new MyEditorRead();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}