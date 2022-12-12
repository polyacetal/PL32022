import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StampPanel extends JPanel implements MouseListener
{
    public StampPanel()
    {
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(new Color(255, 255, 100));
        g.fillOval(220, 50, 200, 250);
        g.setColor(new Color(0, 0, 0));
        g.drawString("stamp",305,175);
    }

    public void mousePressed(MouseEvent e)  // マウスボタンが押されたとき
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("x=" + x + "\ny=" + y);
        this.stamp(x,y);
    }
    public void mouseReleased(MouseEvent e) { } // マウスボタンが離されたとき
    public void mouseClicked(MouseEvent e) { }  // マウスボタンがクリックされた(押して離された)とき
    public void mouseEntered(MouseEvent e) { }  // マウスカーソルが部品内に入ったとき
    public void mouseExited(MouseEvent e) { }   // マウスカーソルが部品外に出たとき

    public void stamp(int x, int y)
    {
        Graphics g = this.getGraphics();
        g.setColor(new Color(0, 0, 0));
        g.drawRect(x - 50, y - 50, 100, 100);
        g.fillRect(x, y - 50, 50, 50);
        g.fillRect(x - 50, y, 50, 50);
        g.dispose();
    }
}