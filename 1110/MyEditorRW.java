import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyEditorRW extends JFrame implements ActionListener
{
    private JButton load,save;
    private JTextField tf1;
    private JTextArea ta1;

    public MyEditorRW()
    {
        super();
        this.tf1 = new JTextField(26);
        this.load = new JButton("開く");
        this.save = new JButton("保存");
        this.load.addActionListener(this);
        this.save.addActionListener(this);
        this.ta1 =new JTextArea(26,52);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        BoxLayout box1 = new BoxLayout(panel1,BoxLayout.X_AXIS);
        BoxLayout box2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
        panel1.setLayout(box1);
        panel2.setLayout(box2);
        panel1.add(this.tf1);
        panel1.add(this.load);
        panel1.add(this.save);

        panel2.add(panel1);
        panel2.add(this.ta1);
        super.getContentPane().add(panel2);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.load)
        {
            String file = this.tf1.getText();
            this.loadFile(file);
        }
        if(e.getSource() == this.save)
        {
            String file = this.tf1.getText();
            String buf = this.ta1.getText();
            this.saveFile(file, buf);
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

    public void saveFile(String file, String buf)
    {
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(buf);
            bw.close();
            fw.close();
        }
        catch(IOException exception)
        {
            this.tf1.setText("file write error");
        }
    }

    public static void main(String[] args)
    {
        MyEditorRW a = new MyEditorRW();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
    }
}