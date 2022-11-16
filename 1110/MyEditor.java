import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyEditor extends JFrame implements ActionListener
{
    private JButton load, save;
    private JTextField tf1, states;
    private JTextArea ta1;

    public MyEditor()
    {
        super();
        this.tf1 = new JTextField(26);
        this.load = new JButton("開く");
        this.load.addActionListener(this);
        this.save = new JButton("保存");
        this.save.addActionListener(this);
        this.ta1 =new JTextArea(26,52);
        this.states = new JTextField(26);
        this.states.setEditable(false);

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
        panel2.add(ta1);
        panel2.add(states);
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
            this.states.setText("file read success");
        }
        catch(IOException exception)
        {
            this.states.setText("file read error");
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
            this.states.setText("file write success");
        }
        catch(IOException exception)
        {
            this.states.setText("file write error");
        }
    }

    public void setFileName(String file)
    {
        this.tf1.setText(file);
    }

    public static void main(String[] args)
    {
        MyEditor a = new MyEditor();
        a.setSize(640, 480);
        a.setLocation(100, 100);
        a.setVisible(true);
        if(args.length == 1)
        {
            a.loadFile(args[0]);
            a.setFileName(args[0]);
        }
    }
}