import java.lang.Math;
class XYVector
{
    double x;
    double y;

    XYVector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    XYVector()
    {
        this.x = 0;
        this.y = 0;
    }

    void print()
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

    void add(XYVector b) //通常メソッド
    {
        this.x += b.x;
        this.y += b.y;
    }

    static XYVector add(XYVector a, XYVector b) //staticメソッド
    {
        XYVector w = new XYVector();
        w.x = a.x + b.x;
        w.y = a.y + b.y;
        return w;
    }

    static XYVector subtract(XYVector a, XYVector b)
    {
        XYVector v = new XYVector();
        v.x = a.x - b.x;
        v.y = a.y - b.y;
        return v;
    }

    double calcNorm()
    {
        double ans;
        ans = Math.sqrt(this.x * this.x + this.y * this.y);
        return ans;
    }

    static double calcDistance(XYVector a, XYVector b)
    {
        XYVector u = XYVector.subtract(a, b);
        double ans = u.calcNorm();
        return ans;
    }
}