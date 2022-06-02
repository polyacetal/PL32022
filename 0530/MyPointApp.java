class MyPointApp
{
    public static void main(String[] args)
    {
        int x,y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        MyPoint mp;
        mp = new MyPoint(x, y);

        mp.print();
    }
}