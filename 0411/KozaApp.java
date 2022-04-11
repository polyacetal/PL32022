class KozaApp
{
    public static void main(String[] args)
    {
        Koza my_koza;
        my_koza = new Koza();

        my_koza.gankin = 100000;
        double kotae;
        kotae = my_koza.risoku(3);
        System.out.println("利息は"+ kotae);

        System.exit(0);
    }
}