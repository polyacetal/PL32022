import java.lang.Math;
class XYVector
{
    double x;
    double y;

    void print()
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

    double norm()
    {
        double kotae;
        kotae = Math.pow((Math.pow(x,2) + Math.pow(y,2)),0.5);
        return (kotae);
    }
}