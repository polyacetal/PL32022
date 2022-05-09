import java.lang.Math;
class XYVector
{
    double x;
    double y;

    XYVector(double a, double b)
    {
        x = a;
        y = b;
    }

    void print()
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

    double calcNorm()
    {
        double ans;
        ans = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return ans;
    }

    void subtract(XYVector b)
    {
        x -= b.x;
        y -= b.y;
    }
}