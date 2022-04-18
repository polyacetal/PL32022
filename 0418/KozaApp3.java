class KozaApp3
{
    public static void main(String[] args)
    {
        Koza my_koza;
        my_koza = new Koza();

        my_koza.gankin = Integer.parseInt(args[0]);
        double kotae;
        for(int i = 1; i <= 36; i++){
            kotae = my_koza.risoku(i);
            System.out.println(i+"ヶ月目の利息は"+ kotae);
        }
        System.exit(0);
    }

    int goal(int )
    {
        
    }
}