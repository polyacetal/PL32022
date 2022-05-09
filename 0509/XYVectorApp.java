class XYVectorApp
{
    public static void main(String[] args)
    {
        XYVector a,b;
        a = new XYVector(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        b = new XYVector(Double.parseDouble(args[2]), Double.parseDouble(args[3]));

        a.print();
        double ans = a.calcNorm();
        System.out.println("ノルムは"+ ans);
        a.subtract(b);
        a.print();
        ans = a.calcNorm();
        System.out.println("2点間の距離は"+ ans);
    }
}