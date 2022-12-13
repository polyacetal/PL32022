import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;

public class DoubleDrawPanel extends JPanel implements MouseListener, MouseMotionListener
{
    private int beforeX;
    private int beforeY;
    private int red;
    private int green;
    private int blue;
    private boolean pen;
    private boolean stamp;
    private BufferedImage buff;

    public DoubleDrawPanel()
    {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        this.pen = true;
        this.stamp = false;
        super.setBackground(Color.white);
        super.setPreferredSize(new Dimension(640,480));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.buff = new BufferedImage(640, 480, BufferedImage.TYPE_INT_ARGB);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(this.buff, 0, 0, this);
    }

    public void mousePressed(MouseEvent e)  // マウスボタンが押されたとき
    {
        if(this.pen)
        {
            this.beforeX = e.getX();
            this.beforeY = e.getY();
            System.out.println("x=" + beforeX + "\ny=" + beforeY);
        }
        if(this.stamp)
        {
            int x = e.getX();
            int y = e.getY();
            System.out.println("x=" + x + "\ny=" + y);
            this.itimatuStamp(x, y);
        }
    }
    public void mouseReleased(MouseEvent e) { } // マウスボタンが離されたとき
    public void mouseClicked(MouseEvent e) { }  // マウスボタンがクリックされた(押して離された)とき
    public void mouseEntered(MouseEvent e) { }  // マウスカーソルが部品内に入ったとき
    public void mouseExited(MouseEvent e) { }   // マウスカーソルが部品外に出たとき
    public void mouseDragged(MouseEvent e) {
        if(this.pen)
        {
            int x = e.getX();
            int y = e.getY();
            Graphics g = this.buff.getGraphics();
            g.setColor(new Color(this.red, this.green, this.blue));
            g.drawLine(beforeX,beforeY,x,y);
            System.out.println("x=" + x + "\ny=" + y);
            g.dispose();
            this.repaint();
            this.beforeX = x;
            this.beforeY = y;
        }
    }
    public void mouseMoved(MouseEvent e) { }

    public void itimatuStamp(int x, int y)
    {
        Graphics g = this.buff.getGraphics();
        g.setColor(new Color(this.red, this.green, this.blue));
        g.drawRect(x - 50, y - 50, 100, 100);
        g.fillRect(x, y - 50, 50, 50);
        g.fillRect(x - 50, y, 50, 50);
        g.dispose();
        this.repaint();
    }

    public void setRed(int red)
    {
        this.red = red;
    }
    public void setGreen(int green)
    {
        this.green = green;
    }
    public void setBlue(int blue)
    {
        this.blue = blue;
    }
    public void setPen()
    {
        this.pen = true;
        this.stamp = false;
    }
    public void setStamp()
    {
        this.pen = false;
        this.stamp = true;
    }
    public void setReset()
    {
        Graphics g = this.buff.getGraphics();
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, 639, 479);
        g.dispose();
        this.repaint();
    }
}