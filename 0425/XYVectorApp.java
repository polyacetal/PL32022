class XYVectorApp
{
    public static void main(String[] args)
    {
        double kotae;
        XYVector a,b,c;
        a = new XYVector();
        b = new XYVector();
        c = new XYVector();

        a.x = Double.parseDouble(args[0]);
        a.y = Double.parseDouble(args[1]);
        b.x = Double.parseDouble(args[2]);
        b.y = Double.parseDouble(args[3]);

        System.out.println("aのベクトル :");
        a.print();
        kotae = a.norm();
        System.out.print("aのベクトルのノルム : ");
        System.out.println(kotae);
        kotae = XYVectorClac.in(a,b);
        System.out.print("aベクトルとbベクトルの内積 : ");
        System.out.println(kotae);
        XYVectorClac.puls(a,b,c);
        System.out.println("aベクトルとbベクトルの和 :");
        c.print();
        XYVectorClac.minu(a,b,c);
        System.out.println("aベクトルとbベクトルの差 :");
        c.print();
    }
}