class XYVectorApp
{
    public static void main(String[] args)
    {
        double kotae;
        XYVector a,b;
        a = new XYVector();
        b = new XYVector();

        a.x = Double.parseDouble(args[0]);
        a.y = Double.parseDouble(args[1]);
        b.x = Double.parseDouble(args[2]);
        b.y = Double.parseDouble(args[3]);

        a.print();
        kotae = a.norm();
        System.out.println(kotae);
        in(a,b);
        puls(a,b);
    }

    static void in(XYVector a, XYVector b)//内積(inner product)
    {
        double kotae;
        kotae = a.x*b.x + a.y*b.y;
        System.out.println(kotae);
    }

    static void puls(XYVector a, XYVector b)
    {
        XYVector c;
        c = new XYVector();
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.print();
    }
}