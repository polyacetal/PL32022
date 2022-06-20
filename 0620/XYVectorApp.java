class XYVectorApp
{
    public static void main(String[] args)
    {
        XYVector a = new XYVector(3.14, 2.17);
        XYVector b = new XYVector(-0.5, 0.5);
        XYVector c = XYVector.add(a, b);

        c.print();

        XYVector d = new XYVector(3.14, 2.17);
        XYVector e = new XYVector(-0.5, 0.5);
        XYVector f = XYVector.subtract(d, e);

        f.print();

        XYVector g = new XYVector(3.14, 2.17);
        XYVector h = new XYVector(-0.5, 0.5);
        double dist = XYVector.calcDistance(g, h);
        System.out.println(dist);
    }
}